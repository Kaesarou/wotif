package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.typed.iterables.AbstractIterableCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

import java.util.Arrays;

public class ArraysCondition<ITERABLE_TYPE> extends AbstractIterableCondition<ITERABLE_TYPE, ITERABLE_TYPE[]>
        implements IIterableCondition<ITERABLE_TYPE, ITERABLE_TYPE[]> {

    public ArraysCondition(ITERABLE_TYPE[] term) {
        super(term);
    }

    @Override
    protected Iterable<ITERABLE_TYPE> iterable() {
        return Arrays.asList(this.term.value());
    }

}
