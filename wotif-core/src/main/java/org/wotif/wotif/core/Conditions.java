package org.wotif.wotif.core;

import org.wotif.wotif.core.condition.typed.BooleanCondition;

public class Conditions {

    protected Conditions() {};

    public static BooleanCondition iF(boolean actual) { return ConditionsForInterfaceTypes.whether(actual); }

}


