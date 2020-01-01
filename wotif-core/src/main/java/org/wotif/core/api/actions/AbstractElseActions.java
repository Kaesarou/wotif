package org.wotif.core.api.actions;

import io.vavr.control.Either;
import org.wotif.core.api.CallBack;

public abstract class AbstractElseActions<RESULT> extends AbstractActions<RESULT> {

    public AbstractElseActions(Either<AbstractActions<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

    public AfterElseExecuteActions<RESULT> orElseExecute(CallBack callBack) {
        if (this.value.isLeft()) callBack.execute();
        return new AfterElseExecuteActions<>(this.value);
    }

}
