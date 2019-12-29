package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.ICondition;

public interface IStringCondition extends ICondition<String> {

    CompletableResult contains(String contains);
    CompletableResult containsIgnoringCase(String contains);
    CompletableResult notContains(String notContains);
    CompletableResult isEmpty();
    CompletableResult isNotEmpty();
    CompletableResult isBetween(String stringContainer, String start, String end);
    CompletableResult isBetweenIgnoringCase(String stringContainer, String start, String end);
    CompletableResult isNotBetween(String stringContainer, String start, String end);
    CompletableResult isNotBetweenIgnoringCase(String stringContainer, String start, String end);
    CompletableResult isEqualToIgnoringCase(String string);
    CompletableResult isDifferentFromIgnoringCase(String string);
    CompletableResult isBlank();
    CompletableResult isNotBlank();

}
