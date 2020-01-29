package org.wotif.core.api.condition.typed.arrays;

import org.wotif.core.api.Term;

import java.util.Arrays;
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

}
