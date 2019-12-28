package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;

public class AllOfBooleanCondition extends JoinBooleanCondition {

    public AllOfBooleanCondition(Boolean... terms) { super(terms); }

    @Override
    public CompletableResult isTrue() { return allOf(b -> b.isTrue().value()); }

    @Override
    public CompletableResult isFalse() { return allOf(b -> b.isFalse().value()); }

    @Override
    public CompletableResult isEqualTo(Boolean expected) { return allOf(b -> b.isEqualTo(expected).value()); }

    @Override
    public CompletableResult isDifferentFrom(Boolean expected) { return allOf(b -> b.isDifferentFrom(expected).value()); }

    @Override
    public CompletableResult isNull() { return allOf(b -> b.isNull().value()); }

    @Override
    public CompletableResult isNotNull() { return allOf(b -> b.isNotNull().value()); }

}
