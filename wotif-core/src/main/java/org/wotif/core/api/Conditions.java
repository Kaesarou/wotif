package org.wotif.core.api;

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
    //Double
    public static FloatCondition iF(Float term) { return ConditionsForInterfaceTypes.iF(term); }
    public static FloatJoinCondition iFAnyOf(Float... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static FloatJoinCondition iFAllOf(Float... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static FloatJoinCondition iFNoneOf(Float... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }
    //Short
    public static ShortCondition iF(Short term) { return ConditionsForInterfaceTypes.iF(term); }
    public static ShortJoinCondition iFAnyOf(Short... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static ShortJoinCondition iFAllOf(Short... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static ShortJoinCondition iFNoneOf(Short... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }
    //Byte
    public static ByteCondition iF(Byte term) { return ConditionsForInterfaceTypes.iF(term); }
    public static ByteJoinCondition iFAnyOf(Byte... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static ByteJoinCondition iFAllOf(Byte... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static ByteJoinCondition iFNoneOf(Byte... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }
    //Long
    public static LongCondition iF(Long term) { return ConditionsForInterfaceTypes.iF(term); }
    public static LongJoinCondition iFAnyOf(Long... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static LongJoinCondition iFAllOf(Long... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static LongJoinCondition iFNoneOf(Long... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }
    //Character
    public static CharacterCondition iF(Character term) { return ConditionsForInterfaceTypes.iF(term); }
    public static CharacterJoinCondition iFAnyOf(Character... terms) { return ConditionsForInterfaceTypes.iFAnyOf(terms); }
    public static CharacterJoinCondition iFAllOf(Character... terms) { return ConditionsForInterfaceTypes.iFAllOf(terms); }
    public static CharacterJoinCondition iFNoneOf(Character... terms) { return ConditionsForInterfaceTypes.iFNoneOf(terms); }

}


