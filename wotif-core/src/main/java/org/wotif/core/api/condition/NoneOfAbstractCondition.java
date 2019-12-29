package org.wotif.core.api.condition;

import org.wotif.core.api.CompletableResult;

import java.util.List;

public abstract class NoneOfAbstractCondition <TYPE, CONDITION extends AbstractCondition<TYPE>> extends JoinCondition<TYPE,CONDITION> implements ICondition<TYPE> {

    protected NoneOfAbstractCondition(List<CONDITION> conditions) {
        super(conditions);
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
