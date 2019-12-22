package org.wotif.wotif.core;

import io.vavr.control.Either;

public class BooleanConditionalState extends AbstractConditionalState<Boolean> {

    BooleanConditionalState(Boolean value) {
        super(value);
    }

    @Override
    public BooleanConditionalState isTrue() {
        return this;
    }

    @Override
    public <RESULT> ConditionResult<RESULT> thenReturn(RESULT valueToReturn) {
        return new ConditionResult<RESULT>(this.value ? Either.right(valueToReturn) : Either.left(new ConditionResult<RESULT>()));
    }

}
