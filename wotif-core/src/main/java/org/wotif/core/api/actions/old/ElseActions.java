package org.wotif.core.api.actions.old;

import io.vavr.control.Either;

public class ElseActions<RESULT> extends AbstractElseActions<RESULT> {

    public ElseActions(Either<AbstractActions<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

    public AbstractActions<RESULT> orElseReturn(RESULT orReturn) {
        return this.value.isLeft() ? new FinalActions<>(Either.right(orReturn)) : this;
    }

}
