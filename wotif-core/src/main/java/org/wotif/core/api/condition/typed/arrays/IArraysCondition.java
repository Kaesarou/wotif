package org.wotif.core.api.condition.typed.arrays;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.ICondition;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IArraysCondition<ELEMENT_TYPE> extends ICondition<ELEMENT_TYPE[]> {

    CompletableResult contains(ELEMENT_TYPE... values);

    CompletableResult notContains(ELEMENT_TYPE... values);

    CompletableResult contains(List<ELEMENT_TYPE> values);

    CompletableResult notContains(List<ELEMENT_TYPE> values);

    CompletableResult containsAnyOf(ELEMENT_TYPE... values);

    CompletableResult containsAnyOf(List<ELEMENT_TYPE> values);

    CompletableResult containsExactly(ELEMENT_TYPE... values);

    CompletableResult containsExactly(List<ELEMENT_TYPE> values);

    CompletableResult containsExactlyInAnyOrder(ELEMENT_TYPE... values);

    CompletableResult containsExactlyInAnyOrder(List<ELEMENT_TYPE> values);

    CompletableResult containsOnly(ELEMENT_TYPE... values);

    CompletableResult containsOnly(List<ELEMENT_TYPE> values);

    CompletableResult notContainsOnly(ELEMENT_TYPE... values);

    CompletableResult notContainsOnly(List<ELEMENT_TYPE> values);

    CompletableResult containsOnlyOnce(ELEMENT_TYPE... values);

    CompletableResult containsOnlyOnce(List<ELEMENT_TYPE> values);

    CompletableResult containsMoreThenOnce(ELEMENT_TYPE... values);

    CompletableResult containsMoreThenOnce(List<ELEMENT_TYPE> values);

    CompletableResult startsWith(ELEMENT_TYPE value);

    CompletableResult notStartsWith(ELEMENT_TYPE value);

    CompletableResult endsWith(ELEMENT_TYPE value);

    CompletableResult notEndsWith(ELEMENT_TYPE value);

    CompletableResult isSubsetOf(ELEMENT_TYPE... values);

    CompletableResult isSubsetOf(List<ELEMENT_TYPE> values);

    CompletableResult isNotSubsetOf(ELEMENT_TYPE... values);

    CompletableResult isNotSubsetOf(List<ELEMENT_TYPE> values);

    CompletableResult isEmpty();

    CompletableResult isNotEmpty();

    CompletableResult containsAll(ELEMENT_TYPE... values);

    CompletableResult containsAll(List<ELEMENT_TYPE> values);

    CompletableResult doesNotHasAnyElementsOfTypes(ELEMENT_TYPE... values);

    CompletableResult doesNotHasAnyElementsOfTypes(List<ELEMENT_TYPE> values);

    CompletableResult hasAnyElementsOfTypes(ELEMENT_TYPE... values);

    CompletableResult hasAnyElementsOfTypes(List<ELEMENT_TYPE> values);

    CompletableResult doesNotContainsNull();

    CompletableResult containsNull();

    CompletableResult containsOnlyNull();

    CompletableResult hasDuplicate();

    CompletableResult doesNotHasDuplicate();

    CompletableResult anyMatch(Predicate<? extends ELEMENT_TYPE> predicate);

    CompletableResult anySatisfy(Consumer<? extends ELEMENT_TYPE> consumer);

    CompletableResult allMatch(Predicate<? extends ELEMENT_TYPE> predicate);

    CompletableResult allSatisfy(Consumer<? extends ELEMENT_TYPE> consumer);

    CompletableResult noneMatch(Predicate<? extends ELEMENT_TYPE> predicate);

    CompletableResult noneSatisfy(Consumer<? extends ELEMENT_TYPE> consumer);

    CompletableResult hasSameSizeAs(ELEMENT_TYPE[] value);

    CompletableResult hasSize(int size);

    CompletableResult hasSizeBetween(int start, int end);

    CompletableResult hasSizeGreaterThan(int size);

    CompletableResult hasSizeGreaterThanOrEqualTo(int size);

    CompletableResult hasSizeLessThan(int size);

    CompletableResult hasSizeLessThanOrEqualTo(int size);

    CompletableResult hasSizeDifferentFrom(int size);

}
