package org.wotif.core.api.condition.typed.string;

import org.apache.commons.lang3.StringUtils;
import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.typed.ComparableCondition;

public class StringCondition extends ComparableCondition<String> implements IStringCondition {

    public StringCondition(String term) {
        super(term);
    }

    @Override
    public CompletableConditionResult contains(String contains) {
        boolean value = this.term.value().contains(contains);
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult containsIgnoringCase(String contains) {
        boolean value = StringUtils.containsIgnoreCase(this.term.value(), contains);
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult notContains(String notContains) {
        boolean value = !this.term.value().contains(notContains);
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isEmpty() {
        boolean value = this.term.value().isEmpty();
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNotEmpty() {
        boolean value = !this.term.value().isEmpty();
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isContainedIn(String stringContainer) {
        boolean value = stringContainer.contains(this.term.value());
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNotContainedIn(String stringContainer) {
        boolean value = !stringContainer.contains(this.term.value());
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isContainedInIgnoreCase(String stringContainer) {
        boolean value = StringUtils.containsIgnoreCase(stringContainer, this.term.value());
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNotContainedInIgnoreCase(String stringContainer) {
        boolean value = !StringUtils.containsIgnoreCase(stringContainer, this.term.value());
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isContainedInSubstring(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer, start, end);
        boolean value = StringUtils.contains(substring, this.term.value());
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isContainedInSubstringIgnoreCase(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer.toLowerCase(), start.toLowerCase(), end.toLowerCase());
        boolean value = StringUtils.containsIgnoreCase(substring, this.term.value());
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNotContainedInSubstring(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer, start, end);
        boolean value = !StringUtils.contains(substring, this.term.value());
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNotContainedInSubstringIgnoreCase(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer.toLowerCase(), start.toLowerCase(), end.toLowerCase());
        boolean value = !StringUtils.containsIgnoreCase(substring, this.term.value());
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isEqualToIgnoringCase(String string) {
        boolean value = StringUtils.equalsIgnoreCase(this.term.value(), string);
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isDifferentFromIgnoringCase(String string) {
        boolean value = !StringUtils.equalsIgnoreCase(this.term.value(), string);
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isBlank() {
        boolean value = this.term.value().isBlank();
        return new CompletableConditionResult(value);
    }

    @Override
    public CompletableConditionResult isNotBlank() {
        boolean value = !this.term.value().isBlank();
        return new CompletableConditionResult(value);
    }

}
