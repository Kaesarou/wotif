package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.ICondition;

public interface INumberCondition<NUMBER> extends ICondition<NUMBER> {

    CompletableResult isZero();
    CompletableResult isDifferentFromZero();
    CompletableResult isPositive();
    CompletableResult isNegative();
    CompletableResult isLessThen(NUMBER numberToCompare);
    CompletableResult isGreaterThen(NUMBER numberToCompare);

}
