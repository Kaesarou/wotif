package org.wotif.core.api.condition.typed.number.doubles;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.number.AbstractNumberCondition;

public class DoubleCondition extends AbstractNumberCondition<Double> implements IDoubleCondition{

    public DoubleCondition(Double term) { super(term); }

    @Override
    protected Double zero() { return (double) 0; }

    @Override
    public CompletableResult isCloseTo(Integer expected) {
        long round = Math.round(this.term.value());
        long converted = Long.valueOf(expected);
        boolean value = round == converted;
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotCloseTo(Integer expected) {
        long round = Math.round(this.term.value());
        long converted = Long.valueOf(expected);
        boolean value = round != converted;
        return new CompletableResult(value);
    }
}
