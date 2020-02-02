package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterables.AbstractIterableJoinCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

public class BooleanArraysJoinCondition extends AbstractIterableJoinCondition<Boolean, boolean[]>
        implements IIterableCondition<Boolean, boolean[]> {

    public BooleanArraysJoinCondition(JoinEnum joinType, boolean[]... terms) {
        super(joinType, terms);
    }

    @Override
    protected BooleanArraysCondition getInstanceOfCondition(boolean[] term) {
        return new BooleanArraysCondition(term);
    }

}
