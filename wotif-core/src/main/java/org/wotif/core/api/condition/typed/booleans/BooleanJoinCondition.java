package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.AbstractJoinCondition;
import org.wotif.core.api.condition.JoinEnum;

public class BooleanJoinCondition extends AbstractJoinCondition<Boolean, BooleanCondition> implements IBooleanCondition {

    public BooleanJoinCondition(JoinEnum joinType, Boolean... terms) {
        super(joinType, terms);
    }

    @Override
    protected BooleanCondition getInstanceOfCondition(Boolean term) {
        return new BooleanCondition(term);
    }

    @Override
    public CompletableConditionResult isTrue() {
        return this.functionToApply.apply(b -> b.isTrue().value());
    }

    @Override
    public CompletableConditionResult isFalse() {
        return this.functionToApply.apply(b -> b.isFalse().value());
    }

}
