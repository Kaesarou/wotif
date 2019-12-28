package org.wotif.core.api;

import org.wotif.core.api.condition.typed.booleans.AllOfBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.AnyOfBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.BooleanCondition;
import org.wotif.core.api.condition.typed.booleans.NoneOfBooleanCondition;
import org.wotif.core.api.condition.typed.string.AllOfStringCondition;
import org.wotif.core.api.condition.typed.string.AnyOfStringCondition;
import org.wotif.core.api.condition.typed.string.NoneOfStringCondition;
import org.wotif.core.api.condition.typed.string.StringCondition;

public class Conditions {

    private Conditions() {}

    public static BooleanCondition iF(Boolean term) { return ConditionsForInterfaceTypes.iF(term); }
    public static AnyOfBooleanCondition iFAnyOf(Boolean... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static AllOfBooleanCondition iFAllOf(Boolean... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static NoneOfBooleanCondition iFNoneOf(Boolean... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }

    public static StringCondition iF(String term) {return ConditionsForInterfaceTypes.iF(term); }
    public static AnyOfStringCondition iFAnyOf(String... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static AllOfStringCondition iFAllOf(String... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static NoneOfStringCondition iFNoneOf(String... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }
}


