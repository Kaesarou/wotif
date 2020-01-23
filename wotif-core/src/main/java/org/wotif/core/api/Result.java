package org.wotif.core.api;

import io.vavr.control.Either;
import org.wotif.core.api.actions.Evaluate;
import org.wotif.core.api.actions.Then;
import org.wotif.core.api.actions.old.ElseActions;
import org.wotif.core.api.actions.old.FinalActions;

import java.util.function.Supplier;

public class Result {

    private boolean value;

    public boolean value() {
        return this.value;
    }

    public Result(boolean value) {
        this.value = value;
    }

    public <RESULT> ElseActions<RESULT> thenReturn(RESULT valueToReturn) {
        return new ElseActions<>(this.value() ? Either.right(valueToReturn) : Either.left(new FinalActions<>()));
    }

    public Result thenExecute(CallBack callBack) {
        if (this.value()) callBack.execute();
        return this;
    }

    public Then<Void> then(CallBack callBack) {
        Evaluate<Void> evaluate = new Evaluate<>(this, callBack, this.value);
        return new Then<>(evaluate);
    }

    public <RETURN> Then<RETURN> then(Supplier<RETURN> supplier) {
        Evaluate<RETURN> evaluate = new Evaluate<>(this, supplier, this.value);
        return new Then<>(evaluate);
    }

}
