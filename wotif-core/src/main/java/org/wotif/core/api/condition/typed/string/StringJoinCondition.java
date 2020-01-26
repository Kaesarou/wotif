package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.ComparableJoinCondition;

public class StringJoinCondition extends ComparableJoinCondition<String, StringCondition> implements IStringCondition {

    public StringJoinCondition(JoinEnum joinType, String... terms) {
        super(joinType, terms);
    }

    @Override
    protected StringCondition getInstanceOfCondition(String term) {
        return new StringCondition(term);
    }

    @Override
    public CompletableResult contains(String contains) {
        return this.functionToApply.apply(s -> s.contains(contains).value());
    }

    @Override
    public CompletableResult containsIgnoringCase(String contains) {
        return this.functionToApply.apply(s -> s.containsIgnoringCase(contains).value());
    }

    @Override
    public CompletableResult notContains(String notContains) {
        return this.functionToApply.apply(s -> s.notContains(notContains).value());
    }

    @Override
    public CompletableResult isEmpty() {
        return this.functionToApply.apply(s -> s.isEmpty().value());
    }

    @Override
    public CompletableResult isNotEmpty() {
        return this.functionToApply.apply(s -> s.isNotEmpty().value());
    }

    @Override
    public CompletableResult isContainedIn(String stringContainer) {
        return this.functionToApply.apply(s -> s.isContainedIn(stringContainer).value());
    }

    @Override
    public CompletableResult isNotContainedIn(String stringContainer) {
        return this.functionToApply.apply(s -> s.isNotContainedIn(stringContainer).value());
    }

    @Override
    public CompletableResult isContainedInIgnoreCase(String stringContainer) {
        return this.functionToApply.apply(s -> s.isContainedInIgnoreCase(stringContainer).value());
    }

    @Override
    public CompletableResult isNotContainedInIgnoreCase(String stringContainer) {
        return this.functionToApply.apply(s -> s.isNotContainedInIgnoreCase(stringContainer).value());
    }

    @Override
    public CompletableResult isContainedInSubstring(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isContainedInSubstring(stringContainer, start, end).value());
    }

    @Override
    public CompletableResult isContainedInSubstringIgnoreCase(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isContainedInSubstringIgnoreCase(stringContainer, start, end).value());
    }

    @Override
    public CompletableResult isNotContainedInSubstring(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isNotContainedInSubstring(stringContainer, start, end).value());
    }

    @Override
    public CompletableResult isNotContainedInSubstringIgnoreCase(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isNotContainedInSubstringIgnoreCase(stringContainer, start, end).value());
    }

    @Override
    public CompletableResult isEqualToIgnoringCase(String string) {
        return this.functionToApply.apply(s -> s.isEqualToIgnoringCase(string).value());
    }

    @Override
    public CompletableResult isDifferentFromIgnoringCase(String string) {
        return this.functionToApply.apply(s -> s.isDifferentFromIgnoringCase(string).value());
    }

    @Override
    public CompletableResult isBlank() {
        return this.functionToApply.apply(s -> s.isBlank().value());
    }

    @Override
    public CompletableResult isNotBlank() {
        return this.functionToApply.apply(s -> s.isNotBlank().value());
    }

}
