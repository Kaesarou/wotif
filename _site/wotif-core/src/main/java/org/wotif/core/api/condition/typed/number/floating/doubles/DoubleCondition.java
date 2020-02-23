package org.wotif.core.api.condition.typed.number.floating.doubles;

import org.wotif.core.api.CompletableResult;
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
