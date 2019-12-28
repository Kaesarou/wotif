package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;

public class NoneOfBooleanCondition extends JoinBooleanCondition {

    public NoneOfBooleanCondition(Boolean... terms) { super(terms); }

    @Override
    public CompletableResult isTrue() { return noneOf(b -> b.isTrue().value()); }

    @Override
    public CompletableResult isFalse() { return noneOf(b -> b.isFalse().value()); }

    @Override
    public CompletableResult isEqualTo(Boolean expected) { return noneOf(b -> b.isEqualTo(expected).value()); }

    @Override
    public CompletableResult isDifferentFrom(Boolean expected) { return noneOf(b -> b.isDifferentFrom(expected).value()); }

    @Override
    public CompletableResult isNull() { return noneOf(b -> b.isNull().value()); }

    @Override
    public CompletableResult isNotNull() { return noneOf(b -> b.isNotNull().value()); }
}
