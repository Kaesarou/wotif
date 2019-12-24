package org.wotif.core.api;

import org.wotif.core.api.condition.typed.booleans.MultipleBooleanCondition;
import org.wotif.core.api.condition.typed.booleans.SingleBooleanCondition;

public class ConditionsForClassTypes {

    public static SingleBooleanCondition iF(Boolean term) { return new SingleBooleanCondition(term); }

    public static MultipleBooleanCondition iFAnyOf(Boolean... terms) { return new MultipleBooleanCondition(terms); }

}
