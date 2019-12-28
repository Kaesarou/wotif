package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;

public class BooleanCondition extends AbstractBooleanCondition {

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
