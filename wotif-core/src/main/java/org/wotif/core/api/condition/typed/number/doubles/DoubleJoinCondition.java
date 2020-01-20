package org.wotif.core.api.condition.typed.number.doubles;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.number.AbstractNumberJoinCondition;

public class DoubleJoinCondition extends AbstractNumberJoinCondition<Double, DoubleCondition>
        implements IDoubleCondition {

    public DoubleJoinCondition(JoinEnum joinType, Double... terms) {
        super(joinType, terms);
    }

    @Override
    protected DoubleCondition getInstanceOfCondition(Double term) {
        return new DoubleCondition(term);
    }

    @Override
    public CompletableResult isCloseTo(Integer expected) {
        return this.functionToApply.apply(n -> n.isCloseTo(expected).value());
    }

    @Override
    public CompletableResult isNotCloseTo(Integer expected) {
        return this.functionToApply.apply(n -> n.isNotCloseTo(expected).value());
    }

}
