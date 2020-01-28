package org.wotif.core.api.arrays;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.wotif.core.api.Conditions.iF;

public class ArraysConditionTest {

    @Test
    public void testIfArrayContainsThenReturn1() {
        Character[] arrayToTest = {'a', 'b', 'c'};
        Integer result = iF(arrayToTest).contains('b').then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfArrayNotContainsThenReturn1() {
        Character[] arrayToTest = {'a', 'b', 'c'};
        Integer result = iF(arrayToTest).notContains('d').then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

}
