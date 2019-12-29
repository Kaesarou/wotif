package org.wotif.core.api.condition;

import org.wotif.core.api.CompletableResult;

import java.util.List;

public abstract class AllOfAbstractCondition <TYPE, CONDITION extends AbstractCondition<TYPE>> extends JoinCondition<TYPE,CONDITION> implements ICondition<TYPE> {

    protected AllOfAbstractCondition(List<CONDITION> conditions) {
        super(conditions);
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
