package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.Result;

public interface IBooleanCondition {
    Result isTrue();
    Result isFalse();
    Result isEqualTo(Boolean expected);
    Result isDifferentFrom(Boolean expected);
    Result isNull();
    Result isNotNull();
}
