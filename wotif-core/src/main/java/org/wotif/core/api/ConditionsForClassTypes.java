package org.wotif.core.api;

import org.wotif.core.api.condition.AbstractCondition;
import org.wotif.core.api.condition.typed.booleans.*;

public class ConditionsForClassTypes {

    public static <TYPE> AbstractCondition<TYPE> iF(TYPE term) { return null; }

    public static BooleanCondition iF(Boolean term) { return new BooleanCondition(term); }
    public static JoinBooleanCondition iFAnyOf(Boolean... terms) { return new AnyOfBooleanCondition(terms); }
    public static AllOfBooleanCondition iFAllOf(Boolean... terms) { return new AllOfBooleanCondition(terms); }
    public static NoneOfBooleanCondition iFNoneOf(Boolean... terms) { return new NoneOfBooleanCondition(terms); }

}
