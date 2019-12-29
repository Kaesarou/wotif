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
    public CompletableResult contains(String contains) { return allOf( s -> s.contains(contains).value()); }
    @Override
    public CompletableResult containsIgnoringCase(String contains) { return allOf(s -> s.containsIgnoringCase(contains).value()); }
    @Override
    public CompletableResult notContains(String notContains) { return allOf(s -> s.notContains(notContains).value()); }
    @Override
    public CompletableResult isEmpty() { return allOf(s -> s.isEmpty().value()); }
    @Override
    public CompletableResult isNotEmpty() { return allOf(s -> s.isNotEmpty().value()); }
    @Override
    public CompletableResult isBetween(String stringContainer,String start, String end) { return allOf(s -> s.isBetween(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isBetweenIgnoringCase(String stringContainer, String start, String end) { return allOf(s -> s.isBetweenIgnoringCase(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isNotBetween(String stringContainer, String start, String end) { return allOf(s -> s.isNotBetween(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isNotBetweenIgnoringCase(String stringContainer, String start, String end) { return allOf(s -> s.isNotBetweenIgnoringCase(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isEqualToIgnoringCase(String string) { return allOf(s -> s.isEqualToIgnoringCase(string).value()); }
    @Override
    public CompletableResult isDifferentFromIgnoringCase(String string) { return allOf(s -> s.isDifferentFromIgnoringCase(string).value()); }
    @Override
    public CompletableResult isBlank() { return allOf(s -> s.isBlank().value()); }
    @Override
    public CompletableResult isNotBlank() { return allOf(s -> s.isNotBlank().value()); }

}
