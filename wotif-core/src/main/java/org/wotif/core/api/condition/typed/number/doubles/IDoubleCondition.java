package org.wotif.core.api.condition.typed.number.doubles;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.number.INumberCondition;

public interface IDoubleCondition extends INumberCondition<Double> {

    CompletableResult isCloseTo(Integer expected);
    CompletableResult isNotCloseTo(Integer expected);

}
