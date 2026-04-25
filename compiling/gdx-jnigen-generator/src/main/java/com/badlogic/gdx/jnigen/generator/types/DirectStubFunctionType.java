package com.badlogic.gdx.jnigen.generator.types;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;

import java.util.HashMap;
import java.util.List;

public class DirectStubFunctionType implements WritableFunction {

    private final String name;
    private final FunctionSignature signature;
    private final MappedType host;

    public DirectStubFunctionType(FunctionSignature signature, MappedType parent, MappedType host) {
        this.signature = signature;
        this.host = host;

        if (parent instanceof GlobalType)
            name = signature.getName() + "_direct";
        else
            name = parent.abstractType() + "_" + signature.getName() + "_direct";
    }

    @Override
    public FunctionSignature getSignature() {
        return signature;
    }

    @Override
    public void write(CompilationUnit cu, ClassOrInterfaceDeclaration wrappingClass,
                      HashMap<MethodDeclaration, String> patchNativeMethods) {
        TypeDefinition returnType = signature.getReturnType();
        NamedType[] arguments = signature.getArguments();
        boolean isStackReturn = returnType.getTypeKind().isStackElement();

        MethodDeclaration directNative = wrappingClass.addMethod(name,
                Keyword.PUBLIC, Keyword.STATIC, Keyword.NATIVE);
        directNative.setBody(null);
        directNative.addParameter(long.class, "fnPtr");

        if (isStackReturn || returnType.getTypeKind() == TypeKind.VOID) {
            directNative.setType(void.class);
        } else {
            directNative.setType(returnType.getMappedType().primitiveType());
        }

        for (NamedType arg : arguments) {
            directNative.addParameter(arg.getDefinition().getMappedType().primitiveType(), arg.getName());
        }
        if (isStackReturn) {
            directNative.addParameter(long.class, "_retPar");
        }

        StringBuilder fnSigArgs = new StringBuilder();
        StringBuilder fnArgExprs = new StringBuilder();
        for (int i = 0; i < arguments.length; i++) {
            NamedType arg = arguments[i];
            String argType = arg.getDefinition().getTypeName();
            if (i > 0) {
                fnSigArgs.append(", ");
                fnArgExprs.append(", ");
            }
            fnSigArgs.append(argType);
            if (arg.getDefinition().getTypeKind().isStackElement()) {
                fnArgExprs.append("*(").append(argType).append("*)").append(arg.getName());
            } else {
                fnArgExprs.append("(").append(argType).append(")").append(arg.getName());
            }
        }

        String retTypeName = returnType.getTypeName();
        StringBuilder nativeBody = new StringBuilder();

        if (returnType.getTypeKind() == TypeKind.VOID) {
            nativeBody.append("((void(*)(").append(fnSigArgs).append("))fnPtr)(")
                    .append(fnArgExprs).append(");");
        } else if (isStackReturn) {
            nativeBody.append("*(").append(retTypeName).append("*)_retPar = ((")
                    .append(retTypeName).append("(*)(").append(fnSigArgs).append("))fnPtr)(")
                    .append(fnArgExprs).append(");");
        } else {
            String primRet = returnType.getMappedType().primitiveType();
            nativeBody.append("return (j").append(primRet).append(")((")
                    .append(retTypeName).append("(*)(").append(fnSigArgs).append("))fnPtr)(")
                    .append(fnArgExprs).append(");");
        }

        for (int i = 0; i < arguments.length; i++) {
            NamedType arg = arguments[i];
            TypeKind kind = arg.getDefinition().getTypeKind();
            if (kind.isPrimitive() && kind != TypeKind.FLOAT && kind != TypeKind.DOUBLE) {
                String returnStmt = (returnType.getTypeKind() == TypeKind.VOID || isStackReturn)
                        ? "return" : "return 0";
                nativeBody.insert(0, "CHECK_AND_THROW_C_TYPE(env, "
                        + arg.getDefinition().getTypeName() + ", " + arg.getName() + ", " + i
                        + ", " + returnStmt + ");\n");
            }
        }

        nativeBody.insert(0, "HANDLE_JAVA_EXCEPTION_START()\n");
        nativeBody.append("\nHANDLE_JAVA_EXCEPTION_END()");
        if (returnType.getTypeKind() != TypeKind.VOID && !isStackReturn) {
            nativeBody.append("\nreturn 0;");
        }

        patchNativeMethods.put(directNative, nativeBody.toString());
    }

    public MethodCallExpr buildCall(List<Expression> args) {
        MethodCallExpr call = new MethodCallExpr(name);
        call.setScope(new NameExpr(host.abstractType()));
        for (Expression arg : args) {
            call.addArgument(arg);
        }
        return call;
    }
}
