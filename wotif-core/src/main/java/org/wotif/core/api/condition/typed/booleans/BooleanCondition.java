package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.Result;

public class BooleanCondition extends AbstractBooleanCondition {

    public BooleanCondition(Boolean term) {
        super(term);
    }

    @Override
    public Result isTrue() {
        boolean value = this.term.value();
        return new Result(value);
    }

    @Override
    public Result isFalse() {
        boolean value = !this.term.value();
        return new Result(value);
    }

    @Override
    public Result isEqualTo(Boolean expected) {
        boolean value = this.term.value().equals(expected);
        return new Result(value);
    }

    @Override
    public Result isDifferentFrom(Boolean expected) {
        boolean value = !this.term.value().equals(expected);
        return new Result(value);
    }

    @Override
    public Result isNull() {
        boolean value = this.term.value() == null;
        return new Result(value);
    }

    @Override
    public Result isNotNull() {
        boolean value = this.term.value() != null;
        return new Result(value);
    }

}
