package org.wotif.core.api;

import io.vavr.control.Either;
import org.wotif.core.api.condition.typed.booleans.AllOfBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.AnyOfBooleanCondition;
import org.wotif.core.api.returnstatement.AlternativeReturnStatement;
import org.wotif.core.api.returnstatement.ReturnStatement;

public class Result {

    private boolean value;

    public boolean value() { return this.value; }

    public Result(boolean value) { this.value = value; }

    public Result and(Result result) {
        return new AllOfBooleanCondition(result.value(), this.value).isTrue();
    }

    public Result or(Result result) {
        return new AnyOfBooleanCondition(result.value(), this.value).isTrue();
    }

    public <RESULT> ReturnStatement<RESULT> thenReturn(RESULT valueToReturn) {
        return new ReturnStatement<>(this.value ? Either.right(valueToReturn) : Either.left(new AlternativeReturnStatement<>()));
    }

}
