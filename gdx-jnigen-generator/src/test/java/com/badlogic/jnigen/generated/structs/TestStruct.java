package com.badlogic.jnigen.generated.structs;

import com.badlogic.gdx.jnigen.CHandler;
import com.badlogic.gdx.jnigen.pointer.Struct;
import com.badlogic.gdx.jnigen.pointer.StructPointer;
import com.badlogic.jnigen.generated.FFITypes;

public final class TestStruct extends Struct {

    /*JNI
#include <jnigen.h>
*/
    private final static long __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getFFIType(10);
        CHandler.calculateAlignmentAndSizeForType(__ffi_type);
        __size = CHandler.getSizeFromFFIType(__ffi_type);
        CHandler.registerStructFFIType(TestStruct.class, __ffi_type);
        CHandler.registerPointingSupplier(TestStruct.class, TestStruct::new);
        CHandler.registerNewStructPointerSupplier(TestStruct.class, TestStruct.Pointer::new);
        CHandler.registerStructPointer(TestStruct.class, TestStruct.Pointer::new);
        CHandler.registerPointingSupplier(TestStruct.Pointer.class, TestStruct.Pointer::new);
    }

    public TestStruct(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public TestStruct() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public long field1() {
        return (long) CHandler.getStructField(getPointer(), __ffi_type, 0);
    }

    public void field1(long field1) {
        CHandler.setStructField(getPointer(), __ffi_type, 0, field1);
    }

    public long field2() {
        return (long) CHandler.getStructField(getPointer(), __ffi_type, 1);
    }

    public void field2(long field2) {
        CHandler.setStructField(getPointer(), __ffi_type, 1, field2);
    }

    public char field3() {
        return (char) CHandler.getStructField(getPointer(), __ffi_type, 2);
    }

    public void field3(char field3) {
        CHandler.setStructField(getPointer(), __ffi_type, 2, field3);
    }

    public char field4() {
        return (char) CHandler.getStructField(getPointer(), __ffi_type, 3);
    }

    public void field4(char field4) {
        CHandler.setStructField(getPointer(), __ffi_type, 3, field4);
    }

    public static final class Pointer extends StructPointer<TestStruct> {

        public Pointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public Pointer() {
            super(__size);
        }

        public long getSize() {
            return __size;
        }

        public Class<TestStruct> getStructClass() {
            return TestStruct.class;
        }
    }
}
