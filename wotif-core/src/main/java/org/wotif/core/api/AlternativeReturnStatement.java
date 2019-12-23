package org.wotif.core.api;

import io.vavr.control.Either;

public class AlternativeReturnStatement<RESULT> extends AbstractReturnStatement<RESULT> {

    public AlternativeReturnStatement() {}

    public AlternativeReturnStatement(Either<AbstractReturnStatement<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

}
