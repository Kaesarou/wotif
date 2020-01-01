package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.condition.join.AllOfAbstractCondition;
import java.util.List;

public abstract class AnyOfNumberCondition<NUMBER_TYPE, NUMBER_CONDITION extends AbstractNumberCondition<NUMBER_TYPE>> extends AllOfAbstractCondition<NUMBER_TYPE, NUMBER_CONDITION> implements INumberCondition<NUMBER_TYPE> {

    public AnyOfNumberCondition(List<NUMBER_CONDITION> conditions) {
        super(conditions);
    }

}
