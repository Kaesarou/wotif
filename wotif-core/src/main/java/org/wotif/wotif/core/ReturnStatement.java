package org.wotif.wotif.core;

import io.vavr.control.Either;

public class ReturnStatement<RESULT> extends AbstractReturnStatement<RESULT> {

    public ReturnStatement(Either<AbstractReturnStatement<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

    public AbstractReturnStatement<RESULT> orElseReturn(RESULT orReturn) {
        return this.value.isLeft() ? new AlternativeReturnStatement<>(Either.right(orReturn)) : this;
    }

}
