package org.wotif.core.api.condition.typed.number.shorts;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.number.AbstractNumberJoinCondition;

public class ShortJoinCondition extends AbstractNumberJoinCondition<Short, ShortCondition> {

    public ShortJoinCondition(JoinEnum joinType, Short... terms) {
        super(joinType, terms);
    }

    @Override
    protected ShortCondition getInstanceOfCondition(Short term) {
        return new ShortCondition(term);
    }

}
