package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.ICondition;

public interface INumberCondition<NUMBER_TYPE> extends ICondition<NUMBER_TYPE> {

    CompletableResult isPositive();
    CompletableResult isNegative();

}
