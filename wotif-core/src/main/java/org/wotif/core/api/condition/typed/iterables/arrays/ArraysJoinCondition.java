package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterables.AbstractIterableJoinCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

public class ArraysJoinCondition<ITERABLE_TYPE>
        extends AbstractIterableJoinCondition<ITERABLE_TYPE, ITERABLE_TYPE[]>
        implements IIterableCondition<ITERABLE_TYPE, ITERABLE_TYPE[]> {

    @SafeVarargs
    public ArraysJoinCondition(JoinEnum joinType, ITERABLE_TYPE[]... terms) {
        super(joinType, terms);
    }

    @Override
    protected ArraysCondition<ITERABLE_TYPE> getInstanceOfCondition(ITERABLE_TYPE[] term) {
        return new ArraysCondition<>(term);
    }

}
