package org.wotif.core.api;

import java.util.function.Supplier;

public class ConditionResult {

    private boolean value;

    public boolean value() {
        return this.value;
    }

    public ConditionResult(boolean value) {
        this.value = value;
    }

    public InstructionsBlock<Void> then(CallBack callBack) {
        Instructions<Void> instructions = new Instructions<>(this, callBack);
        return new InstructionsBlock<>(instructions);
    }

    public <RETURN> InstructionsBlock<RETURN> then(Supplier<RETURN> supplier) {
        Instructions<RETURN> instructions = new Instructions<>(this, supplier);
        return new InstructionsBlock<>(instructions);
    }

}
