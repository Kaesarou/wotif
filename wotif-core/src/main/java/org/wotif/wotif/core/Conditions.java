package org.wotif.wotif.core;

public class Conditions {

    protected Conditions() {};

    public static BooleanConditionalState whether(boolean actual) {
        return ConditionsByType.whether(actual);
    }

}


