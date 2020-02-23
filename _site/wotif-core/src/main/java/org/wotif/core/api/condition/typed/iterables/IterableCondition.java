package org.wotif.core.api.condition.typed.iterables;

public class IterableCondition<ITERABLE_TYPE> extends AbstractIterableCondition<ITERABLE_TYPE, Iterable<ITERABLE_TYPE>>
        implements IIterableCondition<ITERABLE_TYPE, Iterable<ITERABLE_TYPE>> {

    public IterableCondition(Iterable<ITERABLE_TYPE> term) {
        super(term);
    }

    @Override
    protected Iterable<ITERABLE_TYPE> iterable() {
        return this.term.value();
    }

}
