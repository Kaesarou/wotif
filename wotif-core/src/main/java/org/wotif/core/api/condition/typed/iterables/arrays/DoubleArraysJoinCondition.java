package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterables.AbstractIterableJoinCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

public class DoubleArraysJoinCondition extends AbstractIterableJoinCondition<Double, double[]>
        implements IIterableCondition<Double, double[]> {

    public DoubleArraysJoinCondition(JoinEnum joinType, double[]... terms) {
        super(joinType, terms);
    }

    @Override
    protected DoubleArraysCondition getInstanceOfCondition(double[] term) {
        return new DoubleArraysCondition(term);
    }

}
