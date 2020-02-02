package org.wotif.core.api;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.iterables.IterableCondition;
import org.wotif.core.api.condition.typed.iterables.IterableJoinCondition;
import org.wotif.core.api.condition.typed.iterables.arrays.*;
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
    //Arrays boolean
    public static BooleanArraysCondition iF(boolean[] term) { return new BooleanArraysCondition(term); }
    public static BooleanArraysJoinCondition iFAnyOf(boolean[]... terms) { return new BooleanArraysJoinCondition(JoinEnum.ANYOF, terms); }
    public static BooleanArraysJoinCondition iFAllOf(boolean[]... terms) { return new BooleanArraysJoinCondition(JoinEnum.ALLOF, terms); }
    public static BooleanArraysJoinCondition iFNoneOf(boolean[]... terms) { return new BooleanArraysJoinCondition(JoinEnum.NONEOF, terms); }
    //Arrays byte
    public static ByteArraysCondition iF(byte[] term) { return new ByteArraysCondition(term); }
    public static ByteArraysJoinCondition iFAnyOf(byte[]... terms) { return new ByteArraysJoinCondition(JoinEnum.ANYOF, terms); }
    public static ByteArraysJoinCondition iFAllOf(byte[]... terms) { return new ByteArraysJoinCondition(JoinEnum.ALLOF, terms); }
    public static ByteArraysJoinCondition iFNoneOf(byte[]... terms) { return new ByteArraysJoinCondition(JoinEnum.NONEOF, terms); }
    //Arrays char
    public static CharArraysCondition iF(char[] term) { return new CharArraysCondition(term); }
    public static CharArraysJoinCondition iFAnyOf(char[]... terms) { return new CharArraysJoinCondition(JoinEnum.ANYOF, terms); }
    public static CharArraysJoinCondition iFAllOf(char[]... terms) { return new CharArraysJoinCondition(JoinEnum.ALLOF, terms); }
    public static CharArraysJoinCondition iFNoneOf(char[]... terms) { return new CharArraysJoinCondition(JoinEnum.NONEOF, terms); }
    //Arrays double
    public static DoubleArraysCondition iF(double[] term) { return new DoubleArraysCondition(term); }
    public static DoubleArraysJoinCondition iFAnyOf(double[]... terms) { return new DoubleArraysJoinCondition(JoinEnum.ANYOF, terms); }
    public static DoubleArraysJoinCondition iFAllOf(double[]... terms) { return new DoubleArraysJoinCondition(JoinEnum.ALLOF, terms); }
    public static DoubleArraysJoinCondition iFNoneOf(double[]... terms) { return new DoubleArraysJoinCondition(JoinEnum.NONEOF, terms); }
    //Arrays float
    public static FloatArraysCondition iF(float[] term) { return new FloatArraysCondition(term); }
    public static FloatArraysJoinCondition iFAnyOf(float[]... terms) { return new FloatArraysJoinCondition(JoinEnum.ANYOF, terms); }
    public static FloatArraysJoinCondition iFAllOf(float[]... terms) { return new FloatArraysJoinCondition(JoinEnum.ALLOF, terms); }
    public static FloatArraysJoinCondition iFNoneOf(float[]... terms) { return new FloatArraysJoinCondition(JoinEnum.NONEOF, terms); }
    //Arrays int
    public static IntArraysCondition iF(int[] term) { return new IntArraysCondition(term); }
    public static IntArraysJoinCondition iFAnyOf(int[]... terms) { return new IntArraysJoinCondition(JoinEnum.ANYOF, terms); }
    public static IntArraysJoinCondition iFAllOf(int[]... terms) { return new IntArraysJoinCondition(JoinEnum.ALLOF, terms); }
    public static IntArraysJoinCondition iFNoneOf(int[]... terms) { return new IntArraysJoinCondition(JoinEnum.NONEOF, terms); }
    //Arrays long
    public static LongArraysCondition iF(long[] term) { return new LongArraysCondition(term); }
    public static LongArraysJoinCondition iFAnyOf(long[]... terms) { return new LongArraysJoinCondition(JoinEnum.ANYOF, terms); }
    public static LongArraysJoinCondition iFAllOf(long[]... terms) { return new LongArraysJoinCondition(JoinEnum.ALLOF, terms); }
    public static LongArraysJoinCondition iFNoneOf(long[]... terms) { return new LongArraysJoinCondition(JoinEnum.NONEOF, terms); }
    //Arrays short
    public static ShortArraysCondition iF(short[] term) { return new ShortArraysCondition(term); }
    public static ShortArraysJoinCondition iFAnyOf(short[]... terms) { return new ShortArraysJoinCondition(JoinEnum.ANYOF, terms); }
    public static ShortArraysJoinCondition iFAllOf(short[]... terms) { return new ShortArraysJoinCondition(JoinEnum.ALLOF, terms); }
    public static ShortArraysJoinCondition iFNoneOf(short[]... terms) { return new ShortArraysJoinCondition(JoinEnum.NONEOF, terms); }
    //Iterables
    public static <T> IterableCondition<T> iF(Iterable<T> term) { return new IterableCondition<>(term); }
    @SafeVarargs
    public static <T> IterableJoinCondition<T> iFAnyOf(Iterable<T>... terms) { return new IterableJoinCondition<>(JoinEnum.ANYOF, terms); }
    @SafeVarargs
    public static <T> IterableJoinCondition<T> iFAllOf(Iterable<T>... terms) { return new IterableJoinCondition<>(JoinEnum.ALLOF, terms); }
    @SafeVarargs
    public static <T> IterableJoinCondition<T> iFNoneOf(Iterable<T>... terms) { return new IterableJoinCondition<>(JoinEnum.NONEOF, terms); }

}
