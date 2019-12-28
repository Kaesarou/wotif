package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.NoneOfAbstractCondition;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NoneOfStringCondition extends NoneOfAbstractCondition<String,StringCondition> implements IStringCondition {

    public NoneOfStringCondition(String... terms) {
        super(Arrays.stream(terms).map(StringCondition::new).collect(Collectors.toList()));
    }

    @Override
    public CompletableResult contains(String contains) { return noneOf( s-> s.contains(contains).value()); }

}
