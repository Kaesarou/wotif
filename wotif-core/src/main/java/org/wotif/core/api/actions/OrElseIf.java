package org.wotif.core.api.actions;

import org.wotif.core.api.CallBack;

import java.util.function.Supplier;

public class OrElseIf<RETURN> {

    private Evaluate<RETURN> currentEvaluation;

    public OrElseIf(Evaluate<RETURN> evaluate) {
        this.currentEvaluation = evaluate;
    }

    public Then<RETURN> then(CallBack callBack) {
        if (currentEvaluation.result().value() && !currentEvaluation.isLocked()) {
            Evaluate<RETURN> evaluate = new Evaluate<>(this.currentEvaluation.result(), callBack, true);
            return new Then<>(evaluate);
        }
        return new Then<>(currentEvaluation);

    }

    public Then<RETURN> then(Supplier<RETURN> supplier) {
        if (currentEvaluation.result().value() && !currentEvaluation.isLocked()) {
            Evaluate<RETURN> evaluate = new Evaluate<>(this.currentEvaluation.result(), supplier, true);
            return new Then<>(evaluate);
        }
        return new Then<>(currentEvaluation);
    }


}
