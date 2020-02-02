package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.typed.iterables.AbstractIterableCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

import java.util.ArrayList;
import java.util.List;

public class DoubleArraysCondition extends AbstractIterableCondition<Double, double[]>
        implements IIterableCondition<Double, double[]> {

    public DoubleArraysCondition(double[] term) {
        super(term);
    }

    @Override
    protected Iterable<Double> iterable() {
        List<Double> doubles = new ArrayList<>();
        for (double d : this.term.value()) {
            doubles.add(d);
        }
        return doubles;
    }

}
