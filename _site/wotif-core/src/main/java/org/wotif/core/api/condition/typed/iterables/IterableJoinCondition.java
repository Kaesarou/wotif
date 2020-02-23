package org.wotif.core.api.condition.typed.iterables;

import org.wotif.core.api.condition.JoinEnum;

public class IterableJoinCondition<ITERABLE_TYPE>
        extends AbstractIterableJoinCondition<ITERABLE_TYPE, Iterable<ITERABLE_TYPE>>
        implements IIterableCondition<ITERABLE_TYPE, Iterable<ITERABLE_TYPE>> {

    @SafeVarargs
    public IterableJoinCondition(JoinEnum joinType, Iterable<ITERABLE_TYPE>... terms) {
        super(joinType, terms);
    }

    @Override
    protected IterableCondition<ITERABLE_TYPE> getInstanceOfCondition(Iterable<ITERABLE_TYPE> term) {
        return new IterableCondition<>(term);
    }

}
