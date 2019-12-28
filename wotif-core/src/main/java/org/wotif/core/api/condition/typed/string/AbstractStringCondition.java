package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.AbstractCondition;

public abstract class AbstractStringCondition extends AbstractCondition<String> implements IStringCondition {

    public AbstractStringCondition(String term) { super(term); }

}
