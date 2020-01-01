package org.wotif.core.api.condition.typed.number.integer;

import org.wotif.core.api.condition.typed.number.AllOfNumberCondition;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AllOfIntegerCondition extends AllOfNumberCondition<Integer, IntegerCondition> {

    public AllOfIntegerCondition(Integer... terms) {
        super(Arrays.stream(terms).map(IntegerCondition::new).collect(Collectors.toList()));
    }

}
