package org.wotif.wotif.core;

public class BooleanConditionalState extends ConditionalState<Boolean> {

    BooleanConditionalState(Boolean value) {
        super(value);
    }

    public BooleanConditionalState isTrue() {
        return this;
    }

    public <T> T thenReturn(T valueToReturn) { return this.value ? valueToReturn : null; }

}
