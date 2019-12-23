package org.wotif.wotif.core;

import io.vavr.control.Either;

public abstract class AbstractReturnStatement<RESULT> {

    Either<AbstractReturnStatement<RESULT>, RESULT> value;

    public AbstractReturnStatement() { }

    public AbstractReturnStatement(Either<AbstractReturnStatement<RESULT>, RESULT> eitherValue) {
        this.value = eitherValue;
    }

    public RESULT end() {
        return this.value.getOrElse(()-> null);
    }

}
