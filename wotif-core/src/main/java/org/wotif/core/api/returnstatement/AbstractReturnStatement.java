package org.wotif.core.api.returnstatement;

import io.vavr.control.Either;

public abstract class AbstractReturnStatement<RESULT> {

    Either<AbstractReturnStatement<RESULT>, RESULT> value;

    public AbstractReturnStatement() { }

    public AbstractReturnStatement(Either<AbstractReturnStatement<RESULT>, RESULT> eitherValue) {
        this.value = eitherValue;
    }

    public RESULT endIF() {
        return this.value.getOrElse(()-> null);
    }

}
