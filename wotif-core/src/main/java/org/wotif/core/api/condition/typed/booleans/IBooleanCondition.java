package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.ICondition;

public interface IBooleanCondition extends ICondition<Boolean> {

    CompletableConditionResult isTrue();

    CompletableConditionResult isFalse();

}
