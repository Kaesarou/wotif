package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractJoinCondition;
import org.wotif.core.api.condition.JoinEnum;

public class StringJoinCondition extends AbstractJoinCondition<String,StringCondition> implements IStringCondition {

    public StringJoinCondition(JoinEnum joinType, String... terms) {
        super(joinType, terms);
    }

    @Override
    protected StringCondition getInstanceOfCondition(String term) {
        return new StringCondition(term);
    }

    @Override
    public CompletableResult contains(String contains) { return this.functionToApply.apply(s -> s.contains(contains).value()); }
    @Override
    public CompletableResult containsIgnoringCase(String contains) { return this.functionToApply.apply(s -> s.containsIgnoringCase(contains).value()); }
    @Override
    public CompletableResult notContains(String notContains) { return this.functionToApply.apply(s -> s.notContains(notContains).value()); }
    @Override
    public CompletableResult isEmpty() { return this.functionToApply.apply(s -> s.isEmpty().value()); }
    @Override
    public CompletableResult isNotEmpty() { return this.functionToApply.apply(s -> s.isNotEmpty().value()); }
    @Override
    public CompletableResult isBetween(String stringContainer,String start, String end) { return this.functionToApply.apply(s -> s.isBetween(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isBetweenIgnoringCase(String stringContainer, String start, String end) { return this.functionToApply.apply(s -> s.isBetweenIgnoringCase(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isNotBetween(String stringContainer, String start, String end) { return this.functionToApply.apply(s -> s.isNotBetween(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isNotBetweenIgnoringCase(String stringContainer, String start, String end) { return this.functionToApply.apply(s -> s.isNotBetweenIgnoringCase(stringContainer,start,end).value()); }
    @Override
    public CompletableResult isEqualToIgnoringCase(String string) { return this.functionToApply.apply(s -> s.isEqualToIgnoringCase(string).value()); }
    @Override
    public CompletableResult isDifferentFromIgnoringCase(String string) { return this.functionToApply.apply(s -> s.isDifferentFromIgnoringCase(string).value()); }
    @Override
    public CompletableResult isBlank() { return this.functionToApply.apply(s -> s.isBlank().value()); }
    @Override
    public CompletableResult isNotBlank() { return this.functionToApply.apply(s -> s.isNotBlank().value()); }

}
