package org.wotif.core.api;

import org.wotif.core.api.condition.typed.BooleanCondition;

public class Conditions {

    protected Conditions() {};

    public static BooleanCondition iF(Boolean actual) { return ConditionsForInterfaceTypes.iF(actual); }

}


