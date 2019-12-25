package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.ConditionResult;

public class NoneOfBooleanCondition extends JoinBooleanCondition {

    public NoneOfBooleanCondition(Boolean... terms) { super(terms); }

    @Override
    public ConditionResult isTrue() { return noneOf(b -> b.isTrue().value()); }

    @Override
    public ConditionResult isFalse() { return noneOf(b -> b.isFalse().value()); }

    @Override
    public ConditionResult isEqualTo(Boolean expected) { return noneOf(b -> b.isEqualTo(expected).value()); }

    @Override
    public ConditionResult isDifferentFrom(Boolean expected) { return noneOf(b -> b.isDifferentFrom(expected).value()); }

    @Override
    public ConditionResult isNull() { return noneOf(b -> b.isNull().value()); }

    @Override
    public ConditionResult isNotNull() { return noneOf(b -> b.isNotNull().value()); }
}
