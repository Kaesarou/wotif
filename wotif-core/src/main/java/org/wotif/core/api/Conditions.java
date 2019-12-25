package org.wotif.core.api;

import org.wotif.core.api.condition.typed.booleans.AllOfBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.JoinBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.BooleanCondition;

public class Conditions {

    protected Conditions() {
    }

    public static BooleanCondition iF(Boolean term) {
        return ConditionsForInterfaceTypes.iF(term);
    }

    public static JoinBooleanCondition iFAnyOf(Boolean... terms) {
        return ConditionsForClassTypes.iFAnyOf(terms);
    }

    public static AllOfBooleanCondition iFAllOf(Boolean... terms) { return ConditionsForClassTypes.ifAllOf(terms); }

}


