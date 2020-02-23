package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.typed.iterables.AbstractIterableCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IntArraysCondition extends AbstractIterableCondition<Integer, int[]>
        implements IIterableCondition<Integer, int[]> {

    public IntArraysCondition(int[] term) {
        super(term);
    }

    @Override
    protected Iterable<Integer> iterable() {
        return Arrays.stream(this.term.value()).boxed().collect(Collectors.toList());
    }

}
