package org.wotif.core.api.condition;

import org.wotif.core.api.CompletableResult;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class AbstractJoinCondition<TYPE, CONDITION extends AbstractCondition<TYPE>> implements ICondition<TYPE> {

    protected List<CONDITION> conditions;

    protected Function<Predicate<? super CONDITION>, CompletableResult> functionToApply;

    @SafeVarargs
    protected AbstractJoinCondition(JoinEnum joinType, TYPE... terms) {
        this.conditions = Arrays.stream(terms).map(this::getInstanceOfCondition).collect(Collectors.toList());
        if (joinType.equals(JoinEnum.ALLOF))
            this.functionToApply = this::allOf;
        else if (joinType.equals(JoinEnum.ANYOF))
            this.functionToApply = this::anyOf;
        else if (joinType.equals(JoinEnum.NONEOF))
            this.functionToApply = this::noneOf;
    }

    protected abstract CONDITION getInstanceOfCondition(TYPE term);

    private CompletableResult allOf(Predicate<? super CONDITION> method) {
        boolean value = conditions.stream().allMatch(method);
        return new CompletableResult(value);
    }

    private CompletableResult anyOf(Predicate<? super CONDITION> method) {
        boolean value = conditions.stream().anyMatch(method);
        return new CompletableResult(value);
    }

    private CompletableResult noneOf(Predicate<? super CONDITION> method) {
        boolean value = conditions.stream().noneMatch(method);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isEqualTo(TYPE expected) {
        return this.functionToApply.apply(b -> b.isEqualTo(expected).value());
    }

    @Override
    public CompletableResult isDifferentFrom(TYPE expected) {
        return this.functionToApply.apply(b -> b.isDifferentFrom(expected).value());
    }

    @Override
    public CompletableResult isNull() {
        return this.functionToApply.apply(b -> b.isNull().value());
    }

    @Override
    public CompletableResult isNotNull() {
        return this.functionToApply.apply(b -> b.isNotNull().value());
    }

    @Override
    public CompletableResult isInstanceOf(Class<?> className) {
        return this.functionToApply.apply(b -> b.isInstanceOf(className).value());
    }

    @Override
    public CompletableResult isNotInstanceOf(Class<?> className) {
        return this.functionToApply.apply(b -> b.isNotInstanceOf(className).value());
    }

}
