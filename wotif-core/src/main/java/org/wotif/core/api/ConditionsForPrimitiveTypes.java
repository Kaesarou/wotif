package org.wotif.core.api;

import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.booleans.BooleanCondition;
import org.wotif.core.api.condition.typed.booleans.BooleanJoinCondition;
import org.wotif.core.api.condition.typed.character.CharacterCondition;
import org.wotif.core.api.condition.typed.character.CharacterJoinCondition;
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

class ConditionsForPrimitiveTypes {

    //Boolean
    public static BooleanCondition iF(Boolean term) { return new BooleanCondition(term); }
    public static BooleanJoinCondition iFAnyOf(Boolean... terms) { return new BooleanJoinCondition(JoinEnum.ANYOF, terms); }
    public static BooleanJoinCondition iFAllOf(Boolean... terms) { return new BooleanJoinCondition(JoinEnum.ALLOF, terms); }
    public static BooleanJoinCondition iFNoneOf(Boolean... terms) { return new BooleanJoinCondition(JoinEnum.NONEOF, terms); }
    //Integer
    public static IntegerCondition iF(Integer term) { return new IntegerCondition(term); }
    public static IntegerJoinCondition iFAnyOf(Integer... terms) { return new IntegerJoinCondition(JoinEnum.ANYOF, terms); }
    public static IntegerJoinCondition iFAllOf(Integer... terms) { return new IntegerJoinCondition(JoinEnum.ALLOF, terms); }
    public static IntegerJoinCondition iFNoneOf(Integer... terms) { return new IntegerJoinCondition(JoinEnum.NONEOF, terms); }
    //Double
    public static DoubleCondition iF(Double term) { return new DoubleCondition(term); }
    public static DoubleJoinCondition iFAnyOf(Double... terms) { return new DoubleJoinCondition(JoinEnum.ANYOF, terms); }
    public static DoubleJoinCondition iFAllOf(Double... terms) { return new DoubleJoinCondition(JoinEnum.ALLOF, terms); }
    public static DoubleJoinCondition iFNoneOf(Double... terms) { return new DoubleJoinCondition(JoinEnum.NONEOF, terms); }
    //Float
    public static FloatCondition iF(Float term) { return new FloatCondition(term); }
    public static FloatJoinCondition iFAnyOf(Float... terms) { return new FloatJoinCondition(JoinEnum.ANYOF, terms); }
    public static FloatJoinCondition iFAllOf(Float... terms) { return new FloatJoinCondition(JoinEnum.ALLOF, terms); }
    public static FloatJoinCondition iFNoneOf(Float... terms) { return new FloatJoinCondition(JoinEnum.NONEOF, terms); }
    //Short
    public static ShortCondition iF(Short term) { return new ShortCondition(term); }
    public static ShortJoinCondition iFAnyOf(Short... terms) { return new ShortJoinCondition(JoinEnum.ANYOF, terms); }
    public static ShortJoinCondition iFAllOf(Short... terms) { return new ShortJoinCondition(JoinEnum.ALLOF, terms); }
    public static ShortJoinCondition iFNoneOf(Short... terms) { return new ShortJoinCondition(JoinEnum.NONEOF, terms); }
    //Byte
    public static ByteCondition iF(Byte term) { return new ByteCondition(term); }
    public static ByteJoinCondition iFAnyOf(Byte... terms) { return new ByteJoinCondition(JoinEnum.ANYOF, terms); }
    public static ByteJoinCondition iFAllOf(Byte... terms) { return new ByteJoinCondition(JoinEnum.ALLOF, terms); }
    public static ByteJoinCondition iFNoneOf(Byte... terms) { return new ByteJoinCondition(JoinEnum.NONEOF, terms); }
    //Long
    public static LongCondition iF(Long term) { return new LongCondition(term); }
    public static LongJoinCondition iFAnyOf(Long... terms) { return new LongJoinCondition(JoinEnum.ANYOF, terms); }
    public static LongJoinCondition iFAllOf(Long... terms) { return new LongJoinCondition(JoinEnum.ALLOF, terms); }
    public static LongJoinCondition iFNoneOf(Long... terms) { return new LongJoinCondition(JoinEnum.NONEOF, terms); }
    //Character
    public static CharacterCondition iF(Character term) { return new CharacterCondition(term); }
    public static CharacterJoinCondition iFAnyOf(Character... terms) { return new CharacterJoinCondition(JoinEnum.ANYOF, terms); }
    public static CharacterJoinCondition iFAllOf(Character... terms) { return new CharacterJoinCondition(JoinEnum.ALLOF, terms); }
    public static CharacterJoinCondition iFNoneOf(Character... terms) { return new CharacterJoinCondition(JoinEnum.NONEOF, terms); }

}
