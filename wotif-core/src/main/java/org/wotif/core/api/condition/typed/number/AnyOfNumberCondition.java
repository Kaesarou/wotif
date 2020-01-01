package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.join.AnyOfAbstractCondition;

import java.util.List;

public abstract class AnyOfNumberCondition<NUMBER extends Number & Comparable<NUMBER>, NUMBER_CONDITION extends AbstractNumberCondition<NUMBER>> extends AnyOfAbstractCondition<NUMBER, NUMBER_CONDITION> implements INumberCondition<NUMBER> {

    public AnyOfNumberCondition(List<NUMBER_CONDITION> conditions) {
        super(conditions);
    }

    @Override
    public CompletableResult isZero() { return anyOf(n -> n.isZero().value()); }
    @Override
    public CompletableResult isDifferentFromZero() { return anyOf(n -> n.isDifferentFromZero().value()); }
    @Override
    public CompletableResult isPositive() { return anyOf(n -> n.isPositive().value()); }
    @Override
    public CompletableResult isNegative() { return anyOf(n -> n.isNegative().value()); }
    @Override
    public CompletableResult isLessThen(NUMBER numberToCompare) { return anyOf(n -> n.isLessThen(numberToCompare).value()); }
    @Override
    public CompletableResult isGreaterThen(NUMBER numberToCompare) { return anyOf(n -> n.isGreaterThen(numberToCompare).value()); }
    @Override
    public CompletableResult isEqualTo(NUMBER expected) { return anyOf(n -> n.isEqualTo(expected).value()); }
    @Override
    public CompletableResult isDifferentFrom(NUMBER expected) { return anyOf(n -> n.isDifferentFrom(expected).value()); }

}
