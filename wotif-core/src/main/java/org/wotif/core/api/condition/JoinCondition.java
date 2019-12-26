package org.wotif.core.api.condition;

import org.wotif.core.api.Result;
import java.util.List;
import java.util.function.Predicate;

public abstract class JoinCondition<TYPE, CONDITION extends AbstractCondition<TYPE> > {

    protected List<CONDITION> conditions;

    protected JoinCondition(List<CONDITION> conditions) {
        this.conditions = conditions;
    }

    protected Result anyOf(Predicate<? super CONDITION> method) {
        boolean value = conditions.stream().anyMatch(method);
        return new Result(value);
    }

    protected Result allOf(Predicate<? super CONDITION> method) {
        boolean value = conditions.stream().allMatch(method);
        return new Result(value);
    }

    protected Result noneOf(Predicate<? super CONDITION> method) {
        boolean value = conditions.stream().noneMatch(method);
        return new Result(value);
    }

}
