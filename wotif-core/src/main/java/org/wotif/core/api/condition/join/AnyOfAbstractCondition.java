package org.wotif.core.api.condition.join;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractCondition;
import org.wotif.core.api.condition.ICondition;
import org.wotif.core.api.condition.JoinCondition;

import java.util.List;
import java.util.function.Predicate;

public abstract class AnyOfAbstractCondition<TYPE, CONDITION extends AbstractCondition<TYPE>> extends JoinCondition<TYPE,CONDITION> implements ICondition<TYPE> {

    protected AnyOfAbstractCondition(List<CONDITION> conditions) {
        super(conditions);
    }

    protected CompletableResult anyOf(Predicate<? super CONDITION> method) {
        boolean value = conditions.stream().anyMatch(method);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isEqualTo(TYPE expected) { return anyOf(b -> b.isEqualTo(expected).value()); }
    @Override
    public CompletableResult isDifferentFrom(TYPE expected) { return anyOf(b -> b.isDifferentFrom(expected).value()); }
    @Override
    public CompletableResult isNull() { return anyOf(b -> b.isNull().value()); }
    @Override
    public CompletableResult isNotNull() { return anyOf(b -> b.isNotNull().value()); }
    @Override
    public CompletableResult isInstanceOf(Class<?> className) { return anyOf(b -> b.isInstanceOf(className).value()); }
    @Override
    public CompletableResult isNotInstanceOf(Class<?> className) { return anyOf(b -> b.isNotInstanceOf(className).value()); }

}
