package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.ICondition;

public interface IStringCondition extends ICondition<String> {

    CompletableResult contains(String contains);

}
