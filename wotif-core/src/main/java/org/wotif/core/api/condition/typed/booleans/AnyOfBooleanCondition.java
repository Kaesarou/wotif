package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.join.AnyOfAbstractCondition;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AnyOfBooleanCondition extends AnyOfAbstractCondition<Boolean, BooleanCondition> implements IBooleanCondition {

    public AnyOfBooleanCondition(Boolean... terms) {
        super(Arrays.stream(terms).map(BooleanCondition::new).collect(Collectors.toList()));
    }

    @Override
    public CompletableResult isTrue() { return anyOf(b -> b.isTrue().value()); }

    @Override
    public CompletableResult isFalse() { return anyOf(b -> b.isFalse().value()); }

}
