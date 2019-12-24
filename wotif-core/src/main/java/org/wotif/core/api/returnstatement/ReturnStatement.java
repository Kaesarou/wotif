package org.wotif.core.api.returnstatement;

import io.vavr.control.Either;
import org.wotif.core.api.returnstatement.AbstractReturnStatement;
import org.wotif.core.api.returnstatement.AlternativeReturnStatement;

public class ReturnStatement<RESULT> extends AbstractReturnStatement<RESULT> {

    public ReturnStatement(Either<AbstractReturnStatement<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

    public AbstractReturnStatement<RESULT> orElseReturn(RESULT orReturn) {
        return this.value.isLeft() ? new AlternativeReturnStatement<>(Either.right(orReturn)) : this;
    }

}
