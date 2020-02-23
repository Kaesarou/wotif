package org.wotif.core.api;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.booleans.BooleanJoinCondition;

public class CompletableResult extends Result {

    public CompletableResult(boolean value) {
        super(value);
    }

    public CompletableResult and(Result result) {
        return new BooleanJoinCondition(JoinEnum.ALLOF, result.value(), this.value()).isTrue();
    }

    public CompletableResult or(Result result) {
        return new BooleanJoinCondition(JoinEnum.ANYOF, result.value(), this.value()).isTrue();
    }

}
