package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.typed.IComparableCondition;

public interface INumberCondition<NUMBER extends Number & Comparable<NUMBER>> extends IComparableCondition<NUMBER> {

    CompletableConditionResult isZero();

    CompletableConditionResult isDifferentFromZero();

    CompletableConditionResult isPositive();

    CompletableConditionResult isNegative();

}
