package org.wotif.core.api.condition.typed.number.integer;

import org.wotif.core.api.condition.typed.number.NoneOfNumberCondition;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NoneOfIntegerCondition extends NoneOfNumberCondition<Integer, IntegerCondition> {

    public NoneOfIntegerCondition(Integer... terms) {
        super(Arrays.stream(terms).map(IntegerCondition::new).collect(Collectors.toList()));
    }

}
