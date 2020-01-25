package org.wotif.core.api.condition.typed.number.floating;

import org.wotif.core.api.CompletableConditionResult;
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
    public CompletableConditionResult isCloseTo(Integer expected) {
        return this.functionToApply.apply(n -> n.isCloseTo(expected).value());
    }

    @Override
    public CompletableConditionResult isNotCloseTo(Integer expected) {
        return this.functionToApply.apply(n -> n.isNotCloseTo(expected).value());
    }

    @Override
    public CompletableConditionResult isNumber() {
        return this.functionToApply.apply(n -> n.isNumber().value());
    }

    @Override
    public CompletableConditionResult isNaN() {
        return this.functionToApply.apply(n -> n.isNaN().value());
    }

    @Override
    public CompletableConditionResult isInfinite() {
        return this.functionToApply.apply(n -> n.isInfinite().value());
    }

    @Override
    public CompletableConditionResult isFinite() {
        return this.functionToApply.apply(n -> n.isFinite().value());
    }

}
