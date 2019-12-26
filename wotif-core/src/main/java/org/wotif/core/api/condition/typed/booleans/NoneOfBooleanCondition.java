package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.Result;

public class NoneOfBooleanCondition extends JoinBooleanCondition {

    public NoneOfBooleanCondition(Boolean... terms) { super(terms); }

    @Override
    public Result isTrue() { return noneOf(b -> b.isTrue().value()); }

    @Override
    public Result isFalse() { return noneOf(b -> b.isFalse().value()); }

    @Override
    public Result isEqualTo(Boolean expected) { return noneOf(b -> b.isEqualTo(expected).value()); }

    @Override
    public Result isDifferentFrom(Boolean expected) { return noneOf(b -> b.isDifferentFrom(expected).value()); }

    @Override
    public Result isNull() { return noneOf(b -> b.isNull().value()); }

    @Override
    public Result isNotNull() { return noneOf(b -> b.isNotNull().value()); }
}
