package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.AbstractCondition;

public class BooleanCondition extends AbstractCondition<Boolean> implements IBooleanCondition {

    public BooleanCondition(Boolean term) {
        super(term);
    }

    @Override
    public CompletableConditionResult isTrue() {
        boolean value = this.term.value();
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isFalse() {
        boolean value = !this.term.value();
        return new CompletableConditionResult(value);
    }

}
