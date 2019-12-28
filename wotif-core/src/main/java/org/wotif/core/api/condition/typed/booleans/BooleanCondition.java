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

    @Override
    public CompletableResult isEqualTo(Boolean expected) {
        boolean value = this.term.value().equals(expected);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isDifferentFrom(Boolean expected) {
        boolean value = !this.term.value().equals(expected);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNull() {
        boolean value = this.term.value() == null;
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotNull() {
        boolean value = this.term.value() != null;
        return new CompletableResult(value);
    }

}
