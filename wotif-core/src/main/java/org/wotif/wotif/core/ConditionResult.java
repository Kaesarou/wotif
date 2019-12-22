package org.wotif.wotif.core;

import io.vavr.control.Either;

public class ConditionResult<RESULT> {

    Either<ConditionResult<RESULT>, RESULT> value;

    public ConditionResult() { }

    public ConditionResult(Either<ConditionResult<RESULT>, RESULT> eitherValue) {
        this.value = eitherValue;
    }
    public ConditionResult<RESULT> orElseReturn(RESULT orReturn) {
        return this.value.isLeft() ? new ConditionResult<>(Either.right(orReturn)) : this;
    }
    public RESULT end() {
        return this.value.getOrElse(()-> null);
    }

}
