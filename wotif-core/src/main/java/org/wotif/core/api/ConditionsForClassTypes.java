package org.wotif.core.api;

import org.wotif.core.api.condition.AbstractCondition;
import org.wotif.core.api.condition.typed.booleans.*;
import org.wotif.core.api.condition.typed.number.integer.AllOfIntegerCondition;
import org.wotif.core.api.condition.typed.number.integer.AnyOfIntegerCondition;
import org.wotif.core.api.condition.typed.number.integer.IntegerCondition;
import org.wotif.core.api.condition.typed.number.integer.NoneOfIntegerCondition;
import org.wotif.core.api.condition.typed.string.AllOfStringCondition;
import org.wotif.core.api.condition.typed.string.AnyOfStringCondition;
import org.wotif.core.api.condition.typed.string.NoneOfStringCondition;
import org.wotif.core.api.condition.typed.string.StringCondition;

public class ConditionsForClassTypes {

    //Boolean
    public static BooleanCondition iF(Boolean term) { return new BooleanCondition(term); }
    public static AnyOfBooleanCondition iFAnyOf(Boolean... terms) { return new AnyOfBooleanCondition(terms); }
    public static AllOfBooleanCondition iFAllOf(Boolean... terms) { return new AllOfBooleanCondition(terms); }
    public static NoneOfBooleanCondition iFNoneOf(Boolean... terms) { return new NoneOfBooleanCondition(terms); }
    //String
    public static StringCondition iF(String term) { return new StringCondition(term); }
    public static AnyOfStringCondition iFAnyOf(String... terms) { return new AnyOfStringCondition(terms); }
    public static AllOfStringCondition iFAllOf(String... terms) { return new AllOfStringCondition(terms); }
    public static NoneOfStringCondition iFNoneOf(String... terms) { return new NoneOfStringCondition(terms); }
    //Integer
    public static IntegerCondition iF(Integer term) { return new IntegerCondition(term); }
    public static AnyOfIntegerCondition iFAnyOf(Integer... terms) { return new AnyOfIntegerCondition(terms); }
    public static AllOfIntegerCondition iFAllOf(Integer... terms) { return new AllOfIntegerCondition(terms); }
    public static NoneOfIntegerCondition iFNoneOf(Integer... terms) { return new NoneOfIntegerCondition(terms); }

}
