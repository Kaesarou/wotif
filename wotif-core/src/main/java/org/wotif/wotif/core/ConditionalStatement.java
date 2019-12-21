package org.wotif.wotif.core;

public class ConditionalStatement {

    protected ConditionalStatement() {};

    public static BooleanConditionalState whether(boolean actual) {
        return new BooleanConditionalState(actual);
    }

}


