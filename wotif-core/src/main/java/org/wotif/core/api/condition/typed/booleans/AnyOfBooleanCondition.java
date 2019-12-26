package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.Result;

public class AnyOfBooleanCondition extends JoinBooleanCondition implements IBooleanCondition {

    public AnyOfBooleanCondition(Boolean... terms) {super(terms);}

    @Override
    public Result isTrue() { return anyOf(b -> b.isTrue().value()); }

    @Override
    public Result isFalse() { return anyOf(b -> b.isFalse().value()); }

    @Override
    public Result isEqualTo(Boolean expected) { return anyOf(b -> b.isEqualTo(expected).value()); }

    @Override
    public Result isDifferentFrom(Boolean expected) { return anyOf(b -> b.isDifferentFrom(expected).value()); }

    @Override
    public Result isNull() { return anyOf(b -> b.isNull().value()); }

    @Override
    public Result isNotNull() { return anyOf(b -> b.isNotNull().value()); }

}
