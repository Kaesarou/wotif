package org.wotif.core.api.actions;

import io.vavr.control.Either;
import org.wotif.core.api.CallBack;
import org.wotif.core.api.Result;

import java.util.function.Supplier;

public class Evaluate<RETURN> {

    private boolean locked;

    private Result result;

    Either<Supplier<RETURN>, CallBack> action;

    public Evaluate(boolean result) {
        this.result = new Result(result);
        this.action = null;
        this.locked = false;
    }

    public Evaluate(Result result) {
        this.result = result;
        this.action = null;
        this.locked = false;
    }

    public Evaluate(Result result,  Supplier<RETURN> supplier, boolean locked ) {
        this.result = result;
        this.action = Either.left(supplier);
        this.locked = locked;
    }

    public Evaluate(Result result, CallBack callBack, boolean locked) {
        this.result = result;
        this.action = Either.right(callBack);
        this.locked = locked;
    }

    public Result result() {
        return this.result;
    }

    public RETURN executeAction() {
        if(this.action.isLeft()) {
            return this.action.left().get().get();
        }
        this.action.right().get().execute();
        return null;
    }

    public boolean isLocked() {
        return this.locked;
    }

}
