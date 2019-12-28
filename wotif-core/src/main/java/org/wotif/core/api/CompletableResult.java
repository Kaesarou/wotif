package org.wotif.core.api;

import org.wotif.core.api.condition.typed.booleans.AllOfBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.AnyOfBooleanCondition;

public class CompletableResult extends Result{

    public CompletableResult(boolean value) {
        super(value);
    }

    public CompletableResult and(Result result) {
        return new AllOfBooleanCondition(result.value(), this.value()).isTrue();
    }

    public CompletableResult or(Result result) {
        return new AnyOfBooleanCondition(result.value(), this.value()).isTrue();
    }

}
