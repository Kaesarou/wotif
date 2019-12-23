package org.wotif.wotif.core.condition.typed;

import io.vavr.control.Either;
import org.wotif.wotif.core.AbstractReturnStatement;
import org.wotif.wotif.core.AlternativeReturnStatement;
import org.wotif.wotif.core.ReturnStatement;
import org.wotif.wotif.core.condition.AbstractCondition;

public class BooleanCondition extends AbstractCondition<Boolean> {

    public BooleanCondition(Boolean value) {
        super(value);
    }

    public BooleanCondition isTrue() {
        return this;
    }

    @Override
    public <RESULT> ReturnStatement<RESULT> thenReturn(RESULT valueToReturn) {
        return new ReturnStatement<>(this.value ? Either.right(valueToReturn) : Either.left(new AlternativeReturnStatement<>()));
    }

}
