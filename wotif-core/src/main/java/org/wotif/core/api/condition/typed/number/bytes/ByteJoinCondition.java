package org.wotif.core.api.condition.typed.number.bytes;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.number.AbstractNumberJoinCondition;

public class ByteJoinCondition extends AbstractNumberJoinCondition<Byte, ByteCondition> {

    public ByteJoinCondition(JoinEnum joinType, Byte... terms) {
        super(joinType, terms);
    }

    @Override
    protected ByteCondition getInstanceOfCondition(Byte term) {
        return new ByteCondition(term);
    }

}
