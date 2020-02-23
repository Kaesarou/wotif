package org.wotif.core.api.condition.typed.iterables;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractCondition;

import java.util.Arrays;
import java.util.function.Predicate;

public abstract class AbstractIterableCondition<ITERABLE_TYPE, ITERABLE> extends AbstractCondition<ITERABLE>
        implements IIterableCondition<ITERABLE_TYPE, ITERABLE> {

    InternalIterableConditions<ITERABLE_TYPE> internalIterables;

    abstract protected Iterable<ITERABLE_TYPE> iterable();

    public AbstractIterableCondition(ITERABLE term) {
        super(term);
        this.internalIterables = new InternalIterableConditions<>(iterable());
    }

    @Override
    @SafeVarargs
    public final CompletableResult contains(ITERABLE_TYPE... values) {
        boolean result = this.internalIterables.contains(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult contains(Iterable<ITERABLE_TYPE> values) {
        boolean result = this.internalIterables.contains(values);
        return new CompletableResult(result);
    }

    @Override
    @SafeVarargs
    public final CompletableResult doesNotContains(ITERABLE_TYPE... values) {
        boolean result = !this.internalIterables.contains(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult doesNotContains(Iterable<ITERABLE_TYPE> values) {
        boolean result = !this.internalIterables.contains(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsAnyOf(ITERABLE_TYPE... values) {
        boolean result = this.internalIterables.containsAnyOf(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsAnyOf(Iterable<ITERABLE_TYPE> values) {
        boolean result = this.internalIterables.containsAnyOf(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsOnly(ITERABLE_TYPE... values) {
        boolean result = this.internalIterables.containsOnly(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsOnly(Iterable<ITERABLE_TYPE> values) {
        boolean result = this.internalIterables.containsOnly(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult doesNotContainsOnly(ITERABLE_TYPE... values) {
        boolean result = !this.internalIterables.containsOnly(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult doesNotContainsOnly(Iterable<ITERABLE_TYPE> values) {
        boolean result = !this.internalIterables.containsOnly(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsOnlyOnce(ITERABLE_TYPE... values) {
        boolean result = this.internalIterables.containsOnlyOnce(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsOnlyOnce(Iterable<ITERABLE_TYPE> values) {
        boolean result = this.internalIterables.containsOnly(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsMoreThanOnce(ITERABLE_TYPE... values) {
        boolean result = this.internalIterables.containsMoreThanOnce(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsMoreThanOnce(Iterable<ITERABLE_TYPE> values) {
        boolean result = this.internalIterables.containsMoreThanOnce(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult startsWith(ITERABLE_TYPE value) {
        boolean result = this.internalIterables.startsWith(value);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult doesNotStartsWith(ITERABLE_TYPE value) {
        boolean result = !this.internalIterables.startsWith(value);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult endsWith(ITERABLE_TYPE value) {
        boolean result = this.internalIterables.endsWith(value);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult doesNotEndsWith(ITERABLE_TYPE value) {
        boolean result = !this.internalIterables.endsWith(value);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult isSubsetOf(ITERABLE_TYPE... values) {
        boolean result = this.internalIterables.isSubsetOf(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult isSubsetOf(Iterable<ITERABLE_TYPE> values) {
        boolean result = this.internalIterables.isSubsetOf(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult isNotSubsetOf(ITERABLE_TYPE... values) {
        boolean result = !this.internalIterables.isSubsetOf(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult isNotSubsetOf(Iterable<ITERABLE_TYPE> values) {
        boolean result = !this.internalIterables.isSubsetOf(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult isEmpty() {
        boolean result = this.internalIterables.isEmpty();
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult isNotEmpty() {
        boolean result = this.internalIterables.isEmpty();
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult doesNotHasAnyElementsOfTypes(Class<?>... values) {
        boolean result = !this.internalIterables.hasAnyElementsOfTypes(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult doesNotHasAnyElementsOfTypes(Iterable<Class<?>> values) {
        boolean result = !this.internalIterables.hasAnyElementsOfTypes(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasAnyElementsOfTypes(Class<?>... values) {
        boolean result = this.internalIterables.hasAnyElementsOfTypes(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasAnyElementsOfTypes(Iterable<Class<?>> values) {
        boolean result = this.internalIterables.hasAnyElementsOfTypes(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult doesNotContainsNull() {
        boolean result = !this.internalIterables.containsNull();
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsNull() {
        boolean result = this.internalIterables.containsNull();
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsOnlyNull() {
        boolean result = this.internalIterables.containsOnlyNull();
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult doesNotContainsOnlyNull() {
        boolean result = !this.internalIterables.containsOnlyNull();
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasDuplicate() {
        boolean result = this.internalIterables.hasDuplicate();
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult doesNotHasDuplicate() {
        boolean result = !this.internalIterables.hasDuplicate();
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult anyMatch(Predicate<? super ITERABLE_TYPE> predicate) {
        boolean result = this.internalIterables.anyMatch(predicate);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult allMatch(Predicate<? super ITERABLE_TYPE> predicate) {
        boolean result = this.internalIterables.allMatch(predicate);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult noneMatch(Predicate<? super ITERABLE_TYPE> predicate) {
        boolean result = this.internalIterables.noneMatch(predicate);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasSameSizeAs(ITERABLE_TYPE[] value) {
        boolean result = this.internalIterables.hasSameSizeAs(Arrays.asList(value));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasSize(long size) {
        boolean result = this.internalIterables.hasSize(size);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasSizeBetween(long start, long end) {
        boolean result = this.internalIterables.hasSizeBetween(start, end);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasSizeGreaterThan(long size) {
        boolean result = this.internalIterables.hasSizeGreaterThan(size);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasSizeGreaterThanOrEqualTo(long size) {
        boolean result = this.internalIterables.hasSizeGreaterThanOrEqualTo(size);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasSizeLessThan(long size) {
        boolean result = this.internalIterables.hasSizeLessThan(size);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasSizeLessThanOrEqualTo(long size) {
        boolean result = this.internalIterables.hasSizeLessThanOrEqualTo(size);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult hasSizeDifferentFrom(long size) {
        boolean result = !this.internalIterables.hasSize(size);
        return new CompletableResult(result);
    }

}
