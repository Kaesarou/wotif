package org.wotif.core.api.returns;

import io.vavr.control.Either;
import org.wotif.core.api.CallBack;

public class Return<RESULT> extends AbstractReturn<RESULT> {

    public Return(Either<AbstractReturn<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

    public AbstractReturn<RESULT> orElseReturn(RESULT orReturn) {
        return this.value.isLeft() ? new ElseReturn<>(Either.right(orReturn)) : this;
    }

    public Return<RESULT> orElseExecute(CallBack callBack) {
        if (this.value.isLeft()) callBack.execute();
        return this;
    }

}
