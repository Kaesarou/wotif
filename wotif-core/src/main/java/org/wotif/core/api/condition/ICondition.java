package org.wotif.core.api.condition;

import org.wotif.core.api.CompletableConditionResult;

public interface ICondition<TYPE> {

    CompletableConditionResult isEqualTo(TYPE expected);

    CompletableConditionResult isDifferentFrom(TYPE expected);

    CompletableConditionResult isNull();

    CompletableConditionResult isNotNull();

    CompletableConditionResult isInstanceOf(Class<?> className);

    CompletableConditionResult isNotInstanceOf(Class<?> className);

}
