package org.wotif.core.api.actions.old;

import io.vavr.control.Either;

public class FinalActions<RESULT> extends AbstractActions<RESULT> {

    public FinalActions() { }

    public FinalActions(Either<AbstractActions<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

}
