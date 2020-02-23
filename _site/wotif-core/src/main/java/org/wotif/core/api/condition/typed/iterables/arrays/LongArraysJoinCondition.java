package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterables.AbstractIterableJoinCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

public class LongArraysJoinCondition extends AbstractIterableJoinCondition<Long, long[]>
        implements IIterableCondition<Long, long[]> {

    public LongArraysJoinCondition(JoinEnum joinType, long[]... terms) {
        super(joinType, terms);
    }

    @Override
    protected LongArraysCondition getInstanceOfCondition(long[] term) {
        return new LongArraysCondition(term);
    }

}
