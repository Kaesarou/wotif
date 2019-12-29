package org.wotif.core.api.condition.typed.string;

import org.apache.commons.lang3.StringUtils;
import org.wotif.core.api.CompletableResult;

public class StringCondition extends AbstractStringCondition {

    public StringCondition(String term) { super(term); }

    @Override
    public CompletableResult contains(String contains) {
        boolean value = this.term.value().contains(contains);
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult containsIgnoringCase(String contains) {
        boolean value = StringUtils.containsIgnoreCase(this.term.value(),contains);
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
    public CompletableResult isBetween(String stringContainer,String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer,start,end);
        boolean value = StringUtils.contains(substring,this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isBetweenIgnoringCase(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer.toLowerCase(),start.toLowerCase(),end.toLowerCase());
        boolean value = StringUtils.containsIgnoreCase(substring,this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotBetween(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer,start,end);
        boolean value = !StringUtils.contains(substring,this.term.value());
        return new CompletableResult(value);
    }

    @Override
    public CompletableResult isNotBetweenIgnoringCase(String stringContainer, String start, String end) {
        String substring = StringUtils.substringBetween(stringContainer.toLowerCase(),start.toLowerCase(),end.toLowerCase());
        boolean value = !StringUtils.containsIgnoreCase(substring,this.term.value());
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
