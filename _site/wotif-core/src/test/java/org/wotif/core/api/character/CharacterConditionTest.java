package org.wotif.core.api.character;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.wotif.core.api.Conditions.iF;

public class CharacterConditionTest {

    @Test
    public void testIfCharacterIsUpperCaseThenReturn1() {
        Integer result = iF('C').isUpperCase().then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfCharacterIsUpperCaseOrLowerCaseThenReturn2() {
        Integer result = iF('c').isUpperCase()
                .then(() -> 1).orElse(iF('c').isLowerCase(), () -> 2)
                .endIF();
        Assertions.assertThat(result).isEqualTo(2);
    }

}
