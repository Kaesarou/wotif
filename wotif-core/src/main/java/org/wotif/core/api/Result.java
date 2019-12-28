package org.wotif.core.api;

import io.vavr.control.Either;
import org.wotif.core.api.actions.ElseActions;
import org.wotif.core.api.actions.Actions;

public class Result {

    private boolean value;

    public boolean value() { return this.value; }

    public Result(boolean value) { this.value = value; }

    public <RESULT> Actions<RESULT> thenReturn(RESULT valueToReturn) {
        return new Actions<>(this.value() ? Either.right(valueToReturn) : Either.left(new ElseActions<>()));
    }

    public Result thenExecute (CallBack callBack) {
        if(this.value()) callBack.execute();
        return this;
    }
}
