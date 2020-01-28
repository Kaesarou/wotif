package org.wotif.core.api.condition.typed.character;

import org.wotif.core.api.CompletableResult;
import org.wotif.core.api.condition.JoinEnum;
import org.wotif.core.api.condition.typed.ComparableJoinCondition;

public class CharacterJoinCondition
        extends ComparableJoinCondition<Character, CharacterCondition>
        implements ICharacterCondition {

    public CharacterJoinCondition(JoinEnum joinType, Character... terms) {
        super(joinType, terms);
    }

    @Override
    protected CharacterCondition getInstanceOfCondition(Character term) {
        return new CharacterCondition(term);
    }

    @Override
    public CompletableResult isUpperCase() {
        return this.functionToApply.apply(CharacterCondition::isUpperCase);
    }

    @Override
    public CompletableResult isLowerCase() {
        return this.functionToApply.apply(CharacterCondition::isLowerCase);
    }

}
