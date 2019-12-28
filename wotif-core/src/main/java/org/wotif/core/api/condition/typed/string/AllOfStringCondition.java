package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AllOfAbstractCondition;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AllOfStringCondition extends AllOfAbstractCondition <String,StringCondition> implements IStringCondition {

    public AllOfStringCondition(String... terms) {
        super(Arrays.stream(terms).map(StringCondition::new).collect(Collectors.toList()));
    }

    @Override
    public CompletableResult contains(String contains) { return allOf( s-> s.contains(contains).value()); }

}
