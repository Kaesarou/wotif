package org.wotif.core.api.condition.typed.arrays;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.ICondition;

public interface IArraysCondition<ELEMENT_TYPE> extends ICondition<ELEMENT_TYPE[]> {

    CompletableResult contains(ELEMENT_TYPE... values);

}
