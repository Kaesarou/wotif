package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.ComparableCondition;

public abstract class AbstractNumberCondition<NUMBER extends Number & Comparable<NUMBER>> extends ComparableCondition<NUMBER> implements INumberCondition<NUMBER> {

    protected AbstractNumberCondition(NUMBER term) {
        super(term);
    }

    protected abstract NUMBER zero();

    @Override
    public CompletableResult isZero() {
        int i = term.value().compareTo(zero());
        return new CompletableResult(i == 0);
    }

    @Override
    public CompletableResult isDifferentFromZero() {
        int i = term.value().compareTo(zero());
        return new CompletableResult(i != 0);
    }

    @Override
    public CompletableResult isPositive() {
        int i = term.value().compareTo(zero());
        return new CompletableResult(i >= 0);
    }

    @Override
    public CompletableResult isNegative() {
        int i = term.value().compareTo(zero());
        return new CompletableResult(i < 0);
    }

}
