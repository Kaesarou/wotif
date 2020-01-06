package org.wotif.core.api;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.booleans.BooleanCondition;
import org.wotif.core.api.condition.typed.booleans.BooleanJoinCondition;
import org.wotif.core.api.condition.typed.number.integer.IntegerCondition;
import org.wotif.core.api.condition.typed.number.integer.IntegerJoinCondition;
import org.wotif.core.api.condition.typed.string.StringCondition;
import org.wotif.core.api.condition.typed.string.StringJoinCondition;

public class ConditionsForClassTypes {

    //Boolean
    public static BooleanCondition iF(Boolean term) { return new BooleanCondition(term); }
    public static BooleanJoinCondition iFAnyOf(Boolean... terms) { return new BooleanJoinCondition(JoinEnum.ANYOF, terms); }
    public static BooleanJoinCondition iFAllOf(Boolean... terms) { return new BooleanJoinCondition(JoinEnum.ALLOF, terms); }
    public static BooleanJoinCondition iFNoneOf(Boolean... terms) { return new BooleanJoinCondition(JoinEnum.NONEOF, terms); }
    //String
    public static StringCondition iF(String term) { return new StringCondition(term); }
    public static StringJoinCondition iFAnyOf(String... terms) { return new StringJoinCondition(JoinEnum.ANYOF, terms); }
    public static StringJoinCondition iFAllOf(String... terms) { return new StringJoinCondition(JoinEnum.ALLOF, terms); }
    public static StringJoinCondition iFNoneOf(String... terms) { return new StringJoinCondition(JoinEnum.NONEOF, terms); }
    //Integer
    public static IntegerCondition iF(Integer term) { return new IntegerCondition(term); }
    public static IntegerJoinCondition iFAnyOf(Integer... terms) { return new IntegerJoinCondition(JoinEnum.ANYOF, terms); }
    public static IntegerJoinCondition iFAllOf(Integer... terms) { return new IntegerJoinCondition(JoinEnum.ALLOF, terms); }
    public static IntegerJoinCondition iFNoneOf(Integer... terms) { return new IntegerJoinCondition(JoinEnum.NONEOF, terms); }

}
