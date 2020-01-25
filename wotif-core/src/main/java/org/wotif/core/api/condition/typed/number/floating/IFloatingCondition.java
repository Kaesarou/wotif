package org.wotif.core.api.condition.typed.number.floating;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.typed.number.INumberCondition;

public interface IFloatingCondition<FLOATING extends Number & Comparable<FLOATING>>
        extends INumberCondition<FLOATING> {

    CompletableConditionResult isCloseTo(Integer expected);

    CompletableConditionResult isNotCloseTo(Integer expected);

    CompletableConditionResult isNumber();

    CompletableConditionResult isNaN();

    CompletableConditionResult isInfinite();

    CompletableConditionResult isFinite();

}
