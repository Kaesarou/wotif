package org.wotif.core.api.condition;

import org.wotif.core.api.CompletableResult;

public interface ICondition<TYPE> {

    CompletableResult isEqualTo(TYPE expected);

    CompletableResult isDifferentFrom(TYPE expected);

    CompletableResult isNull();

    CompletableResult isNotNull();

    CompletableResult isInstanceOf(Class<?> className);

    CompletableResult isNotInstanceOf(Class<?> className);

}
