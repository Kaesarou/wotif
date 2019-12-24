package org.wotif.core.api;

import org.wotif.core.api.condition.typed.booleans.MultipleBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.SingleBooleanCondition;

public class Conditions {

    protected Conditions() {
    }

    public static SingleBooleanCondition iF(Boolean term) {
        return ConditionsForInterfaceTypes.iF(term);
    }

    public static MultipleBooleanCondition iFAnyOf(Boolean... terms) {
        return ConditionsForClassTypes.iFAnyOf(terms);
    }

    //TODO: iFAllOf()

}


