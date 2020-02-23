package org.wotif.core.api.condition.typed.number.longs;

import org.wotif.core.api.condition.typed.number.AbstractNumberCondition;

public class LongCondition extends AbstractNumberCondition<Long> {

    public LongCondition(Long term) {
        super(term);
    }

    @Override
    protected Long zero() {
        return 0L;
    }

}
