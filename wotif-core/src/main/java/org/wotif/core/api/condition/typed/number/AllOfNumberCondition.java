package org.wotif.core.api.condition.typed.number;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.join.AllOfAbstractCondition;
import java.util.List;

public abstract class AllOfNumberCondition<NUMBER extends Number & Comparable<NUMBER>, NUMBER_CONDITION extends AbstractNumberCondition<NUMBER>> extends AllOfAbstractCondition<NUMBER, NUMBER_CONDITION> implements INumberCondition<NUMBER> {

    public AllOfNumberCondition(List<NUMBER_CONDITION> conditions) { super(conditions); }

    @Override
    public CompletableResult isZero() { return allOf(n -> n.isZero().value()); }
    @Override
    public CompletableResult isDifferentFromZero() { return allOf(n -> n.isDifferentFromZero().value()); }
    @Override
    public CompletableResult isPositive() { return allOf(n -> n.isPositive().value()); }
    @Override
    public CompletableResult isNegative() { return allOf(n -> n.isNegative().value()); }
    @Override
    public CompletableResult isLessThen(NUMBER numberToCompare) { return allOf(n -> n.isLessThen(numberToCompare).value()); }
    @Override
    public CompletableResult isGreaterThen(NUMBER numberToCompare) { return allOf(n -> n.isGreaterThen(numberToCompare).value()); }
    @Override
    public CompletableResult isEqualTo(NUMBER expected) { return allOf(n -> n.isEqualTo(expected).value()); }
    @Override
    public CompletableResult isDifferentFrom(NUMBER expected) { return allOf(n -> n.isDifferentFrom(expected).value()); }

}
