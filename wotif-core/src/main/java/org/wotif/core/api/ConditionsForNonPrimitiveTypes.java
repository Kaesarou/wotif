package org.wotif.core.api;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterables.arrays.ArraysCondition;
import org.wotif.core.api.condition.typed.iterables.arrays.ArraysJoinCondition;
import org.wotif.core.api.condition.typed.iterables.arrays.IntArraysCondition;
import org.wotif.core.api.condition.typed.iterables.arrays.IntArraysJoinCondition;
import org.wotif.core.api.condition.typed.string.StringCondition;
import org.wotif.core.api.condition.typed.string.StringJoinCondition;

class ConditionsForNonPrimitiveTypes extends ConditionsForPrimitiveTypes {

    //String
    public static StringCondition iF(String term) { return new StringCondition(term); }
    public static StringJoinCondition iFAnyOf(String... terms) { return new StringJoinCondition(JoinEnum.ANYOF, terms); }
    public static StringJoinCondition iFAllOf(String... terms) { return new StringJoinCondition(JoinEnum.ALLOF, terms); }
    public static StringJoinCondition iFNoneOf(String... terms) { return new StringJoinCondition(JoinEnum.NONEOF, terms); }
    //Arrays object
    public static <T> ArraysCondition<T> iF(T[] term) { return new ArraysCondition<>(term); }
    @SafeVarargs
    public static <T>ArraysJoinCondition<T> iFAnyOf(T[]... terms) { return new ArraysJoinCondition<>(JoinEnum.ANYOF, terms); }
    @SafeVarargs
    public static <T>ArraysJoinCondition<T> iFAllOf(T[]... terms) { return new ArraysJoinCondition<>(JoinEnum.ALLOF, terms); }
    @SafeVarargs
    public static <T>ArraysJoinCondition<T> iFNoneOf(T[]... terms) { return new ArraysJoinCondition<>(JoinEnum.NONEOF, terms); }
    //Arrays int
    public static IntArraysCondition iF(int[] term) { return new IntArraysCondition(term); }
    public static IntArraysJoinCondition iFAnyOf(int[]... terms) { return new IntArraysJoinCondition(JoinEnum.ANYOF, terms); }
    public static IntArraysJoinCondition iFAllOf(int[]... terms) { return new IntArraysJoinCondition(JoinEnum.ALLOF, terms); }
    public static IntArraysJoinCondition iFNoneOf(int[]... terms) { return new IntArraysJoinCondition(JoinEnum.NONEOF, terms); }

}
