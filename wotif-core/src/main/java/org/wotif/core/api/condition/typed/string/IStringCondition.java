package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.IComparableCondition;

public interface IStringCondition extends IComparableCondition<String> {

    CompletableResult contains(String contains);

    CompletableResult containsIgnoringCase(String contains);

    CompletableResult notContains(String notContains);

    CompletableResult isEmpty();

    CompletableResult isNotEmpty();

    CompletableResult isContainedIn(String stringContainer);

    CompletableResult isNotContainedIn(String stringContainer);

    CompletableResult isContainedInIgnoreCase(String stringContainer);

    CompletableResult isNotContainedInIgnoreCase(String stringContainer);

    CompletableResult isContainedInSubstring(String stringContainer, String start, String end);

    CompletableResult isContainedInSubstringIgnoreCase(String stringContainer, String start, String end);

    CompletableResult isNotContainedInSubstring(String stringContainer, String start, String end);

    CompletableResult isNotContainedInSubstringIgnoreCase(String stringContainer, String start, String end);

    CompletableResult isEqualToIgnoringCase(String string);

    CompletableResult isDifferentFromIgnoringCase(String string);

    CompletableResult isBlank();

    CompletableResult isNotBlank();

}
