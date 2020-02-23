package org.wotif.core.api;

import io.vavr.control.Either;

import java.util.function.Supplier;

public class Instructions<RETURN> {

    private Result result;

    private Either<Supplier<RETURN>, CallBack> action;

    public Instructions(Result result, Supplier<RETURN> supplier) {
        this.result = result;
        this.action = Either.left(supplier);
    }

    public Instructions(Result result, CallBack callBack) {
        this.result = result;
        this.action = Either.right(callBack);
    }

    public Result result() {
        return this.result;
    }

    public RETURN executeAction() {
        if (this.action.isLeft()) {
            return this.action.left().get().get();
        }
        this.action.right().get().execute();
        return null;
    }

}
