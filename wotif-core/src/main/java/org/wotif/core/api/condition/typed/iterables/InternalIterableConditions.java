package org.wotif.core.api.condition.typed.iterables;

import org.wotif.core.api.Term;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class InternalIterableConditions<TYPE> {

    private final Term<Iterable<TYPE>> terms;

    public InternalIterableConditions(Iterable<TYPE> term) {
        this.terms = new Term<>(term);
    }

    private Stream<TYPE> stream() {
        return iterableToStream(this.terms.value());
    }

    private Stream<TYPE> iterableToStream(Iterable<TYPE> values) {
        return StreamSupport.stream(values.spliterator(), false);
    }

    private boolean isContained(TYPE value, Stream<TYPE> container) {
        return container.anyMatch(e -> e.equals(value));
    }

    private boolean isContained(Class<?> value, Iterable<Class<?>> container) {
        return StreamSupport.stream(container.spliterator(), false)
                .anyMatch(e -> e.equals(value));
    }

    boolean contains(Iterable<TYPE> values) {
        return iterableToStream(values).allMatch(e -> this.isContained(e, stream()));
    }

    boolean containsAnyOf(Iterable<TYPE> values) {
        return iterableToStream(values).anyMatch(e -> this.isContained(e, stream()));
    }

    boolean containsOnly(Iterable<TYPE> values) {
        return this.contains(values) && iterableToStream(values).count() == stream().count();
    }

    boolean containsOnlyOnce(Iterable<TYPE> values) {
        return iterableToStream(values)
                .allMatch(e -> stream().filter(l -> l.equals(e)).count() == 1);
    }

    boolean containsMoreThanOnce(Iterable<TYPE> values) {
        return iterableToStream(values)
                .allMatch(e -> stream().filter(l -> l.equals(e)).count() > 1);
    }

    boolean startsWith(TYPE value) {
        return stream().collect(Collectors.toList()).get(0).equals(value);
    }

    boolean endsWith(TYPE value) {
        List<TYPE> collect = stream().collect(Collectors.toList());
        return collect.get(collect.size() - 1).equals(value);
    }

    boolean isSubsetOf(Iterable<TYPE> values) {
        return stream().allMatch(e -> this.isContained(e, iterableToStream(values)));
    }

    boolean isEmpty() {
        return stream().count() == 0;
    }

    boolean hasAnyElementsOfTypes(Iterable<Class<?>> values) {
        return stream().anyMatch(e -> isContained(e.getClass(), values));
    }

    boolean containsNull() {
        return stream().anyMatch(Objects::isNull);
    }

    boolean containsOnlyNull() {
        return stream().allMatch(Objects::isNull);
    }

    boolean hasDuplicate() {
        return !stream().allMatch(new HashSet<>()::add);
    }

    boolean anyMatch(Predicate<? super TYPE> predicate) {
        return stream().anyMatch(predicate);
    }

    boolean allMatch(Predicate<? super TYPE> predicate) {
        return stream().anyMatch(predicate);
    }

    boolean noneMatch(Predicate<? super TYPE> predicate) {
        return stream().anyMatch(predicate);
    }

    boolean hasSize(long value) {
        return stream().count() == value;
    }

    boolean hasSameSizeAs(Iterable<TYPE> values) {
        return hasSize(iterableToStream(values).count());
    }

    boolean hasSizeBetween(long start, long end) {
        return stream().count() >= start && stream().count() <= end;
    }

    boolean hasSizeGreaterThan(long size) {
        return stream().count() > size;
    }

    boolean hasSizeGreaterThanOrEqualTo(long size) {
        return stream().count() >= size;
    }

    boolean hasSizeLessThan(long size) {
        return stream().count() < size;
    }

    boolean hasSizeLessThanOrEqualTo(long size) {
        return stream().count() <= size;
    }

}
