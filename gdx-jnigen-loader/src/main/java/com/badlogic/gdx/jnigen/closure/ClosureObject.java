package com.badlogic.gdx.jnigen.closure;

import com.badlogic.gdx.jnigen.CHandler;
import com.badlogic.gdx.jnigen.pointer.Pointing;

public final class ClosureObject<T extends Closure> extends Pointing {

    private final long fnPtr;


    public static <T extends Closure> ClosureObject<T> fromClosure(T object) {
        return CHandler.createClosureForObject(object);
    }

    public ClosureObject(long fnPtr, long closurePtr, boolean freeOnGC) {
        super(closurePtr, freeOnGC);
        this.fnPtr = fnPtr;
    }

    @Override
    public void free() {
        CHandler.freeClosure(getPointer());
    }

    public long getFnPtr() {
        return fnPtr;
    }
}
