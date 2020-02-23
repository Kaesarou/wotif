package org.wotif.core.api;

import org.wotif.core.api.condition.typed.booleans.BooleanCondition;
import org.wotif.core.api.condition.typed.booleans.BooleanJoinCondition;
import org.wotif.core.api.condition.typed.character.CharacterCondition;
import org.wotif.core.api.condition.typed.character.CharacterJoinCondition;
import org.wotif.core.api.condition.typed.iterables.IterableCondition;
import org.wotif.core.api.condition.typed.iterables.IterableJoinCondition;
import org.wotif.core.api.condition.typed.iterables.arrays.*;
import org.wotif.core.api.condition.typed.number.bytes.ByteCondition;
import org.wotif.core.api.condition.typed.number.bytes.ByteJoinCondition;
import org.wotif.core.api.condition.typed.number.floating.doubles.DoubleCondition;
import org.wotif.core.api.condition.typed.number.floating.doubles.DoubleJoinCondition;
import org.wotif.core.api.condition.typed.number.floating.floats.FloatCondition;
import org.wotif.core.api.condition.typed.number.floating.floats.FloatJoinCondition;
import org.wotif.core.api.condition.typed.number.integer.IntegerCondition;
import org.wotif.core.api.condition.typed.number.integer.IntegerJoinCondition;
import org.wotif.core.api.condition.typed.number.longs.LongCondition;
import org.wotif.core.api.condition.typed.number.longs.LongJoinCondition;
import org.wotif.core.api.condition.typed.number.shorts.ShortCondition;
import org.wotif.core.api.condition.typed.number.shorts.ShortJoinCondition;
import org.wotif.core.api.condition.typed.string.StringCondition;
import org.wotif.core.api.condition.typed.string.StringJoinCondition;

public class Conditions {

    private Conditions() {}

    //Boolean
    public static BooleanCondition iF(Boolean term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static BooleanJoinCondition iFAnyOf(Boolean... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static BooleanJoinCondition iFAllOf(Boolean... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static BooleanJoinCondition iFNoneOf(Boolean... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //String
    public static StringCondition iF(String term) {return ConditionsForNonPrimitiveTypes.iF(term); }
    public static StringJoinCondition iFAnyOf(String... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static StringJoinCondition iFAllOf(String... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static StringJoinCondition iFNoneOf(String... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Integer
    public static IntegerCondition iF(Integer term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static IntegerJoinCondition iFAnyOf(Integer... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static IntegerJoinCondition iFAllOf(Integer... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static IntegerJoinCondition iFNoneOf(Integer... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Double
    public static DoubleCondition iF(Double term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static DoubleJoinCondition iFAnyOf(Double... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static DoubleJoinCondition iFAllOf(Double... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static DoubleJoinCondition iFNoneOf(Double... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Double
    public static FloatCondition iF(Float term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static FloatJoinCondition iFAnyOf(Float... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static FloatJoinCondition iFAllOf(Float... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static FloatJoinCondition iFNoneOf(Float... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Short
    public static ShortCondition iF(Short term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static ShortJoinCondition iFAnyOf(Short... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static ShortJoinCondition iFAllOf(Short... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static ShortJoinCondition iFNoneOf(Short... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Byte
    public static ByteCondition iF(Byte term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static ByteJoinCondition iFAnyOf(Byte... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static ByteJoinCondition iFAllOf(Byte... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static ByteJoinCondition iFNoneOf(Byte... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Long
    public static LongCondition iF(Long term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static LongJoinCondition iFAnyOf(Long... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static LongJoinCondition iFAllOf(Long... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static LongJoinCondition iFNoneOf(Long... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Character
    public static CharacterCondition iF(Character term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static CharacterJoinCondition iFAnyOf(Character... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static CharacterJoinCondition iFAllOf(Character... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static CharacterJoinCondition iFNoneOf(Character... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Arrays Generic
    public static <T> ArraysCondition<T> iF(T[] term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    @SafeVarargs
    public static <T>ArraysJoinCondition<T> iFAnyOf(T[]... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    @SafeVarargs
    public static <T>ArraysJoinCondition<T> iFAllOf(T[]... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    @SafeVarargs
    public static <T>ArraysJoinCondition<T> iFNoneOf(T[]... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Arrays boolean
    public static BooleanArraysCondition iF(boolean[] term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static BooleanArraysJoinCondition iFAnyOf(boolean[]... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static BooleanArraysJoinCondition iFAllOf(boolean[]... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static BooleanArraysJoinCondition iFNoneOf(boolean[]... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Arrays byte
    public static ByteArraysCondition iF(byte[] term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static ByteArraysJoinCondition iFAnyOf(byte[]... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static ByteArraysJoinCondition iFAllOf(byte[]... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static ByteArraysJoinCondition iFNoneOf(byte[]... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Arrays char
    public static CharArraysCondition iF(char[] term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static CharArraysJoinCondition iFAnyOf(char[]... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static CharArraysJoinCondition iFAllOf(char[]... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static CharArraysJoinCondition iFNoneOf(char[]... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Arrays double
    public static DoubleArraysCondition iF(double[] term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static DoubleArraysJoinCondition iFAnyOf(double[]... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static DoubleArraysJoinCondition iFAllOf(double[]... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static DoubleArraysJoinCondition iFNoneOf(double[]... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Arrays float
    public static FloatArraysCondition iF(float[] term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static FloatArraysJoinCondition iFAnyOf(float[]... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static FloatArraysJoinCondition iFAllOf(float[]... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static FloatArraysJoinCondition iFNoneOf(float[]... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Arrays int
    public static IntArraysCondition iF(int[] term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static IntArraysJoinCondition iFAnyOf(int[]... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static IntArraysJoinCondition iFAllOf(int[]... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static IntArraysJoinCondition iFNoneOf(int[]... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Arrays long
    public static LongArraysCondition iF(long[] term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static LongArraysJoinCondition iFAnyOf(long[]... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static LongArraysJoinCondition iFAllOf(long[]... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static LongArraysJoinCondition iFNoneOf(long[]... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Arrays short
    public static ShortArraysCondition iF(short[] term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    public static ShortArraysJoinCondition iFAnyOf(short[]... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    public static ShortArraysJoinCondition iFAllOf(short[]... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    public static ShortArraysJoinCondition iFNoneOf(short[]... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }
    //Iterables
    public static <T> IterableCondition<T> iF(Iterable<T> term) { return ConditionsForNonPrimitiveTypes.iF(term); }
    @SafeVarargs
    public static <T> IterableJoinCondition<T> iFAnyOf(Iterable<T>... terms) { return ConditionsForNonPrimitiveTypes.iFAnyOf(terms); }
    @SafeVarargs
    public static <T> IterableJoinCondition<T> iFAllOf(Iterable<T>... terms) { return ConditionsForNonPrimitiveTypes.iFAllOf(terms); }
    @SafeVarargs
    public static <T> IterableJoinCondition<T> iFNoneOf(Iterable<T>... terms) { return ConditionsForNonPrimitiveTypes.iFNoneOf(terms); }

}


