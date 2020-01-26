package org.wotif.core.api.condition.typed.number.floating.floats;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.number.floating.FloatingCondition;
import org.wotif.core.api.condition.typed.number.floating.IFloatingCondition;

public class FloatCondition extends FloatingCondition<Float> implements IFloatingCondition<Float> {

    public FloatCondition(Float term) {
        super(term);
    }

    @Override
    protected Float zero() {
        return (float) 0;
    }

    @Override
    public long round() {
        return Math.round(this.term.value());
    }

    @Override
    public CompletableResult isNumber() {
        return new CompletableResult(!this.term.value().isNaN());
    }

    @Override
    public CompletableResult isNaN() {
        return new CompletableResult(this.term.value().isNaN());
    }

    @Override
    public CompletableResult isInfinite() {
        return new CompletableResult(this.term.value().isInfinite());
    }

    @Override
    public CompletableResult isFinite() {
        return new CompletableResult(!this.term.value().isInfinite());
    }

}
