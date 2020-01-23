package org.wotif.core.api.actions;

import org.wotif.core.api.CallBack;
import org.wotif.core.api.Result;

import java.util.function.Supplier;

public class Then<RETURN> extends Terminal<RETURN> {

    public Then(Evaluate<RETURN> evaluate) {
        this.previousEvaluation = evaluate;
    }

    public OrElse<RETURN> orElse(CallBack callBack) {
        if (this.previousEvaluation.result().value())
            return new OrElse<>(this.previousEvaluation);
        Evaluate<RETURN> newEvaluation = new Evaluate<>(new Result(true), callBack, true);
        return new OrElse<>(newEvaluation);
    }

    public OrElse<RETURN> orElse(Supplier<RETURN> supplier) {
        if (this.previousEvaluation.result().value())
            return new OrElse<>(this.previousEvaluation);
        Evaluate<RETURN> newEvaluation = new Evaluate<>(new Result(true), supplier, true);
        return new OrElse<>(newEvaluation);
    }

    public OrElseIf<RETURN> orElse(Result anotherStatementResult) {
        if (this.previousEvaluation.result().value())
            return new OrElseIf<>(this.previousEvaluation);
        Evaluate<RETURN> newEvaluation = new Evaluate<>(anotherStatementResult);
        return new OrElseIf<>(newEvaluation);
    }

}
