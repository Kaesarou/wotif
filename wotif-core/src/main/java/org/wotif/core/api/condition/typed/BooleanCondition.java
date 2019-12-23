package org.wotif.core.api.condition.typed;

import io.vavr.control.Either;
import org.wotif.core.api.AlternativeReturnStatement;
import org.wotif.core.api.ReturnStatement;
import org.wotif.core.api.condition.AbstractCondition;

public class BooleanCondition extends AbstractCondition<Boolean> {

    public BooleanCondition(Boolean value) {
        super(value);
    }

    public BooleanCondition isTrue() {
        return this;
    }

    public BooleanCondition isFalse() { return new BooleanCondition(!this.value); }

    public BooleanCondition isEqualTo(Boolean expected) { return new BooleanCondition(this.value.equals(expected)); }

    public BooleanCondition isDifferentFrom(Boolean expected) { return new BooleanCondition(!this.value.equals(expected)); }

    public BooleanCondition isNull() { return new BooleanCondition(this.value == null); }

    public BooleanCondition isNotNull() { return new BooleanCondition(this.value != null); }

    @Override
    public <RESULT> ReturnStatement<RESULT> thenReturn(RESULT valueToReturn) {
        return new ReturnStatement<>(this.value ? Either.right(valueToReturn) : Either.left(new AlternativeReturnStatement<>()));
    }

}
