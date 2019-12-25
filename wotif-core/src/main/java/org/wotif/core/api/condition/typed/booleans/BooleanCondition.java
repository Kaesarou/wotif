package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.ConditionResult;

public class BooleanCondition extends AbstractBooleanCondition {

    public BooleanCondition(Boolean term) {
        super(term);
    }

    @Override
    public ConditionResult isTrue() {
        boolean value = this.term.value();
        return new ConditionResult(value);
    }

    @Override
    public ConditionResult isFalse() {
        boolean value = !this.term.value();
        return new ConditionResult(value);
    }

    @Override
    public ConditionResult isEqualTo(Boolean expected) {
        boolean value = this.term.value().equals(expected);
        return new ConditionResult(value);
    }

    @Override
    public ConditionResult isDifferentFrom(Boolean expected) {
        boolean value = !this.term.value().equals(expected);
        return new ConditionResult(value);
    }

    @Override
    public ConditionResult isNull() {
        boolean value = this.term.value() == null;
        return new ConditionResult(value);
    }

    @Override
    public ConditionResult isNotNull() {
        boolean value = this.term.value() != null;
        return new ConditionResult(value);
    }

}
