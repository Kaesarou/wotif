package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;

public interface IBooleanCondition {
    CompletableResult isTrue();
    CompletableResult isFalse();
    CompletableResult isEqualTo(Boolean expected);
    CompletableResult isDifferentFrom(Boolean expected);
    CompletableResult isNull();
    CompletableResult isNotNull();
}
