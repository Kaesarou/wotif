package org.wotif.core.api.arrays;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

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

    @Test
    public void testIfContainsAnyOf() {
        Integer[] arrayToTest = {1, 2, 3, 4};
        Integer result1 = iF(arrayToTest).containsAnyOf(2, 3).then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer result2 = iF(arrayToTest).containsAnyOf(1, 6, 9).then(() -> 1).endIF();
        Assertions.assertThat(result2).isEqualTo(1);
        Integer result3 = iF(arrayToTest).containsAnyOf(Arrays.asList(5, 6, 7)).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result3).isEqualTo(0);
    }

    @Test
    public void testIfContainsOnly() {
        Integer[] arrayToTest = {1, 2, 3, 4};
        Integer result1 = iF(arrayToTest).containsOnly(1, 2, 3, 4).then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer result2 = iF(arrayToTest).containsOnly(1, 2, 3)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfNotContainsOnly() {
        Integer[] arrayToTest = {1, 2, 3, 4};
        Integer result1 = iF(arrayToTest).notContainsOnly(1, 2, 3).then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer result2 = iF(arrayToTest).notContainsOnly(1, 2, 3, 4)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfContainsOnlyOnce() {
        Integer[] arrayToTest = {1, 2, 3, 4, 4};
        Integer result1 = iF(arrayToTest).containsOnlyOnce(1, 2, 3).then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer result2 = iF(arrayToTest).containsOnlyOnce(1, 2, 3, 4)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
        Integer result3 = iF(arrayToTest).containsOnlyOnce(1, 2, 5)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result3).isEqualTo(0);
        Integer result4 = iF(arrayToTest).containsOnlyOnce(1)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result4).isEqualTo(1);
        Integer result5 = iF(arrayToTest).containsOnlyOnce(4)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result5).isEqualTo(0);
    }

}
