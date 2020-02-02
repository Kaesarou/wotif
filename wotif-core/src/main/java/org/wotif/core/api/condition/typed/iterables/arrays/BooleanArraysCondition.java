package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.typed.iterables.AbstractIterableCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

import java.util.ArrayList;
import java.util.List;

public class BooleanArraysCondition extends AbstractIterableCondition<Boolean, boolean[]>
        implements IIterableCondition<Boolean, boolean[]> {

    public BooleanArraysCondition(boolean[] term) {
        super(term);
    }

    @Override
    protected Iterable<Boolean> iterable() {
        List<Boolean> booleans = new ArrayList<>();
        for (boolean b : this.term.value()) {
            booleans.add(b);
        }
        return booleans;
    }

}
