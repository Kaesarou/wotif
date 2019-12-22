package org.wotif.wotif.core;

public class ConditionsByType {

    public static BooleanConditionalState whether(boolean actual) { return new BooleanConditionalState(actual); }

}
