package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.ConditionResult;

public interface IBooleanCondition {
    ConditionResult isTrue();
    ConditionResult isFalse();
    ConditionResult isEqualTo(Boolean expected);
    ConditionResult isDifferentFrom(Boolean expected);
    ConditionResult isNull();
    ConditionResult isNotNull();
}
