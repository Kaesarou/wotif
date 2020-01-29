package org.wotif.core.api.condition.typed.arrays;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractCondition;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ArraysCondition<ELEMENT_TYPE> extends AbstractCondition<ELEMENT_TYPE[]>
        implements IArraysCondition<ELEMENT_TYPE> {

    private InternalArraysConditions<ELEMENT_TYPE> arrays;

    public ArraysCondition(ELEMENT_TYPE[] term) {
        super(term);
        this.arrays = new InternalArraysConditions<>(this.term);
    }

    @Override
    @SafeVarargs
    public final CompletableResult contains(ELEMENT_TYPE... values) {
        boolean result = this.arrays.contains(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult contains(Iterable<ELEMENT_TYPE> values) {
        boolean result = this.arrays.contains(values);
        return new CompletableResult(result);
    }

    @Override
    @SafeVarargs
    public final CompletableResult notContains(ELEMENT_TYPE... values) {
        boolean result = !this.arrays.contains(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult notContains(Iterable<ELEMENT_TYPE> values) {
        boolean result = !this.arrays.contains(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsAnyOf(ELEMENT_TYPE... values) {
        boolean result = this.arrays.containsAnyOf(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsAnyOf(Iterable<ELEMENT_TYPE> values) {
        boolean result = this.arrays.containsAnyOf(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsOnly(ELEMENT_TYPE... values) {
        boolean result = this.arrays.containsOnly(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsOnly(Iterable<ELEMENT_TYPE> values) {
        boolean result = this.arrays.containsOnly(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult notContainsOnly(ELEMENT_TYPE... values) {
        boolean result = !this.arrays.containsOnly(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult notContainsOnly(Iterable<ELEMENT_TYPE> values) {
        boolean result = !this.arrays.containsOnly(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsOnlyOnce(ELEMENT_TYPE... values) {
        boolean result = this.arrays.containsOnlyOnce(Arrays.asList(values));
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsOnlyOnce(Iterable<ELEMENT_TYPE> values) {
        boolean result = this.arrays.containsOnly(values);
        return new CompletableResult(result);
    }

    @Override
    public CompletableResult containsMoreThenOnce(ELEMENT_TYPE... values) {
        return null;
    }

    @Override
    public CompletableResult containsMoreThenOnce(Iterable<ELEMENT_TYPE> values) {
        return null;
    }

    @Override
    public CompletableResult startsWith(ELEMENT_TYPE value) {
        return null;
    }

    @Override
    public CompletableResult notStartsWith(ELEMENT_TYPE value) {
        return null;
    }

    @Override
    public CompletableResult endsWith(ELEMENT_TYPE value) {
        return null;
    }

    @Override
    public CompletableResult notEndsWith(ELEMENT_TYPE value) {
        return null;
    }

    @Override
    public CompletableResult isSubsetOf(ELEMENT_TYPE... values) {
        return null;
    }

    @Override
    public CompletableResult isSubsetOf(Iterable<ELEMENT_TYPE> values) {
        return null;
    }

    @Override
    public CompletableResult isNotSubsetOf(ELEMENT_TYPE... values) {
        return null;
    }

    @Override
    public CompletableResult isNotSubsetOf(Iterable<ELEMENT_TYPE> values) {
        return null;
    }

    @Override
    public CompletableResult isEmpty() {
        return null;
    }

    @Override
    public CompletableResult isNotEmpty() {
        return null;
    }

    @Override
    public CompletableResult doesNotHasAnyElementsOfTypes(ELEMENT_TYPE... values) {
        return null;
    }

    @Override
    public CompletableResult doesNotHasAnyElementsOfTypes(Iterable<ELEMENT_TYPE> values) {
        return null;
    }

    @Override
    public CompletableResult hasAnyElementsOfTypes(ELEMENT_TYPE... values) {
        return null;
    }

    @Override
    public CompletableResult hasAnyElementsOfTypes(Iterable<ELEMENT_TYPE> values) {
        return null;
    }

    @Override
    public CompletableResult doesNotContainsNull() {
        return null;
    }

    @Override
    public CompletableResult containsNull() {
        return null;
    }

    @Override
    public CompletableResult containsOnlyNull() {
        return null;
    }

    @Override
    public CompletableResult hasDuplicate() {
        return null;
    }

    @Override
    public CompletableResult doesNotHasDuplicate() {
        return null;
    }

    @Override
    public CompletableResult anyMatch(Predicate<? extends ELEMENT_TYPE> predicate) {
        return null;
    }

    @Override
    public CompletableResult anySatisfy(Consumer<? extends ELEMENT_TYPE> consumer) {
        return null;
    }

    @Override
    public CompletableResult allMatch(Predicate<? extends ELEMENT_TYPE> predicate) {
        return null;
    }

    @Override
    public CompletableResult allSatisfy(Consumer<? extends ELEMENT_TYPE> consumer) {
        return null;
    }

    @Override
    public CompletableResult noneMatch(Predicate<? extends ELEMENT_TYPE> predicate) {
        return null;
    }

    @Override
    public CompletableResult noneSatisfy(Consumer<? extends ELEMENT_TYPE> consumer) {
        return null;
    }

    @Override
    public CompletableResult hasSameSizeAs(ELEMENT_TYPE[] value) {
        return null;
    }

    @Override
    public CompletableResult hasSize(int size) {
        return null;
    }

    @Override
    public CompletableResult hasSizeBetween(int start, int end) {
        return null;
    }

    @Override
    public CompletableResult hasSizeGreaterThan(int size) {
        return null;
    }

    @Override
    public CompletableResult hasSizeGreaterThanOrEqualTo(int size) {
        return null;
    }

    @Override
    public CompletableResult hasSizeLessThan(int size) {
        return null;
    }

    @Override
    public CompletableResult hasSizeLessThanOrEqualTo(int size) {
        return null;
    }

    @Override
    public CompletableResult hasSizeDifferentFrom(int size) {
        return null;
    }

}
