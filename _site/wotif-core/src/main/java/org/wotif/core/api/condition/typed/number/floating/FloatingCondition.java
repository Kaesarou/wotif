package org.wotif.core.api.condition.typed.number.floating;

import org.wotif.core.api.CompletableResult;
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
    public CompletableResult isCloseTo(Integer expected) {
        long converted = Long.valueOf(expected);
        boolean value = round() == converted;
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotCloseTo(Integer expected) {
        long converted = Long.valueOf(expected);
        boolean value = round() != converted;
        return new CompletableResult(value);
    }
}
