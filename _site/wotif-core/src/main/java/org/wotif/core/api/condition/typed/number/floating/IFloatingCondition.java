package org.wotif.core.api.condition.typed.number.floating;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.number.INumberCondition;

public interface IFloatingCondition<FLOATING extends Number & Comparable<FLOATING>>
        extends INumberCondition<FLOATING> {

    CompletableResult isCloseTo(Integer expected);

    CompletableResult isNotCloseTo(Integer expected);

    CompletableResult isNumber();

    CompletableResult isNaN();

    CompletableResult isInfinite();

    CompletableResult isFinite();

}
