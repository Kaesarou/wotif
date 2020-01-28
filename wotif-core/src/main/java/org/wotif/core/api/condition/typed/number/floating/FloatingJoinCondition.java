package org.wotif.core.api.condition.typed.number.floating;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.number.AbstractNumberJoinCondition;

public abstract class FloatingJoinCondition<FLOATING extends Number & Comparable<FLOATING>>
        extends AbstractNumberJoinCondition<FLOATING, FloatingCondition<FLOATING>>
        implements IFloatingCondition<FLOATING> {

    @SafeVarargs
    public FloatingJoinCondition(JoinEnum joinType, FLOATING... terms) {
        super(joinType, terms);
    }
    
    @Override
    public CompletableResult isCloseTo(Integer expected) {
        return this.functionToApply.apply(n -> n.isCloseTo(expected));
    }

    @Override
    public CompletableResult isNotCloseTo(Integer expected) {
        return this.functionToApply.apply(n -> n.isNotCloseTo(expected));
    }

    @Override
    public CompletableResult isNumber() {
        return this.functionToApply.apply(IFloatingCondition::isNumber);
    }

    @Override
    public CompletableResult isNaN() {
        return this.functionToApply.apply(IFloatingCondition::isNaN);
    }

    @Override
    public CompletableResult isInfinite() {
        return this.functionToApply.apply(IFloatingCondition::isInfinite);
    }

    @Override
    public CompletableResult isFinite() {
        return this.functionToApply.apply(IFloatingCondition::isFinite);
    }

}
