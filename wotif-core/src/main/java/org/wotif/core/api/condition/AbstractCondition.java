package org.wotif.core.api.condition;

import org.wotif.core.api.Term;

public abstract class AbstractCondition<TYPE> {

    protected Term<TYPE> term;

    public AbstractCondition(TYPE term) {
        this.term = new Term<>(term);
    }

}
