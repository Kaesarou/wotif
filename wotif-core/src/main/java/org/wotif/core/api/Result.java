package org.wotif.core.api;

import io.vavr.control.Either;
import org.wotif.core.api.returns.ElseReturn;
import org.wotif.core.api.returns.Return;

public class Result {

    private boolean value;

    public boolean value() { return this.value; }

    public Result(boolean value) { this.value = value; }

    public <RESULT> Return<RESULT> thenReturn(RESULT valueToReturn) {
        return new Return<>(this.value() ? Either.right(valueToReturn) : Either.left(new ElseReturn<>()));
    }

    public Result thenExecute (CallBack callBack) {
        if(this.value()) callBack.execute();
        return this;
    }
}
