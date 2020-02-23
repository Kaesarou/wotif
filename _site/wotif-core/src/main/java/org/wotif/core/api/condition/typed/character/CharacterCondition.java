package org.wotif.core.api.condition.typed.character;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.typed.ComparableCondition;

public class CharacterCondition extends ComparableCondition<Character> implements ICharacterCondition {

    public CharacterCondition(Character term) {
        super(term);
    }

    @Override
    public CompletableResult isUpperCase() {
        boolean upperCase = Character.isUpperCase(this.term.value());
        return new CompletableResult(upperCase);
    }

    @Override
    public CompletableResult isLowerCase() {
        boolean upperCase = Character.isLowerCase(this.term.value());
        return new CompletableResult(upperCase);
    }

}
