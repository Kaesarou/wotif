package org.wotif.core.api.condition.typed;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.AbstractCondition;

public abstract class ComparableCondition<COMPARABLE_TYPE extends Comparable<COMPARABLE_TYPE>>
        extends AbstractCondition<COMPARABLE_TYPE> implements IComparableCondition<COMPARABLE_TYPE> {

    public ComparableCondition(COMPARABLE_TYPE term) {
        super(term);
    }

    @Override
    public CompletableConditionResult isLessThen(COMPARABLE_TYPE termToCompare) {
        int i = term.value().compareTo(termToCompare);
        return new CompletableConditionResult(i < 0);
    }

    @Override
    public CompletableConditionResult isGreaterThen(COMPARABLE_TYPE termToCompare) {
        int i = term.value().compareTo(termToCompare);
        return new CompletableConditionResult(i > 0);
    }

    @Override
    public CompletableConditionResult isEqualTo(COMPARABLE_TYPE expected) {
        int i = term.value().compareTo(expected);
        return new CompletableConditionResult(i == 0);
    }

    @Override
    public CompletableConditionResult isDifferentFrom(COMPARABLE_TYPE expected) {
        int i = term.value().compareTo(expected);
        return new CompletableConditionResult(i != 0);
    }

    @Override
    public CompletableConditionResult isBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end) {
        int i = term.value().compareTo(start);
        int j = term.value().compareTo(end);
        return new CompletableConditionResult(i >= 0 && j <= 0);
    }

    @Override
    public CompletableConditionResult isNotBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end) {
        int i = term.value().compareTo(start);
        int j = term.value().compareTo(end);
        return new CompletableConditionResult(i < 0 || j > 0);
    }

    @Override
    public CompletableConditionResult isStrictlyBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end) {
        int i = term.value().compareTo(start);
        int j = term.value().compareTo(end);
        return new CompletableConditionResult(i > 0 && j < 0);
    }

}
