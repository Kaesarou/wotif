package org.wotif.core.api;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.arrays.ArraysCondition;
import org.wotif.core.api.condition.typed.arrays.ArraysJoinCondition;
import org.wotif.core.api.condition.typed.string.StringCondition;
import org.wotif.core.api.condition.typed.string.StringJoinCondition;

public class ConditionsForNonPrimitiveTypes extends ConditionsForPrimitiveTypes {

    //String
    public static StringCondition iF(String term) { return new StringCondition(term); }
    public static StringJoinCondition iFAnyOf(String... terms) { return new StringJoinCondition(JoinEnum.ANYOF, terms); }
    public static StringJoinCondition iFAllOf(String... terms) { return new StringJoinCondition(JoinEnum.ALLOF, terms); }
    public static StringJoinCondition iFNoneOf(String... terms) { return new StringJoinCondition(JoinEnum.NONEOF, terms); }
    //Arrays
    public static <T>ArraysCondition<T> iF(T[] term) { return new ArraysCondition<>(term); }
    @SafeVarargs
    public static <T>ArraysJoinCondition<T> iFAnyOf(T[]... terms) { return new ArraysJoinCondition<>(JoinEnum.ANYOF, terms); }
    @SafeVarargs
    public static <T>ArraysJoinCondition<T> iFAllOf(T[]... terms) { return new ArraysJoinCondition<>(JoinEnum.ALLOF, terms); }
    @SafeVarargs
    public static <T>ArraysJoinCondition<T> iFNoneOf(T[]... terms) { return new ArraysJoinCondition<>(JoinEnum.NONEOF, terms); }

}
