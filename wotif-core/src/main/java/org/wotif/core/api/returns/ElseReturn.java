package org.wotif.core.api.returns;

import io.vavr.control.Either;

public class ElseReturn<RESULT> extends AbstractReturn<RESULT> {

    public ElseReturn() {}

    public ElseReturn(Either<AbstractReturn<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

}
