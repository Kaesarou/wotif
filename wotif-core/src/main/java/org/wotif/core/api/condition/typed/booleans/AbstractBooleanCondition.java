package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.ConditionResult;
import org.wotif.core.api.condition.AbstractCondition;
import java.util.Objects;


public abstract class AbstractBooleanCondition extends AbstractCondition<Boolean> {

    AbstractBooleanCondition(Boolean... terms) {
        super(terms);
    }

    public ConditionResult isTrue() {
        boolean value = this.terms.stream().anyMatch(b -> b.equals(true));
        return new ConditionResult(value);
    }

    public ConditionResult isFalse() {
        boolean value = this.terms.stream().anyMatch(b -> b.equals(false));
        return new ConditionResult(value);
    }

    public ConditionResult isEqualTo(Boolean expected) {
        boolean value = this.terms.stream().anyMatch(b -> b.equals(expected));
        return new ConditionResult(value);
    }

    public ConditionResult isDifferentFrom(Boolean expected) {
        boolean value = this.terms.stream().anyMatch(b -> !b.equals(expected));
        return new ConditionResult(value);
    }

    public ConditionResult isNull() {
        boolean value = this.terms.stream().anyMatch(Objects::isNull);
        return new ConditionResult(value);
    }

    public ConditionResult isNotNull() {
        boolean value = this.terms.stream().anyMatch(Objects::nonNull);
        return new ConditionResult(value);
    }

}
