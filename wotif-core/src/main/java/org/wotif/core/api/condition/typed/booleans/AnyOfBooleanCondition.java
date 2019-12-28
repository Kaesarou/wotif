package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;

public class AnyOfBooleanCondition extends JoinBooleanCondition implements IBooleanCondition {

    public AnyOfBooleanCondition(Boolean... terms) {super(terms);}

    @Override
    public CompletableResult isTrue() { return anyOf(b -> b.isTrue().value()); }

    @Override
    public CompletableResult isFalse() { return anyOf(b -> b.isFalse().value()); }

    @Override
    public CompletableResult isEqualTo(Boolean expected) { return anyOf(b -> b.isEqualTo(expected).value()); }

    @Override
    public CompletableResult isDifferentFrom(Boolean expected) { return anyOf(b -> b.isDifferentFrom(expected).value()); }

    @Override
    public CompletableResult isNull() { return anyOf(b -> b.isNull().value()); }

    @Override
    public CompletableResult isNotNull() { return anyOf(b -> b.isNotNull().value()); }

}
