package org.wotif.core.api.condition.typed;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.ICondition;

public interface IComparableCondition<COMPARABLE_TYPE extends Comparable<COMPARABLE_TYPE>>
        extends ICondition<COMPARABLE_TYPE> {

    CompletableConditionResult isLessThen(COMPARABLE_TYPE termToCompare);

    CompletableConditionResult isGreaterThen(COMPARABLE_TYPE termToCompare);

    CompletableConditionResult isBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end);

    CompletableConditionResult isNotBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end);

    CompletableConditionResult isStrictlyBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end);

    @Override
    CompletableConditionResult isEqualTo(COMPARABLE_TYPE expected);

    @Override
    CompletableConditionResult isDifferentFrom(COMPARABLE_TYPE expected);

}
