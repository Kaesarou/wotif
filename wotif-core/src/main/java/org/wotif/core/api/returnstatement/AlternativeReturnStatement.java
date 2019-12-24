package org.wotif.core.api.returnstatement;

import io.vavr.control.Either;
import org.wotif.core.api.returnstatement.AbstractReturnStatement;

public class AlternativeReturnStatement<RESULT> extends AbstractReturnStatement<RESULT> {

    public AlternativeReturnStatement() {}

    public AlternativeReturnStatement(Either<AbstractReturnStatement<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

}
