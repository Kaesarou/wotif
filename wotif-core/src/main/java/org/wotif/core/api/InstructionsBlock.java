package org.wotif.core.api;

import java.util.function.Supplier;

public class InstructionsBlock<RETURN> {

    private Instructions<RETURN> previousInstructions;

    public InstructionsBlock(Instructions<RETURN> instructions) {
        this.previousInstructions = instructions;
    }

    private InstructionsBlock<RETURN> instructionsBlock(ConditionResult result, CallBack callBack) {
        if (this.previousInstructions.result().value())
            return this;
        Instructions<RETURN> newEvaluation = new Instructions<>(result, callBack);
        return new InstructionsBlock<>(newEvaluation);
    }

    private InstructionsBlock<RETURN> instructionsBlock(ConditionResult result, Supplier<RETURN> supplier) {
        if (this.previousInstructions.result().value())
            return this;
        Instructions<RETURN> newEvaluation = new Instructions<>(result, supplier);
        return new InstructionsBlock<>(newEvaluation);
    }

    public InstructionsBlock<RETURN> orElse(CallBack callBack) {
        return instructionsBlock(new ConditionResult(true), callBack);
    }

    public InstructionsBlock<RETURN> orElse(Supplier<RETURN> supplier) {
        return instructionsBlock(new ConditionResult(true), supplier);
    }

    public InstructionsBlock<RETURN> orElse(ConditionResult anotherConditionResult, CallBack callBack) {
        return instructionsBlock(anotherConditionResult, callBack);
    }

    public InstructionsBlock<RETURN> orElse(ConditionResult anotherConditionResult, Supplier<RETURN> supplier) {
        return instructionsBlock(anotherConditionResult, supplier);
    }

    public RETURN endIF() {
        if (this.previousInstructions.result().value())
            return this.previousInstructions.executeAction();
        return null;
    }

}
