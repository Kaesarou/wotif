package org.wotif.core.api.condition.typed.booleans;

import org.wotif.core.api.condition.JoinCondition;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class JoinBooleanCondition extends JoinCondition<Boolean, BooleanCondition> implements IBooleanCondition {

    protected JoinBooleanCondition(Boolean... terms) {
        super(Arrays.stream(terms).map(BooleanCondition::new).collect(Collectors.toList()));
    }

}
