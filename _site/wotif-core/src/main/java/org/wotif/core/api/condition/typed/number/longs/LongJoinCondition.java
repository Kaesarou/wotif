package org.wotif.core.api.condition.typed.number.longs;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.number.AbstractNumberJoinCondition;

public class LongJoinCondition extends AbstractNumberJoinCondition<Long, LongCondition> {

    public LongJoinCondition(JoinEnum joinType, Long... terms) {
        super(joinType, terms);
    }

    @Override
    protected LongCondition getInstanceOfCondition(Long term) {
        return new LongCondition(term);
    }

}
