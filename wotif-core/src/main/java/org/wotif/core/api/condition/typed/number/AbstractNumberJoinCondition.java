package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractJoinCondition;
import org.wotif.core.api.condition.JoinEnum;

public abstract class AbstractNumberJoinCondition<NUMBER extends Number & Comparable<NUMBER>, NUMBER_CONDITION extends AbstractNumberCondition<NUMBER>> extends AbstractJoinCondition<NUMBER, NUMBER_CONDITION> implements INumberCondition<NUMBER> {

    @SafeVarargs
    public AbstractNumberJoinCondition(JoinEnum joinType, NUMBER... terms) { super(joinType, terms); }

    @Override
    protected abstract NUMBER_CONDITION getInstanceOfCondition(NUMBER term);
    @Override
    public CompletableResult isZero() { return this.functionToApply.apply(n -> n.isZero().value()); }
    @Override
    public CompletableResult isDifferentFromZero() { return this.functionToApply.apply(n -> n.isDifferentFromZero().value()); }
    @Override
    public CompletableResult isPositive() { return this.functionToApply.apply(n -> n.isPositive().value()); }
    @Override
    public CompletableResult isNegative() { return this.functionToApply.apply(n -> n.isNegative().value()); }
    @Override
    public CompletableResult isLessThen(NUMBER numberToCompare) { return this.functionToApply.apply(n -> n.isLessThen(numberToCompare).value()); }
    @Override
    public CompletableResult isGreaterThen(NUMBER numberToCompare) { return this.functionToApply.apply(n -> n.isGreaterThen(numberToCompare).value()); }
    @Override
    public CompletableResult isEqualTo(NUMBER expected) { return this.functionToApply.apply(n -> n.isEqualTo(expected).value()); }
    @Override
    public CompletableResult isDifferentFrom(NUMBER expected) { return this.functionToApply.apply(n -> n.isDifferentFrom(expected).value()); }
    @Override
    public CompletableResult isBetween(NUMBER start, NUMBER end) { return this.functionToApply.apply(n -> n.isBetween(start,end).value()); }
    @Override
    public CompletableResult isNotBetween(NUMBER start, NUMBER end) { return this.functionToApply.apply(n -> n.isNotBetween(start,end).value()); }
    @Override
    public CompletableResult isStrictlyBetween(NUMBER start, NUMBER end) { return this.functionToApply.apply(n -> n.isStrictlyBetween(start,end).value()); }

}
