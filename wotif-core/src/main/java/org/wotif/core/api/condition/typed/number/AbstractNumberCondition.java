package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.condition.AbstractCondition;

public abstract class AbstractNumberCondition<NUMBER_TYPE> extends AbstractCondition<NUMBER_TYPE> implements INumberCondition<NUMBER_TYPE> {

    AbstractNumberCondition(NUMBER_TYPE term) {
        super(term);
    }

}
