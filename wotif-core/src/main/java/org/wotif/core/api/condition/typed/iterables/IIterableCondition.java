package org.wotif.core.api.condition.typed.iterables;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.ICondition;

import java.util.function.Predicate;

public interface IIterableCondition<ITERABLE_TYPE, ITERABLE> extends ICondition<ITERABLE> {

    CompletableResult contains(ITERABLE_TYPE... values);

    CompletableResult doesNotContains(ITERABLE_TYPE... values);

    CompletableResult contains(Iterable<ITERABLE_TYPE> values);

    CompletableResult doesNotContains(Iterable<ITERABLE_TYPE> values);

    CompletableResult containsAnyOf(ITERABLE_TYPE... values);

    CompletableResult containsAnyOf(Iterable<ITERABLE_TYPE> values);

    CompletableResult containsOnly(ITERABLE_TYPE... values);

    CompletableResult containsOnly(Iterable<ITERABLE_TYPE> values);

    CompletableResult doesNotContainsOnly(ITERABLE_TYPE... values);

    CompletableResult doesNotContainsOnly(Iterable<ITERABLE_TYPE> values);

    CompletableResult containsOnlyOnce(ITERABLE_TYPE... values);

    CompletableResult containsOnlyOnce(Iterable<ITERABLE_TYPE> values);

    CompletableResult containsMoreThanOnce(ITERABLE_TYPE... values);

    CompletableResult containsMoreThanOnce(Iterable<ITERABLE_TYPE> values);

    CompletableResult startsWith(ITERABLE_TYPE value);

    CompletableResult doesNotStartsWith(ITERABLE_TYPE value);

    CompletableResult endsWith(ITERABLE_TYPE value);

    CompletableResult doesNotEndsWith(ITERABLE_TYPE value);

    CompletableResult isSubsetOf(ITERABLE_TYPE... values);

    CompletableResult isSubsetOf(Iterable<ITERABLE_TYPE> values);

    CompletableResult isNotSubsetOf(ITERABLE_TYPE... values);

    CompletableResult isNotSubsetOf(Iterable<ITERABLE_TYPE> values);

    CompletableResult isEmpty();

    CompletableResult isNotEmpty();

    CompletableResult doesNotHasAnyElementsOfTypes(Class<?>... values);

    CompletableResult doesNotHasAnyElementsOfTypes(Iterable<Class<?>> values);

    CompletableResult hasAnyElementsOfTypes(Class<?>... values);

    CompletableResult hasAnyElementsOfTypes(Iterable<Class<?>> values);

    CompletableResult doesNotContainsNull();

    CompletableResult containsNull();

    CompletableResult containsOnlyNull();

    CompletableResult doesNotContainsOnlyNull();

    CompletableResult hasDuplicate();

    CompletableResult doesNotHasDuplicate();

    CompletableResult anyMatch(Predicate<? super ITERABLE_TYPE> predicate);

    CompletableResult allMatch(Predicate<? super ITERABLE_TYPE> predicate);

    CompletableResult noneMatch(Predicate<? super ITERABLE_TYPE> predicate);

    CompletableResult hasSameSizeAs(ITERABLE_TYPE[] value);

    CompletableResult hasSize(long size);

    CompletableResult hasSizeBetween(long start, long end);

    CompletableResult hasSizeGreaterThan(long size);

    CompletableResult hasSizeGreaterThanOrEqualTo(long size);

    CompletableResult hasSizeLessThan(long size);

    CompletableResult hasSizeLessThanOrEqualTo(long size);

    CompletableResult hasSizeDifferentFrom(long size);

}
