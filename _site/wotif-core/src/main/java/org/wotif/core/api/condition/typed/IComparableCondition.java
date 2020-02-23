package org.wotif.core.api.condition.typed;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.ICondition;

public interface IComparableCondition<COMPARABLE_TYPE extends Comparable<COMPARABLE_TYPE>>
        extends ICondition<COMPARABLE_TYPE> {

    CompletableResult isLessThen(COMPARABLE_TYPE termToCompare);

    CompletableResult isGreaterThen(COMPARABLE_TYPE termToCompare);

    CompletableResult isBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end);

    CompletableResult isNotBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end);

    CompletableResult isStrictlyBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end);

    @Override
    CompletableResult isEqualTo(COMPARABLE_TYPE expected);

    @Override
    CompletableResult isDifferentFrom(COMPARABLE_TYPE expected);

}
