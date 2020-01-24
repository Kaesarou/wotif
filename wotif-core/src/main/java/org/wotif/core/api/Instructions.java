package org.wotif.core.api;

import io.vavr.control.Either;

import java.util.function.Supplier;

public class Instructions<RETURN> {

    private ConditionResult conditionResult;

    private Either<Supplier<RETURN>, CallBack> action;

    public Instructions(ConditionResult conditionResult, Supplier<RETURN> supplier) {
        this.conditionResult = conditionResult;
        this.action = Either.left(supplier);
    }

    public Instructions(ConditionResult conditionResult, CallBack callBack) {
        this.conditionResult = conditionResult;
        this.action = Either.right(callBack);
    }

    public ConditionResult result() {
        return this.conditionResult;
    }

    public RETURN executeAction() {
        if (this.action.isLeft()) {
            return this.action.left().get().get();
        }
        this.action.right().get().execute();
        return null;
    }

}
