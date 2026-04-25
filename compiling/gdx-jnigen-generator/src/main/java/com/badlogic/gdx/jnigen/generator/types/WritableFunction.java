package com.badlogic.gdx.jnigen.generator.types;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

import java.util.HashMap;

public interface WritableFunction {

    FunctionSignature getSignature();

    void write(CompilationUnit cu, ClassOrInterfaceDeclaration wrappingClass,
               HashMap<MethodDeclaration, String> patchNativeMethods);
}
