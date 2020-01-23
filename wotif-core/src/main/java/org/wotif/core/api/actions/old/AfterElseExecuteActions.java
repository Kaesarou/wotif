package org.wotif.core.api.actions.old;

import io.vavr.control.Either;

public class AfterElseExecuteActions<RESULT> extends AbstractElseActions<RESULT> {

    public AfterElseExecuteActions(Either<AbstractActions<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

    public AbstractActions<RESULT> thenReturn(RESULT orReturn) {
        return this.value.isLeft() ? new FinalActions<>(Either.right(orReturn)) : this;
    }

}
