package org.wotif.core.api.condition.join;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractCondition;
import org.wotif.core.api.condition.ICondition;
import org.wotif.core.api.condition.JoinCondition;

import java.util.List;
import java.util.function.Predicate;

public abstract class AllOfAbstractCondition <TYPE, CONDITION extends AbstractCondition<TYPE>> extends JoinCondition<TYPE,CONDITION> implements ICondition<TYPE> {

    protected AllOfAbstractCondition(List<CONDITION> conditions) {
        super(conditions);
    }

    protected CompletableResult allOf(Predicate<? super CONDITION> method) {
        boolean value = conditions.stream().allMatch(method);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isEqualTo(TYPE expected) { return allOf(b -> b.isEqualTo(expected).value()); }
    @Override
    public CompletableResult isDifferentFrom(TYPE expected) { return allOf(b -> b.isDifferentFrom(expected).value()); }
    @Override
    public CompletableResult isNull() { return allOf(b -> b.isNull().value()); }
    @Override
    public CompletableResult isNotNull() { return allOf(b -> b.isNotNull().value()); }
    @Override
    public CompletableResult isInstanceOf(Class<?> className) { return allOf(b -> b.isInstanceOf(className).value()); }
    @Override
    public CompletableResult isNotInstanceOf(Class<?> className) { return allOf(b -> b.isNotInstanceOf(className).value()); }

}
