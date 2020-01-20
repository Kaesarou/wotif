package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.ICondition;

public interface IBooleanCondition extends ICondition<Boolean> {

    CompletableResult isTrue();

    CompletableResult isFalse();

}
