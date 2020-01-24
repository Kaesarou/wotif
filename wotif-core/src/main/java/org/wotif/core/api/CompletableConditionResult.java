package org.wotif.core.api;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.booleans.BooleanJoinCondition;

public class CompletableConditionResult extends ConditionResult {

    public CompletableConditionResult(boolean value) {
        super(value);
    }

    public CompletableConditionResult and(ConditionResult conditionResult) {
        return new BooleanJoinCondition(JoinEnum.ALLOF, conditionResult.value(), this.value()).isTrue();
    }

    public CompletableConditionResult or(ConditionResult conditionResult) {
        return new BooleanJoinCondition(JoinEnum.ANYOF, conditionResult.value(), this.value()).isTrue();
    }

}
