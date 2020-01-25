package org.wotif.core.api.condition.typed.number.integer;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.number.AbstractNumberJoinCondition;

public class IntegerJoinCondition extends AbstractNumberJoinCondition<Integer, IntegerCondition>{

    public IntegerJoinCondition(JoinEnum joinType, Integer... terms) {
        super(joinType, terms);
    }

    @Override
    protected IntegerCondition getInstanceOfCondition(Integer term) {
        return new IntegerCondition(term);
    }

}
