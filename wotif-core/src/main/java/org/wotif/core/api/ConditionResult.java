package org.wotif.core.api;

import io.vavr.control.Either;
import org.wotif.core.api.returnstatement.AlternativeReturnStatement;
import org.wotif.core.api.returnstatement.ReturnStatement;

public class ConditionResult {

    private boolean value;

    public boolean value() { return this.value; }

    public ConditionResult(boolean value) { this.value = value; }

    public <RESULT> ReturnStatement<RESULT> thenReturn(RESULT valueToReturn) {
        return new ReturnStatement<>(this.value ? Either.right(valueToReturn) : Either.left(new AlternativeReturnStatement<>()));
    }

}
