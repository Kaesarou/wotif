package org.wotif.core.api.condition.typed.number.integer;

import org.wotif.core.api.condition.typed.number.AnyOfNumberCondition;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnyOfIntegerCondition extends AnyOfNumberCondition<Integer, IntegerCondition> {

    public AnyOfIntegerCondition(Integer... terms) {
        super(Arrays.stream(terms).map(IntegerCondition::new).collect(Collectors.toList()));
    }

}
