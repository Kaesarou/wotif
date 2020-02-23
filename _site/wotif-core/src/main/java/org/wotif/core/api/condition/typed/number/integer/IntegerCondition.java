package org.wotif.core.api.condition.typed.number.integer;

import org.wotif.core.api.condition.typed.number.AbstractNumberCondition;

public class IntegerCondition extends AbstractNumberCondition<Integer> {

    public IntegerCondition(Integer term) {
        super(term);
    }

    @Override
    protected Integer zero() {
        return 0;
    }

}
