package org.wotif.core.api.condition;

import org.wotif.core.api.AbstractReturnStatement;

public interface ICondition<T> {

    <RESULT> AbstractReturnStatement<RESULT> thenReturn(RESULT valueToReturn);

}
