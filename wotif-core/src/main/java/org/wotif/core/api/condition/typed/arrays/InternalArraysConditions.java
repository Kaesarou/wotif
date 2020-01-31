package org.wotif.core.api.condition.typed.arrays;

import org.wotif.core.api.Term;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class InternalArraysConditions<TYPE> {

    private final Term<TYPE[]> terms;

    InternalArraysConditions(Term<TYPE[]> term) {
        this.terms = term;
    }

    private Stream<TYPE> stream() {
        return Arrays.stream(this.terms.value());
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

}
