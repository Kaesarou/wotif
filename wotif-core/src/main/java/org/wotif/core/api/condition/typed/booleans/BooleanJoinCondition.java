package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;
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
    public CompletableResult isTrue() {
        return this.functionToApply.apply(BooleanCondition::isTrue);
    }

    @Override
    public CompletableResult isFalse() {
        return this.functionToApply.apply(BooleanCondition::isFalse);
    }

}
