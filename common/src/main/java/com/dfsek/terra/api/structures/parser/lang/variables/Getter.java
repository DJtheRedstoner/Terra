package com.dfsek.terra.api.structures.parser.lang.variables;

import com.dfsek.terra.api.math.vector.Location;
import com.dfsek.terra.api.platform.world.Chunk;
import com.dfsek.terra.api.structures.parser.lang.Returnable;
import com.dfsek.terra.api.structures.tokenizer.Position;

public class Getter implements Returnable<Object> {
    private final Variable<?> delegate;

    public Getter(Variable<?> delegate) {
        this.delegate = delegate;
    }

    @Override
    public ReturnType returnType() {
        return delegate.getType();
    }

    @Override
    public Object apply(Location location) {
        return delegate.getValue();
    }

    @Override
    public Object apply(Location location, Chunk chunk) {
        return delegate.getValue();
    }

    @Override
    public Position getPosition() {
        return delegate.getPosition();
    }
}