package org.wotif.core.api.condition.typed.number.floating.doubles;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.typed.number.floating.FloatingCondition;
import org.wotif.core.api.condition.typed.number.floating.IFloatingCondition;

public class DoubleCondition extends FloatingCondition<Double> implements IFloatingCondition<Double> {

    public DoubleCondition(Double term) {
        super(term);
    }

    @Override
    protected Double zero() {
        return (double) 0;
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
