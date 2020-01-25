package org.wotif.core.api.condition.typed.number.floating.floats;

import org.wotif.core.api.CompletableConditionResult;
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
    public CompletableConditionResult isNumber() {
        return new CompletableConditionResult(!this.term.value().isNaN());
    }

    @Override
    public CompletableConditionResult isNaN() {
        return new CompletableConditionResult(this.term.value().isNaN());
    }

    @Override
    public CompletableConditionResult isInfinite() {
        return new CompletableConditionResult(this.term.value().isInfinite());
    }

    @Override
    public CompletableConditionResult isFinite() {
        return new CompletableConditionResult(!this.term.value().isInfinite());
    }

}
