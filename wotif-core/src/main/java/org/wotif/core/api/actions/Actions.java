package org.wotif.core.api.actions;

import io.vavr.control.Either;
import org.wotif.core.api.CallBack;

public class Actions<RESULT> extends AbstractActions<RESULT> {

    public Actions(Either<AbstractActions<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

    public AbstractActions<RESULT> orElseReturn(RESULT orReturn) {
        return this.value.isLeft() ? new ElseActions<>(Either.right(orReturn)) : this;
    }

    public Actions<RESULT> orElseExecute(CallBack callBack) {
        if (this.value.isLeft()) callBack.execute();
        return this;
    }

}
