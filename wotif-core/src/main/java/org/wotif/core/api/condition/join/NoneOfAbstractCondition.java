package org.wotif.core.api.condition.join;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractCondition;
import org.wotif.core.api.condition.ICondition;
import org.wotif.core.api.condition.JoinCondition;

import java.util.List;
import java.util.function.Predicate;

public abstract class NoneOfAbstractCondition <TYPE, CONDITION extends AbstractCondition<TYPE>> extends JoinCondition<TYPE,CONDITION> implements ICondition<TYPE> {

    protected NoneOfAbstractCondition(List<CONDITION> conditions) {
        super(conditions);
    }

    protected CompletableResult noneOf(Predicate<? super CONDITION> method) {
        boolean value = conditions.stream().noneMatch(method);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isEqualTo(TYPE expected) { return noneOf(b -> b.isEqualTo(expected).value()); }
    @Override
    public CompletableResult isDifferentFrom(TYPE expected) { return noneOf(b -> b.isDifferentFrom(expected).value()); }
    @Override
    public CompletableResult isNull() { return noneOf(b -> b.isNull().value()); }
    @Override
    public CompletableResult isNotNull() { return noneOf(b -> b.isNotNull().value()); }
    @Override
    public CompletableResult isInstanceOf(Class<?> className) { return noneOf(b -> b.isInstanceOf(className).value()); }
    @Override
    public CompletableResult isNotInstanceOf(Class<?> className) { return noneOf(b -> b.isNotInstanceOf(className).value()); }

}
