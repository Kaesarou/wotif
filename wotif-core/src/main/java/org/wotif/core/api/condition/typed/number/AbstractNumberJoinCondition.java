package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableConditionResult;
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
    public CompletableConditionResult isZero() {
        return this.functionToApply.apply(n -> n.isZero().value());
    }

    @Override
    public CompletableConditionResult isDifferentFromZero() {
        return this.functionToApply.apply(n -> n.isDifferentFromZero().value());
    }

    @Override
    public CompletableConditionResult isPositive() {
        return this.functionToApply.apply(n -> n.isPositive().value());
    }

    @Override
    public CompletableConditionResult isNegative() {
        return this.functionToApply.apply(n -> n.isNegative().value());
    }

}
