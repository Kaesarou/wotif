package org.wotif.core.api.actions;

public class OrElse<RETURN> extends Terminal<RETURN> {

    public OrElse(Evaluate<RETURN> previousEvaluation) {
        this.previousEvaluation = previousEvaluation;
    }

}
