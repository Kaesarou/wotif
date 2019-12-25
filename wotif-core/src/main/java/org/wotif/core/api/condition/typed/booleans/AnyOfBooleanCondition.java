package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.ConditionResult;

public class AnyOfBooleanCondition extends JoinBooleanCondition implements IBooleanCondition {

    public AnyOfBooleanCondition(Boolean... terms) {super(terms);}

    @Override
    public ConditionResult isTrue() { return anyOf(b -> b.isTrue().value()); }

    @Override
    public ConditionResult isFalse() { return anyOf(b -> b.isFalse().value()); }

    @Override
    public ConditionResult isEqualTo(Boolean expected) { return anyOf(b -> b.isEqualTo(expected).value()); }

    @Override
    public ConditionResult isDifferentFrom(Boolean expected) { return anyOf(b -> b.isDifferentFrom(expected).value()); }

    @Override
    public ConditionResult isNull() { return anyOf(b -> b.isNull().value()); }

    @Override
    public ConditionResult isNotNull() { return anyOf(b -> b.isNotNull().value()); }

}
