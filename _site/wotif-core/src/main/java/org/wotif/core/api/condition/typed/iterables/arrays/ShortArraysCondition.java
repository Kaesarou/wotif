package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.typed.iterables.AbstractIterableCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

import java.util.ArrayList;
import java.util.List;

public class ShortArraysCondition extends AbstractIterableCondition<Short, short[]>
        implements IIterableCondition<Short, short[]> {

    public ShortArraysCondition(short[] term) {
        super(term);
    }

    @Override
    protected Iterable<Short> iterable() {
        List<Short> shorts = new ArrayList<>();
        for (short s : this.term.value()) {
            shorts.add(s);
        }
        return shorts;
    }

}
