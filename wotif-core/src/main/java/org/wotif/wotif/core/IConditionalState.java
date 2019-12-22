package org.wotif.wotif.core;

import io.vavr.control.Either;

public interface IConditionalState<T> {

    IConditionalState<T> isTrue();

    <RESULT> ConditionResult<RESULT> thenReturn(RESULT valueToReturn);

}
