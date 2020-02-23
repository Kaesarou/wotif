package org.wotif.core.api.condition.typed.iterables;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractJoinCondition;
import org.wotif.core.api.condition.JoinEnum;

import java.util.function.Predicate;

public abstract class AbstractIterableJoinCondition<ITERABLE_TYPE, ITERABLE>
        extends AbstractJoinCondition<ITERABLE, AbstractIterableCondition<ITERABLE_TYPE, ITERABLE>>
        implements IIterableCondition<ITERABLE_TYPE, ITERABLE> {

    @SafeVarargs
    public AbstractIterableJoinCondition(JoinEnum joinType, ITERABLE... terms) {
        super(joinType, terms);
    }

    @Override
    @SafeVarargs
    public final CompletableResult contains(ITERABLE_TYPE... values) {
        return this.functionToApply.apply(a -> a.contains(values));
    }

    @Override
    @SafeVarargs
    public final CompletableResult doesNotContains(ITERABLE_TYPE... values) {
        return this.functionToApply.apply(a -> a.doesNotContains(values));
    }

    @Override
    public CompletableResult contains(Iterable<ITERABLE_TYPE> values) {
        return this.functionToApply.apply(a -> a.contains(values));
    }

    @Override
    public CompletableResult doesNotContains(Iterable<ITERABLE_TYPE> values) {
        return this.functionToApply.apply(a -> a.doesNotContains(values));
    }

    @Override
    @SafeVarargs
    public final CompletableResult containsAnyOf(ITERABLE_TYPE... values) {
        return this.functionToApply.apply(a -> a.containsAnyOf(values));
    }

    @Override
    public CompletableResult containsAnyOf(Iterable<ITERABLE_TYPE> values) {
        return this.functionToApply.apply(a -> a.containsAnyOf(values));
    }

    @Override
    @SafeVarargs
    public final CompletableResult containsOnly(ITERABLE_TYPE... values) {
        return this.functionToApply.apply(a -> a.containsOnly(values));
    }

    @Override
    public CompletableResult containsOnly(Iterable<ITERABLE_TYPE> values) {
        return this.functionToApply.apply(a -> a.containsOnly(values));
    }

    @Override
    @SafeVarargs
    public final CompletableResult doesNotContainsOnly(ITERABLE_TYPE... values) {
        return this.functionToApply.apply(a -> a.doesNotContainsOnly(values));
    }

    @Override
    public CompletableResult doesNotContainsOnly(Iterable<ITERABLE_TYPE> values) {
        return this.functionToApply.apply(a -> a.doesNotContainsOnly(values));
    }

    @Override
    @SafeVarargs
    public final CompletableResult containsOnlyOnce(ITERABLE_TYPE... values) {
        return this.functionToApply.apply(a -> a.containsOnlyOnce(values));
    }

    @Override
    public CompletableResult containsOnlyOnce(Iterable<ITERABLE_TYPE> values) {
        return this.functionToApply.apply(a -> a.containsOnlyOnce(values));
    }

    @Override
    @SafeVarargs
    public final CompletableResult containsMoreThanOnce(ITERABLE_TYPE... values) {
        return this.functionToApply.apply(a -> a.containsMoreThanOnce(values));
    }

    @Override
    public CompletableResult containsMoreThanOnce(Iterable<ITERABLE_TYPE> values) {
        return this.functionToApply.apply(a -> a.containsMoreThanOnce(values));
    }

    @Override
    public CompletableResult startsWith(ITERABLE_TYPE value) {
        return this.functionToApply.apply(a -> a.startsWith(value));
    }

    @Override
    public CompletableResult doesNotStartsWith(ITERABLE_TYPE value) {
        return this.functionToApply.apply(a -> a.doesNotStartsWith(value));
    }

    @Override
    public CompletableResult endsWith(ITERABLE_TYPE value) {
        return this.functionToApply.apply(a -> a.endsWith(value));
    }

    @Override
    public CompletableResult doesNotEndsWith(ITERABLE_TYPE value) {
        return this.functionToApply.apply(a -> a.doesNotEndsWith(value));
    }

    @Override
    @SafeVarargs
    public final CompletableResult isSubsetOf(ITERABLE_TYPE... values) {
        return this.functionToApply.apply(a -> a.isSubsetOf(values));
    }

    @Override
    public CompletableResult isSubsetOf(Iterable<ITERABLE_TYPE> values) {
        return this.functionToApply.apply(a -> a.isSubsetOf(values));
    }

    @Override
    @SafeVarargs
    public final CompletableResult isNotSubsetOf(ITERABLE_TYPE... values) {
        return this.functionToApply.apply(a -> a.isNotSubsetOf(values));
    }

    @Override
    public CompletableResult isNotSubsetOf(Iterable<ITERABLE_TYPE> values) {
        return this.functionToApply.apply(a -> a.isNotSubsetOf(values));
    }

    @Override
    public CompletableResult isEmpty() {
        return this.functionToApply.apply(AbstractIterableCondition::isEmpty);
    }

    @Override
    public CompletableResult isNotEmpty() {
        return this.functionToApply.apply(AbstractIterableCondition::isNotEmpty);
    }

    @Override
    public CompletableResult doesNotHasAnyElementsOfTypes(Class<?>... values) {
        return this.functionToApply.apply(a -> a.doesNotHasAnyElementsOfTypes(values));
    }

    @Override
    public CompletableResult doesNotHasAnyElementsOfTypes(Iterable<Class<?>> values) {
        return this.functionToApply.apply(a -> a.doesNotHasAnyElementsOfTypes(values));
    }

    @Override
    public CompletableResult hasAnyElementsOfTypes(Class<?>... values) {
        return this.functionToApply.apply(a -> a.hasAnyElementsOfTypes(values));
    }

    @Override
    public CompletableResult hasAnyElementsOfTypes(Iterable<Class<?>> values) {
        return this.functionToApply.apply(a -> a.hasAnyElementsOfTypes(values));
    }

    @Override
    public CompletableResult doesNotContainsNull() {
        return this.functionToApply.apply(AbstractIterableCondition::doesNotContainsNull);
    }

    @Override
    public CompletableResult containsNull() {
        return this.functionToApply.apply(AbstractIterableCondition::containsNull);
    }

    @Override
    public CompletableResult containsOnlyNull() {
        return this.functionToApply.apply(AbstractIterableCondition::containsOnlyNull);
    }

    @Override
    public CompletableResult doesNotContainsOnlyNull() {
        return this.functionToApply.apply(AbstractIterableCondition::doesNotContainsOnlyNull);
    }

    @Override
    public CompletableResult hasDuplicate() {
        return this.functionToApply.apply(AbstractIterableCondition::hasDuplicate);
    }

    @Override
    public CompletableResult doesNotHasDuplicate() {
        return this.functionToApply.apply(AbstractIterableCondition::doesNotHasDuplicate);
    }

    @Override
    public CompletableResult anyMatch(Predicate<? super ITERABLE_TYPE> predicate) {
        return this.functionToApply.apply(a -> a.anyMatch(predicate));
    }

    @Override
    public CompletableResult allMatch(Predicate<? super ITERABLE_TYPE> predicate) {
        return this.functionToApply.apply(a -> a.allMatch(predicate));
    }

    @Override
    public CompletableResult noneMatch(Predicate<? super ITERABLE_TYPE> predicate) {
        return this.functionToApply.apply(a -> a.noneMatch(predicate));

    }

    @Override
    public CompletableResult hasSameSizeAs(ITERABLE_TYPE[] value) {
        return this.functionToApply.apply(a -> a.hasSameSizeAs(value));
    }

    @Override
    public CompletableResult hasSize(long size) {
        return this.functionToApply.apply(a -> a.hasSize(size));
    }

    @Override
    public CompletableResult hasSizeBetween(long start, long end) {
        return this.functionToApply.apply(a -> a.hasSizeBetween(start, end));
    }

    @Override
    public CompletableResult hasSizeGreaterThan(long size) {
        return this.functionToApply.apply(a -> a.hasSizeGreaterThan(size));
    }

    @Override
    public CompletableResult hasSizeGreaterThanOrEqualTo(long size) {
        return this.functionToApply.apply(a -> a.hasSizeGreaterThanOrEqualTo(size));
    }

    @Override
    public CompletableResult hasSizeLessThan(long size) {
        return this.functionToApply.apply(a -> a.hasSizeLessThan(size));
    }

    @Override
    public CompletableResult hasSizeLessThanOrEqualTo(long size) {
        return this.functionToApply.apply(a -> a.hasSizeLessThanOrEqualTo(size));
    }

    @Override
    public CompletableResult hasSizeDifferentFrom(long size) {
        return this.functionToApply.apply(a -> a.hasSizeDifferentFrom(size));
    }

}
