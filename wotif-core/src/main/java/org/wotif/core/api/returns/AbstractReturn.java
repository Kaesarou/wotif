package org.wotif.core.api.returns;

import io.vavr.control.Either;

public abstract class AbstractReturn<RESULT> {

    protected Either<AbstractReturn<RESULT>, RESULT> value;

    public AbstractReturn() { }

    public AbstractReturn(Either<AbstractReturn<RESULT>, RESULT> eitherValue) {
        this.value = eitherValue;
    }

    public RESULT endIF() {
        return this.value.getOrElse(()-> null);
    }

}
