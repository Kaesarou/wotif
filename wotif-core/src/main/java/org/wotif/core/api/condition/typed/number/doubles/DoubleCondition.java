package org.wotif.core.api.condition.typed.number.doubles;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.typed.number.AbstractNumberCondition;

public class DoubleCondition extends AbstractNumberCondition<Double> implements IDoubleCondition {

    public DoubleCondition(Double term) {
        super(term);
    }

    @Override
    protected Double zero() {
        return (double) 0;
    }

    @Override
    public CompletableConditionResult isCloseTo(Integer expected) {
        long round = Math.round(this.term.value());
        long converted = Long.valueOf(expected);
        boolean value = round == converted;
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNotCloseTo(Integer expected) {
        long round = Math.round(this.term.value());
        long converted = Long.valueOf(expected);
        boolean value = round != converted;
        return new CompletableConditionResult(value);
    }
}
