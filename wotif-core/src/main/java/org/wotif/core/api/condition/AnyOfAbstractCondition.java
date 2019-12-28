package org.wotif.core.api.condition;

import org.wotif.core.api.CompletableResult;

import java.util.List;

public abstract class AnyOfAbstractCondition<TYPE, CONDITION extends AbstractCondition<TYPE>> extends JoinCondition<TYPE,CONDITION> implements ICondition<TYPE> {

    protected AnyOfAbstractCondition(List<CONDITION> conditions) {
        super(conditions);
    }
    @Override
    public CompletableResult isEqualTo(TYPE expected) { return anyOf(b -> b.isEqualTo(expected).value()); }
    @Override
    public CompletableResult isDifferentFrom(TYPE expected) { return anyOf(b -> b.isDifferentFrom(expected).value()); }
    @Override
    public CompletableResult isNull() { return anyOf(b -> b.isNull().value()); }
    @Override
    public CompletableResult isNotNull() { return anyOf(b -> b.isNotNull().value()); }

}
