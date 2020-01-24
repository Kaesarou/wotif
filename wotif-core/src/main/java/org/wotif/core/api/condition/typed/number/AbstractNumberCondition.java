package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.typed.ComparableCondition;

public abstract class AbstractNumberCondition<NUMBER extends Number & Comparable<NUMBER>> extends ComparableCondition<NUMBER> implements INumberCondition<NUMBER> {

    protected AbstractNumberCondition(NUMBER term) {
        super(term);
    }

    protected abstract NUMBER zero();

    @Override
    public CompletableConditionResult isZero() {
        int i = term.value().compareTo(zero());
        return new CompletableConditionResult(i == 0);
    }

    @Override
    public CompletableConditionResult isDifferentFromZero() {
        int i = term.value().compareTo(zero());
        return new CompletableConditionResult(i != 0);
    }

    @Override
    public CompletableConditionResult isPositive() {
        int i = term.value().compareTo(zero());
        return new CompletableConditionResult(i >= 0);
    }

    @Override
    public CompletableConditionResult isNegative() {
        int i = term.value().compareTo(zero());
        return new CompletableConditionResult(i < 0);
    }

}
