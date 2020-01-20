package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.IComparableCondition;

public interface INumberCondition<NUMBER extends Number & Comparable<NUMBER>> extends IComparableCondition<NUMBER> {

    CompletableResult isZero();

    CompletableResult isDifferentFromZero();

    CompletableResult isPositive();

    CompletableResult isNegative();

}
