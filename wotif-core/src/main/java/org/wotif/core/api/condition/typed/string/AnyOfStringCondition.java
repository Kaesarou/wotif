package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AnyOfAbstractCondition;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AnyOfStringCondition extends AnyOfAbstractCondition<String,StringCondition> implements IStringCondition {

    public AnyOfStringCondition(String... terms) {
        super(Arrays.stream(terms).map(StringCondition::new).collect(Collectors.toList()));
    }

    @Override
    public CompletableResult contains(String contains) { return anyOf( s-> s.contains(contains).value()); }

}
