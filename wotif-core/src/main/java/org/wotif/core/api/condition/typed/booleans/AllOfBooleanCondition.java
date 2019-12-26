package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.Result;

public class AllOfBooleanCondition extends JoinBooleanCondition {

    public AllOfBooleanCondition(Boolean... terms) { super(terms); }

    @Override
    public Result isTrue() { return allOf(b -> b.isTrue().value()); }

    @Override
    public Result isFalse() { return allOf(b -> b.isFalse().value()); }

    @Override
    public Result isEqualTo(Boolean expected) { return allOf(b -> b.isEqualTo(expected).value()); }

    @Override
    public Result isDifferentFrom(Boolean expected) { return allOf(b -> b.isDifferentFrom(expected).value()); }

    @Override
    public Result isNull() { return allOf(b -> b.isNull().value()); }

    @Override
    public Result isNotNull() { return allOf(b -> b.isNotNull().value()); }

}
