package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.join.AnyOfAbstractCondition;

import java.util.List;

public abstract class AnyOfNumberCondition<NUMBER extends Number & Comparable<NUMBER>, NUMBER_CONDITION extends AbstractNumberCondition<NUMBER>> extends AnyOfAbstractCondition<NUMBER, NUMBER_CONDITION> implements INumberCondition<NUMBER> {

    public AnyOfNumberCondition(List<NUMBER_CONDITION> conditions) {
        super(conditions);
    }

    @Override
    public CompletableResult isPositive() { return anyOf(n -> n.isPositive().value()); }
    @Override
    public CompletableResult isNegative() { return anyOf(n -> n.isNegative().value()); }

}
