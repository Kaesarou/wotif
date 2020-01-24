package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.typed.IComparableCondition;

public interface IStringCondition extends IComparableCondition<String> {

    CompletableConditionResult contains(String contains);

    CompletableConditionResult containsIgnoringCase(String contains);

    CompletableConditionResult notContains(String notContains);

    CompletableConditionResult isEmpty();

    CompletableConditionResult isNotEmpty();

    CompletableConditionResult isContainedIn(String stringContainer);

    CompletableConditionResult isNotContainedIn(String stringContainer);

    CompletableConditionResult isContainedInIgnoreCase(String stringContainer);

    CompletableConditionResult isNotContainedInIgnoreCase(String stringContainer);

    CompletableConditionResult isContainedInSubstring(String stringContainer, String start, String end);

    CompletableConditionResult isContainedInSubstringIgnoreCase(String stringContainer, String start, String end);

    CompletableConditionResult isNotContainedInSubstring(String stringContainer, String start, String end);

    CompletableConditionResult isNotContainedInSubstringIgnoreCase(String stringContainer, String start, String end);

    CompletableConditionResult isEqualToIgnoringCase(String string);

    CompletableConditionResult isDifferentFromIgnoringCase(String string);

    CompletableConditionResult isBlank();

    CompletableConditionResult isNotBlank();

}
