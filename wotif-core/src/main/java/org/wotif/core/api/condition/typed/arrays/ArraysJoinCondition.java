package org.wotif.core.api.condition.typed.arrays;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractJoinCondition;
import org.wotif.core.api.condition.JoinEnum;

public class ArraysJoinCondition<ELEMENT_TYPE>
        extends AbstractJoinCondition<ELEMENT_TYPE[], ArraysCondition<ELEMENT_TYPE>>
        implements IArraysCondition<ELEMENT_TYPE> {

    @SafeVarargs
    public ArraysJoinCondition(JoinEnum joinType, ELEMENT_TYPE[]... terms) {
        super(joinType, terms);
    }

    @Override
    protected ArraysCondition<ELEMENT_TYPE> getInstanceOfCondition(ELEMENT_TYPE[] term) {
        return new ArraysCondition<>(term);
    }

    @Override
    public CompletableResult contains(ELEMENT_TYPE... values) {
        return this.functionToApply.apply(a -> a.contains(values).value());
    }

}
