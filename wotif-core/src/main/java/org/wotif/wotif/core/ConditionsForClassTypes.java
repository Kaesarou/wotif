package org.wotif.wotif.core;

import org.wotif.wotif.core.condition.typed.BooleanCondition;

public class ConditionsForClassTypes {

    public static BooleanCondition whether(boolean actual) { return new BooleanCondition(actual); }

}
