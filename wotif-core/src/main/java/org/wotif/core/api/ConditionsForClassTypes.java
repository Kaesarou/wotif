package org.wotif.core.api;

import org.wotif.core.api.condition.typed.BooleanCondition;

public class ConditionsForClassTypes {

    public static BooleanCondition iF(Boolean actual) { return new BooleanCondition(actual); }

}
