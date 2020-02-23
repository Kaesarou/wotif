package org.wotif.core.api.condition;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.Term;

public abstract class AbstractCondition<TYPE> implements ICondition<TYPE> {

    protected Term<TYPE> term;


    public AbstractCondition(TYPE term) {
        this.term = new Term<>(term);
    }

    @Override
    public CompletableResult isEqualTo(TYPE expected) {
        boolean value = this.term.value().equals(expected);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isDifferentFrom(TYPE expected) {
        boolean value = !this.term.value().equals(expected);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNull() {
        boolean value = this.term.value() == null;
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotNull() {
        boolean value = this.term.value() != null;
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isInstanceOf(Class<?> className) {
        boolean value = className.isInstance(this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotInstanceOf(Class<?> className) {
        boolean value = !className.isInstance(this.term.value());
        return new CompletableResult(value);
    }

}
