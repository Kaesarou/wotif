package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.condition.AbstractCondition;


public abstract class AbstractBooleanCondition extends AbstractCondition<Boolean> implements IBooleanCondition {

    AbstractBooleanCondition(Boolean term) {
        super(term);
    }

}
