package org.wotif.core.api.actions.old;

import io.vavr.control.Either;

public abstract class AbstractActions<RESULT> {

    protected Either<AbstractActions<RESULT>, RESULT> value;

    public AbstractActions() { }

    public AbstractActions(Either<AbstractActions<RESULT>, RESULT> eitherValue) {
        this.value = eitherValue;
    }

    public RESULT endIF() {
        return this.value.getOrElse(() -> null);
    }

}
