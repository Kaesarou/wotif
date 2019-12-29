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
    @Override
    public CompletableResult containsIgnoringCase(String contains) { return anyOf(s -> s.containsIgnoringCase(contains).value()); }
    @Override
    public CompletableResult notContains(String notContains) { return anyOf(s -> s.notContains(notContains).value()); }
    @Override
    public CompletableResult isEmpty() { return anyOf(s -> s.isEmpty().value()); }
    @Override
    public CompletableResult isNotEmpty() { return anyOf(s -> s.isNotEmpty().value()); }
    @Override
    public CompletableResult isBetween(String stringContainer,String start, String end) { return anyOf(s -> s.isBetween(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isBetweenIgnoringCase(String stringContainer,String start, String end) { return anyOf(s -> s.isBetweenIgnoringCase(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isNotBetween(String stringContainer,String start, String end) { return anyOf(s -> s.isNotBetween(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isNotBetweenIgnoringCase(String stringContainer,String start, String end) { return anyOf(s -> s.isNotBetweenIgnoringCase(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isEqualToIgnoringCase(String string) { return anyOf(s -> s.isEqualToIgnoringCase(string).value()); }
    @Override
    public CompletableResult isDifferentFromIgnoringCase(String string) { return anyOf(s -> s.isDifferentFromIgnoringCase(string).value()); }
    @Override
    public CompletableResult isBlank() { return anyOf(s -> s.isBlank().value()); }
    @Override
    public CompletableResult isNotBlank() { return anyOf(s -> s.isNotBlank().value()); }

}
