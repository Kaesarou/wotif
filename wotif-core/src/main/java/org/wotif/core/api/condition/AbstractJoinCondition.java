package org.wotif.core.api.condition;

import org.wotif.core.api.CompletableResult;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public abstract class AbstractJoinCondition<TYPE, CONDITION extends AbstractCondition<TYPE>> implements ICondition<TYPE> {

    protected List<CONDITION> conditions;

    protected Function<Function<? super CONDITION, CompletableResult>, CompletableResult> functionToApply;

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

    private CompletableResult allOf(Function<? super CONDITION, CompletableResult> method) {
        boolean value = conditions.stream().allMatch((c) -> method.apply(c).value());
        return new CompletableResult(value);
    }

    private CompletableResult anyOf(Function<? super CONDITION, CompletableResult> method) {
        boolean value = conditions.stream().anyMatch((c) -> method.apply(c).value());
        return new CompletableResult(value);
    }

    private CompletableResult noneOf(Function<? super CONDITION, CompletableResult> method) {
        boolean value = conditions.stream().noneMatch((c) -> method.apply(c).value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isEqualTo(TYPE expected) {
        return this.functionToApply.apply(b -> b.isEqualTo(expected));
    }

    @Override
    public CompletableResult isDifferentFrom(TYPE expected) {
        return this.functionToApply.apply(b -> b.isDifferentFrom(expected));
    }

    @Override
    public CompletableResult isNull() {
        return this.functionToApply.apply(AbstractCondition::isNull);
    }

    @Override
    public CompletableResult isNotNull() {
        return this.functionToApply.apply(AbstractCondition::isNotNull);
    }

    @Override
    public CompletableResult isInstanceOf(Class<?> className) {
        return this.functionToApply.apply(b -> b.isInstanceOf(className));
    }

    @Override
    public CompletableResult isNotInstanceOf(Class<?> className) {
        return this.functionToApply.apply(b -> b.isNotInstanceOf(className));
    }

}
