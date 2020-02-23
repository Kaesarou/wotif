package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.ComparableJoinCondition;

public abstract class AbstractNumberJoinCondition<NUMBER extends Number & Comparable<NUMBER>, NUMBER_CONDITION extends AbstractNumberCondition<NUMBER>>
        extends ComparableJoinCondition<NUMBER, NUMBER_CONDITION> implements INumberCondition<NUMBER> {

    @SafeVarargs
    public AbstractNumberJoinCondition(JoinEnum joinType, NUMBER... terms) {
        super(joinType, terms);
    }

    @Override
    protected abstract NUMBER_CONDITION getInstanceOfCondition(NUMBER term);

    @Override
    public CompletableResult isZero() {
        return this.functionToApply.apply(AbstractNumberCondition::isZero);
    }

    @Override
    public CompletableResult isDifferentFromZero() {
        return this.functionToApply.apply(AbstractNumberCondition::isDifferentFromZero);
    }

    @Override
    public CompletableResult isPositive() {
        return this.functionToApply.apply(AbstractNumberCondition::isPositive);
    }

    @Override
    public CompletableResult isNegative() {
        return this.functionToApply.apply(AbstractNumberCondition::isNegative);
    }

}
