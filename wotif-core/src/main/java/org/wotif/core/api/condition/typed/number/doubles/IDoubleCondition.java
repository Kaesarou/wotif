package org.wotif.core.api.condition.typed.number.doubles;

import org.wotif.core.api.CompletableConditionResult;
import org.wotif.core.api.condition.typed.number.INumberCondition;

public interface IDoubleCondition extends INumberCondition<Double> {

    CompletableConditionResult isCloseTo(Integer expected);

    CompletableConditionResult isNotCloseTo(Integer expected);

}
