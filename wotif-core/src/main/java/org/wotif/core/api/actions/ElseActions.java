package org.wotif.core.api.actions;

import io.vavr.control.Either;

public class ElseActions<RESULT> extends AbstractActions<RESULT> {

    public ElseActions() {}

    public ElseActions(Either<AbstractActions<RESULT>, RESULT> eitherValue) {
        super(eitherValue);
    }

}
