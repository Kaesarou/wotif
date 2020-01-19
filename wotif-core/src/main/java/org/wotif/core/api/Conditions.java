package org.wotif.core.api;

import org.wotif.core.api.condition.typed.booleans.BooleanCondition;
import org.wotif.core.api.condition.typed.booleans.BooleanJoinCondition;
import org.wotif.core.api.condition.typed.number.doubles.DoubleCondition;
import org.wotif.core.api.condition.typed.number.doubles.DoubleJoinCondition;
import org.wotif.core.api.condition.typed.number.integer.IntegerCondition;
import org.wotif.core.api.condition.typed.number.integer.IntegerJoinCondition;
import org.wotif.core.api.condition.typed.string.StringCondition;
import org.wotif.core.api.condition.typed.string.StringJoinCondition;

public class Conditions {

    private Conditions() {}

    //Boolean
    public static BooleanCondition iF(Boolean term) { return ConditionsForInterfaceTypes.iF(term); }
    public static BooleanJoinCondition iFAnyOf(Boolean... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static BooleanJoinCondition iFAllOf(Boolean... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static BooleanJoinCondition iFNoneOf(Boolean... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }
    //String
    public static StringCondition iF(String term) {return ConditionsForInterfaceTypes.iF(term); }
    public static StringJoinCondition iFAnyOf(String... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static StringJoinCondition iFAllOf(String... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static StringJoinCondition iFNoneOf(String... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }
    //Integer
    public static IntegerCondition iF(Integer term) { return ConditionsForInterfaceTypes.iF(term); }
    public static IntegerJoinCondition iFAnyOf(Integer... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static IntegerJoinCondition iFAllOf(Integer... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static IntegerJoinCondition iFNoneOf(Integer... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }
    //Double
    public static DoubleCondition iF(Double term) { return ConditionsForInterfaceTypes.iF(term); }
    public static DoubleJoinCondition iFAnyOf(Double... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static DoubleJoinCondition iFAllOf(Double... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static DoubleJoinCondition iFNoneOf(Double... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }

}


