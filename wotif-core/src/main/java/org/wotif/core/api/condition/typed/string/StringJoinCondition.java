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
        return this.functionToApply.apply(s -> s.contains(contains));
    }

    @Override
    public CompletableResult containsIgnoringCase(String contains) {
        return this.functionToApply.apply(s -> s.containsIgnoringCase(contains));
    }

    @Override
    public CompletableResult notContains(String notContains) {
        return this.functionToApply.apply(s -> s.notContains(notContains));
    }

    @Override
    public CompletableResult isEmpty() {
        return this.functionToApply.apply(StringCondition::isEmpty);
    }

    @Override
    public CompletableResult isNotEmpty() {
        return this.functionToApply.apply(StringCondition::isNotEmpty);
    }

    @Override
    public CompletableResult isContainedIn(String stringContainer) {
        return this.functionToApply.apply(s -> s.isContainedIn(stringContainer));
    }

    @Override
    public CompletableResult isNotContainedIn(String stringContainer) {
        return this.functionToApply.apply(s -> s.isNotContainedIn(stringContainer));
    }

    @Override
    public CompletableResult isContainedInIgnoreCase(String stringContainer) {
        return this.functionToApply.apply(s -> s.isContainedInIgnoreCase(stringContainer));
    }

    @Override
    public CompletableResult isNotContainedInIgnoreCase(String stringContainer) {
        return this.functionToApply.apply(s -> s.isNotContainedInIgnoreCase(stringContainer));
    }

    @Override
    public CompletableResult isContainedInSubstring(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isContainedInSubstring(stringContainer, start, end));
    }

    @Override
    public CompletableResult isContainedInSubstringIgnoreCase(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isContainedInSubstringIgnoreCase(stringContainer, start, end));
    }

    @Override
    public CompletableResult isNotContainedInSubstring(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isNotContainedInSubstring(stringContainer, start, end));
    }

    @Override
    public CompletableResult isNotContainedInSubstringIgnoreCase(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isNotContainedInSubstringIgnoreCase(stringContainer, start, end));
    }

    @Override
    public CompletableResult isEqualToIgnoringCase(String string) {
        return this.functionToApply.apply(s -> s.isEqualToIgnoringCase(string));
    }

    @Override
    public CompletableResult isDifferentFromIgnoringCase(String string) {
        return this.functionToApply.apply(s -> s.isDifferentFromIgnoringCase(string));
    }

    @Override
    public CompletableResult isBlank() {
        return this.functionToApply.apply(StringCondition::isBlank);
    }

    @Override
    public CompletableResult isNotBlank() {
        return this.functionToApply.apply(StringCondition::isNotBlank);
    }

}
