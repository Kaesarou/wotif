package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.ConditionResult;

public class AllOfBooleanCondition extends JoinBooleanCondition {

    public AllOfBooleanCondition(Boolean... terms) { super(terms); }

    @Override
    public ConditionResult isTrue() { return allOf(b -> b.isTrue().value()); }

    @Override
    public ConditionResult isFalse() { return allOf(b -> b.isFalse().value()); }

    @Override
    public ConditionResult isEqualTo(Boolean expected) { return allOf(b -> b.isEqualTo(expected).value()); }

    @Override
    public ConditionResult isDifferentFrom(Boolean expected) { return allOf(b -> b.isDifferentFrom(expected).value()); }

    @Override
    public ConditionResult isNull() { return allOf(b -> b.isNull().value()); }

    @Override
    public ConditionResult isNotNull() { return allOf(b -> b.isNotNull().value()); }

}
