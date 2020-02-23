package org.wotif.core.api.condition.typed;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractCondition;

public abstract class ComparableCondition<COMPARABLE_TYPE extends Comparable<COMPARABLE_TYPE>>
        extends AbstractCondition<COMPARABLE_TYPE> implements IComparableCondition<COMPARABLE_TYPE> {

    public ComparableCondition(COMPARABLE_TYPE term) {
        super(term);
    }

    @Override
    public CompletableResult isLessThen(COMPARABLE_TYPE termToCompare) {
        int i = term.value().compareTo(termToCompare);
        return new CompletableResult(i < 0);
    }

    @Override
    public CompletableResult isGreaterThen(COMPARABLE_TYPE termToCompare) {
        int i = term.value().compareTo(termToCompare);
        return new CompletableResult(i > 0);
    }

    @Override
    public CompletableResult isEqualTo(COMPARABLE_TYPE expected) {
        int i = term.value().compareTo(expected);
        return new CompletableResult(i == 0);
    }

    @Override
    public CompletableResult isDifferentFrom(COMPARABLE_TYPE expected) {
        int i = term.value().compareTo(expected);
        return new CompletableResult(i != 0);
    }

    @Override
    public CompletableResult isBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end) {
        int i = term.value().compareTo(start);
        int j = term.value().compareTo(end);
        return new CompletableResult(i >= 0 && j <= 0);
    }

    @Override
    public CompletableResult isNotBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end) {
        int i = term.value().compareTo(start);
        int j = term.value().compareTo(end);
        return new CompletableResult(i < 0 || j > 0);
    }

    @Override
    public CompletableResult isStrictlyBetween(COMPARABLE_TYPE start, COMPARABLE_TYPE end) {
        int i = term.value().compareTo(start);
        int j = term.value().compareTo(end);
        return new CompletableResult(i > 0 && j < 0);
    }

}
