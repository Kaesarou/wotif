package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.join.AllOfAbstractCondition;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AllOfBooleanCondition extends AllOfAbstractCondition<Boolean, BooleanCondition> implements IBooleanCondition {

    public AllOfBooleanCondition(Boolean... terms) {
        super(Arrays.stream(terms).map(BooleanCondition::new).collect(Collectors.toList()));
    }

    @Override
    public CompletableResult isTrue() { return allOf(b -> b.isTrue().value()); }

    @Override
    public CompletableResult isFalse() { return allOf(b -> b.isFalse().value()); }

}
