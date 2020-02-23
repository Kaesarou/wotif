package org.wotif.core.api.condition.typed.number.shorts;

import org.wotif.core.api.condition.typed.number.AbstractNumberCondition;

public class ShortCondition extends AbstractNumberCondition<Short> {

    public ShortCondition(Short term) {
        super(term);
    }

    @Override
    protected Short zero() {
        return 0;
    }

}
