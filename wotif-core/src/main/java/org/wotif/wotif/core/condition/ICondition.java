package org.wotif.wotif.core.condition;

import org.wotif.wotif.core.AbstractReturnStatement;

public interface ICondition<T> {

    <RESULT> AbstractReturnStatement<RESULT> thenReturn(RESULT valueToReturn);

}
