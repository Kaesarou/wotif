package org.wotif.core.api.condition.typed.arrays;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractCondition;

import java.util.Arrays;
import java.util.List;

public class ArraysCondition<ELEMENT_TYPE> extends AbstractCondition<ELEMENT_TYPE[]> implements IArraysCondition<ELEMENT_TYPE> {

    public ArraysCondition(ELEMENT_TYPE[] term) {
        super(term);
    }

    @Override
    @SafeVarargs
    public final CompletableResult contains(ELEMENT_TYPE... values) {
        List<ELEMENT_TYPE> convertedValues = Arrays.asList(values);
        boolean result = Arrays.asList(this.term.value()).containsAll(convertedValues);
        return new CompletableResult(result);
    }

}
