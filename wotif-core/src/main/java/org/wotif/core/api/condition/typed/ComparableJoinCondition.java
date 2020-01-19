package org.wotif.core.api.condition.typed;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractJoinCondition;
import org.wotif.core.api.condition.JoinEnum;

public abstract class ComparableJoinCondition<COMPARABLE_TYPE extends Comparable<COMPARABLE_TYPE>, COMPARABLE_CONDITION extends ComparableCondition<COMPARABLE_TYPE>>
        extends AbstractJoinCondition<COMPARABLE_TYPE, COMPARABLE_CONDITION>
        implements IComparableCondition<COMPARABLE_TYPE> {

    @SafeVarargs
    public ComparableJoinCondition(JoinEnum joinType, COMPARABLE_TYPE... terms) {
        super(joinType, terms);
    }
    @Override
    protected abstract COMPARABLE_CONDITION getInstanceOfCondition(COMPARABLE_TYPE term);
    @Override
    public CompletableResult isLessThen(COMPARABLE_TYPE termToCompare) { return this.functionToApply.apply(n -> n.isLessThen(termToCompare).value()); }
    @Override
    public CompletableResult isGreaterThen(COMPARABLE_TYPE termToCompare) { return this.functionToApply.apply(n -> n.isGreaterThen(termToCompare).value()); }
    @Override
    public CompletableResult isEqualTo(COMPARABLE_TYPE expected) { return this.functionToApply.apply(n -> n.isEqualTo(expected).value()); }
    @Override
    public CompletableResult isDifferentFrom(COMPARABLE_TYPE expected) { return this.functionToApply.apply(n -> n.isDifferentFrom(expected).value()); }
    @Override
    public CompletableResult isBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end) { return this.functionToApply.apply(n -> n.isBetween(start,end).value()); }
    @Override
    public CompletableResult isNotBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end) { return this.functionToApply.apply(n -> n.isNotBetween(start,end).value()); }
    @Override
    public CompletableResult isStrictlyBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end) { return this.functionToApply.apply(n -> n.isStrictlyBetween(start,end).value()); }

}
