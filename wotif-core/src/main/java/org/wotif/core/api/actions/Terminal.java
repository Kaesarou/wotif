package org.wotif.core.api.actions;

public abstract class Terminal<RETURN> {

    protected Evaluate<RETURN> previousEvaluation;

    public RETURN endIF() {
        return this.previousEvaluation.executeAction();
    }

}
