package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableConditionResult;
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
    public CompletableConditionResult contains(String contains) {
        return this.functionToApply.apply(s -> s.contains(contains).value());
    }

    @Override
    public CompletableConditionResult containsIgnoringCase(String contains) {
        return this.functionToApply.apply(s -> s.containsIgnoringCase(contains).value());
    }

    @Override
    public CompletableConditionResult notContains(String notContains) {
        return this.functionToApply.apply(s -> s.notContains(notContains).value());
    }

    @Override
    public CompletableConditionResult isEmpty() {
        return this.functionToApply.apply(s -> s.isEmpty().value());
    }

    @Override
    public CompletableConditionResult isNotEmpty() {
        return this.functionToApply.apply(s -> s.isNotEmpty().value());
    }

    @Override
    public CompletableConditionResult isContainedIn(String stringContainer) {
        return this.functionToApply.apply(s -> s.isContainedIn(stringContainer).value());
    }

    @Override
    public CompletableConditionResult isNotContainedIn(String stringContainer) {
        return this.functionToApply.apply(s -> s.isNotContainedIn(stringContainer).value());
    }

    @Override
    public CompletableConditionResult isContainedInIgnoreCase(String stringContainer) {
        return this.functionToApply.apply(s -> s.isContainedInIgnoreCase(stringContainer).value());
    }

    @Override
    public CompletableConditionResult isNotContainedInIgnoreCase(String stringContainer) {
        return this.functionToApply.apply(s -> s.isNotContainedInIgnoreCase(stringContainer).value());
    }

    @Override
    public CompletableConditionResult isContainedInSubstring(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isContainedInSubstring(stringContainer, start, end).value());
    }

    @Override
    public CompletableConditionResult isContainedInSubstringIgnoreCase(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isContainedInSubstringIgnoreCase(stringContainer, start, end).value());
    }

    @Override
    public CompletableConditionResult isNotContainedInSubstring(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isNotContainedInSubstring(stringContainer, start, end).value());
    }

    @Override
    public CompletableConditionResult isNotContainedInSubstringIgnoreCase(String stringContainer, String start, String end) {
        return this.functionToApply.apply(s -> s.isNotContainedInSubstringIgnoreCase(stringContainer, start, end).value());
    }

    @Override
    public CompletableConditionResult isEqualToIgnoringCase(String string) {
        return this.functionToApply.apply(s -> s.isEqualToIgnoringCase(string).value());
    }

    @Override
    public CompletableConditionResult isDifferentFromIgnoringCase(String string) {
        return this.functionToApply.apply(s -> s.isDifferentFromIgnoringCase(string).value());
    }

    @Override
    public CompletableConditionResult isBlank() {
        return this.functionToApply.apply(s -> s.isBlank().value());
    }

    @Override
    public CompletableConditionResult isNotBlank() {
        return this.functionToApply.apply(s -> s.isNotBlank().value());
    }

}
