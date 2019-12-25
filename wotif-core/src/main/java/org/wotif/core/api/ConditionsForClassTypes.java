package org.wotif.core.api;

import org.wotif.core.api.condition.typed.booleans.AllOfBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.AnyOfBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.JoinBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.BooleanCondition;

public class ConditionsForClassTypes {

    public static BooleanCondition iF(Boolean term) { return new BooleanCondition(term); }

    public static JoinBooleanCondition iFAnyOf(Boolean... terms) { return new AnyOfBooleanCondition(terms); }

    public static AllOfBooleanCondition ifAllOf(Boolean... terms) { return new AllOfBooleanCondition(terms); }

}
