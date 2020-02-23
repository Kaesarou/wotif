package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.typed.iterables.AbstractIterableCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

import java.util.ArrayList;
import java.util.List;

public class FloatArraysCondition extends AbstractIterableCondition<Float, float[]>
        implements IIterableCondition<Float, float[]> {

    public FloatArraysCondition(float[] term) {
        super(term);
    }

    @Override
    protected Iterable<Float> iterable() {
        List<Float> floats = new ArrayList<>();
        for (float f : this.term.value()) {
            floats.add(f);
        }
        return floats;
    }

}
