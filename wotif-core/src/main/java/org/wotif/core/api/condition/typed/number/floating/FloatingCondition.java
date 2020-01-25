package org.wotif.core.api.condition.typed.number.floating;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.typed.number.AbstractNumberCondition;

public abstract class FloatingCondition<FLOATING extends Number & Comparable<FLOATING>>
        extends AbstractNumberCondition<FLOATING> implements IFloatingCondition<FLOATING> {

    public FloatingCondition(FLOATING term) {
        super(term);
    }

    protected abstract long round();

    @Override
    protected abstract FLOATING zero();

    @Override
    public CompletableConditionResult isCloseTo(Integer expected) {
        long converted = Long.valueOf(expected);
        boolean value = round() == converted;
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNotCloseTo(Integer expected) {
        long converted = Long.valueOf(expected);
        boolean value = round() != converted;
        return new CompletableConditionResult(value);
    }
}
