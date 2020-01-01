package org.wotif.core.api.condition;

import java.util.List;

public abstract class JoinCondition<TYPE, CONDITION extends AbstractCondition<TYPE> > {

    protected List<CONDITION> conditions;

    protected JoinCondition(List<CONDITION> conditions) {
        this.conditions = conditions;
    }

}
