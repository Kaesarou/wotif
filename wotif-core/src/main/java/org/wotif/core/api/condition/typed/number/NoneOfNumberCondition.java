package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.join.NoneOfAbstractCondition;
import java.util.List;

public abstract class NoneOfNumberCondition<NUMBER extends Number & Comparable<NUMBER>, NUMBER_CONDITION extends AbstractNumberCondition<NUMBER>> extends NoneOfAbstractCondition<NUMBER, NUMBER_CONDITION> implements INumberCondition<NUMBER> {

    public NoneOfNumberCondition(List<NUMBER_CONDITION> conditions) {
        super(conditions);
    }

    @Override
    public CompletableResult isZero() { return noneOf(n -> n.isZero().value()); }
    @Override
    public CompletableResult isDifferentFromZero() { return noneOf(n -> n.isDifferentFromZero().value()); }
    @Override
    public CompletableResult isPositive() { return noneOf(n -> n.isPositive().value()); }
    @Override
    public CompletableResult isNegative() { return noneOf(n -> n.isNegative().value()); }
    @Override
    public CompletableResult isLessThen(NUMBER numberToCompare) { return noneOf(n -> n.isLessThen(numberToCompare).value()); }
    @Override
    public CompletableResult isGreaterThen(NUMBER numberToCompare) { return noneOf(n -> n.isGreaterThen(numberToCompare).value()); }
    @Override
    public CompletableResult isEqualTo(NUMBER expected) { return noneOf(n -> n.isEqualTo(expected).value()); }
    @Override
    public CompletableResult isDifferentFrom(NUMBER expected) { return noneOf(n -> n.isDifferentFrom(expected).value()); }

}
