package org.wotif.core.api.condition.typed.string;

import org.apache.commons.lang3.StringUtils;
import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.ComparableCondition;

public class StringCondition extends ComparableCondition<String> implements IStringCondition {

    public StringCondition(String term) {
        super(term);
    }

    @Override
    public CompletableResult contains(String contains) {
        boolean value = this.term.value().contains(contains);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult containsIgnoringCase(String contains) {
        boolean value = StringUtils.containsIgnoreCase(this.term.value(), contains);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult notContains(String notContains) {
        boolean value = !this.term.value().contains(notContains);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isEmpty() {
        boolean value = this.term.value().isEmpty();
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotEmpty() {
        boolean value = !this.term.value().isEmpty();
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isContainedIn(String stringContainer) {
        boolean value = stringContainer.contains(this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotContainedIn(String stringContainer) {
        boolean value = !stringContainer.contains(this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isContainedInIgnoreCase(String stringContainer) {
        boolean value = StringUtils.containsIgnoreCase(stringContainer, this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotContainedInIgnoreCase(String stringContainer) {
        boolean value = !StringUtils.containsIgnoreCase(stringContainer, this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isContainedInSubstring(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer, start, end);
        boolean value = StringUtils.contains(substring, this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isContainedInSubstringIgnoreCase(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer.toLowerCase(), start.toLowerCase(), end.toLowerCase());
        boolean value = StringUtils.containsIgnoreCase(substring, this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotContainedInSubstring(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer, start, end);
        boolean value = !StringUtils.contains(substring, this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotContainedInSubstringIgnoreCase(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer.toLowerCase(), start.toLowerCase(), end.toLowerCase());
        boolean value = !StringUtils.containsIgnoreCase(substring, this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isEqualToIgnoringCase(String string) {
        boolean value = StringUtils.equalsIgnoreCase(this.term.value(), string);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isDifferentFromIgnoringCase(String string) {
        boolean value = !StringUtils.equalsIgnoreCase(this.term.value(), string);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isBlank() {
        boolean value = this.term.value().isBlank();
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotBlank() {
        boolean value = !this.term.value().isBlank();
        return new CompletableResult(value);
    }

}
