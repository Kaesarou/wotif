package org.wotif.core.api.condition.typed.character;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.IComparableCondition;

public interface ICharacterCondition extends IComparableCondition<Character> {

    CompletableResult isUpperCase();

    CompletableResult isLowerCase();

}
