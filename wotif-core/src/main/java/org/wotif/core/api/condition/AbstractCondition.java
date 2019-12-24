package org.wotif.core.api.condition;

import org.wotif.core.api.ConditionResult;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractCondition<T> {

    protected List<T> terms;

    @SafeVarargs
    public AbstractCondition(T... terms) {
        this.terms = Arrays.stream(terms).collect(Collectors.toList());
    }

}
