package com.badlogic.gdx.jnigen.pointer;

import com.badlogic.gdx.jnigen.CHandler;

public abstract class Struct extends StackElement {

    protected Struct(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    protected Struct(int size) {
        super(size);
    }

    @Override
    public boolean hasElementOffsets() {
        return true;
    }
}
