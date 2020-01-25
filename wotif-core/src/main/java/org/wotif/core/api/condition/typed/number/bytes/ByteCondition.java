package org.wotif.core.api.condition.typed.number.bytes;

import org.wotif.core.api.condition.typed.number.AbstractNumberCondition;

public class ByteCondition extends AbstractNumberCondition<Byte> {

    public ByteCondition(Byte term) {
        super(term);
    }

    @Override
    protected Byte zero() {
        return 0;
    }

}
