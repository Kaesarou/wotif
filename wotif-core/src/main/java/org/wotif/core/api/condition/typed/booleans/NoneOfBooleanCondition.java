package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.NoneOfAbstractCondition;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NoneOfBooleanCondition extends NoneOfAbstractCondition <Boolean, BooleanCondition> implements IBooleanCondition {

    public NoneOfBooleanCondition(Boolean... terms) {
        super(Arrays.stream(terms).map(BooleanCondition::new).collect(Collectors.toList()));
    }

    @Override
    public CompletableResult isTrue() { return noneOf(b -> b.isTrue().value()); }

    @Override
    public CompletableResult isFalse() { return noneOf(b -> b.isFalse().value()); }

}
