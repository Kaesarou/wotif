package org.wotif.core.api.condition;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.Term;

public abstract class AbstractCondition<TYPE> implements ICondition<TYPE> {

    protected Term<TYPE> term;


    public AbstractCondition(TYPE term) {
        this.term = new Term<>(term);
    }

    @Override
    public CompletableConditionResult isEqualTo(TYPE expected) {
        boolean value = this.term.value().equals(expected);
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isDifferentFrom(TYPE expected) {
        boolean value = !this.term.value().equals(expected);
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNull() {
        boolean value = this.term.value() == null;
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNotNull() {
        boolean value = this.term.value() != null;
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isInstanceOf(Class<?> className) {
        boolean value = className.isInstance(this.term.value());
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNotInstanceOf(Class<?> className) {
        boolean value = !className.isInstance(this.term.value());
        return new CompletableConditionResult(value);
    }

}
