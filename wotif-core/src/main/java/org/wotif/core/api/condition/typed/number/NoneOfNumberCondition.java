package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.join.NoneOfAbstractCondition;
import java.util.List;

public abstract class NoneOfNumberCondition<NUMBER extends Number & Comparable<NUMBER>, NUMBER_CONDITION extends AbstractNumberCondition<NUMBER>> extends NoneOfAbstractCondition<NUMBER, NUMBER_CONDITION> implements INumberCondition<NUMBER> {

    public NoneOfNumberCondition(List<NUMBER_CONDITION> conditions) {
        super(conditions);
    }

    @Override
    public CompletableResult isPositive() { return noneOf(n -> n.isPositive().value()); }
    @Override
    public CompletableResult isNegative() { return noneOf(n -> n.isNegative().value()); }

}
