package org.wotif.core.api.condition.typed.number.doubles;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.number.AbstractNumberCondition;

public class DoubleCondition extends AbstractNumberCondition<Double> implements IDoubleCondition{

    public DoubleCondition(Double term) { super(term); }

    @Override
    protected Double zero() { return (double) 0; }

    @Override
    public CompletableResult isNearTo(Integer expected) {
        return null;
    }

    @Override
    public CompletableResult isNotNearTo(Integer expected) {
        return null;
    }
}
