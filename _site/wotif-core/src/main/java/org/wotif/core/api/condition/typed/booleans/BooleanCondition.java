package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractCondition;

public class BooleanCondition extends AbstractCondition<Boolean> implements IBooleanCondition {

    public BooleanCondition(Boolean term) {
        super(term);
    }

    @Override
    public CompletableResult isTrue() {
        boolean value = this.term.value();
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isFalse() {
        boolean value = !this.term.value();
        return new CompletableResult(value);
    }

}
