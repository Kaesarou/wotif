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
    @Override
    public CompletableResult containsIgnoringCase(String contains) { return noneOf(s -> s.containsIgnoringCase(contains).value()); }
    @Override
    public CompletableResult notContains(String notContains) { return noneOf(s -> s.notContains(notContains).value()); }
    @Override
    public CompletableResult isEmpty() { return noneOf(s -> s.isEmpty().value()); }
    @Override
    public CompletableResult isNotEmpty() { return noneOf(s -> s.isNotEmpty().value()); }
    @Override
    public CompletableResult isBetween(String stringContainer,String start, String end) { return noneOf(s -> s.isBetween(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isBetweenIgnoringCase(String stringContainer, String start, String end) { return noneOf(s -> s.isBetweenIgnoringCase(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isNotBetween(String stringContainer, String start, String end) { return noneOf(s -> s.isNotBetween(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isNotBetweenIgnoringCase(String stringContainer, String start, String end) { return noneOf(s -> s.isNotBetweenIgnoringCase(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isEqualToIgnoringCase(String string) { return noneOf(s -> s.isEqualToIgnoringCase(string).value()); }
    @Override
    public CompletableResult isDifferentFromIgnoringCase(String string) { return noneOf(s -> s.isDifferentFromIgnoringCase(string).value()); }
    @Override
    public CompletableResult isBlank() { return noneOf(s -> s.isBlank().value()); }
    @Override
    public CompletableResult isNotBlank() { return noneOf(s -> s.isNotBlank().value()); }

}
