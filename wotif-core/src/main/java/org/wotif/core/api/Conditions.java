package org.wotif.core.api;

import org.wotif.core.api.condition.typed.booleans.AllOfBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.AnyOfBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.BooleanCondition;
import org.wotif.core.api.condition.typed.booleans.NoneOfBooleanCondition;

public class Conditions {

    private Conditions() {}

    public static BooleanCondition iF(Boolean term) { return ConditionsForInterfaceTypes.iF(term); }
    public static AnyOfBooleanCondition iFAnyOf(Boolean... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static AllOfBooleanCondition iFAllOf(Boolean... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static NoneOfBooleanCondition iFNoneOf(Boolean... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }

}


