package com.badlogic.gdx.jnigen.pointer;

import com.badlogic.gdx.jnigen.CHandler;

public abstract class Struct extends Pointing {

    protected Struct(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    protected Struct(int size) {
        super(size, true, true);
    }

    public <T extends Struct> StructPointer<T> asPointer() {
        //noinspection unchecked
        return (StructPointer<T>)CHandler.getStructPointer(getClass()).create(getPointer(), getsGCFreed());
    }

    public abstract long getSize();

    public abstract long getFFIType();
}
