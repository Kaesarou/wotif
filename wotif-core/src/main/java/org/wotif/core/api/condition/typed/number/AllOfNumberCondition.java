package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.join.AllOfAbstractCondition;
import java.util.List;

public abstract class AllOfNumberCondition<NUMBER extends Number & Comparable<NUMBER>, NUMBER_CONDITION extends AbstractNumberCondition<NUMBER>> extends AllOfAbstractCondition<NUMBER, NUMBER_CONDITION> implements INumberCondition<NUMBER> {

    public AllOfNumberCondition(List<NUMBER_CONDITION> conditions) { super(conditions); }

    @Override
    public CompletableResult isPositive() { return allOf(n -> n.isPositive().value()); }
    @Override
    public CompletableResult isNegative() { return allOf(n -> n.isNegative().value()); }

}
