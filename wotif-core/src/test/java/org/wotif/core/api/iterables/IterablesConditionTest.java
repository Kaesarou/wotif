package org.wotif.core.api.iterables;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.wotif.core.api.Conditions.iF;
import static org.wotif.core.api.Conditions.iFAnyOf;

public class IterablesConditionTest {

    @Test
    public void testIfArrayContainsThenReturn1() {
        Character[] arrayToTest = {'a', 'b', 'c'};
        Integer result = iF(arrayToTest).contains('c').then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfArrayNotContainsThenReturn1() {
        Character[] arrayToTest = {'a', 'b', 'c'};
        Integer result = iF(arrayToTest).doesNotContains('d').then(() -> 1).endIF();
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
        Integer result1 = iF(arrayToTest).doesNotContainsOnly(1, 2, 3).then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer result2 = iF(arrayToTest).doesNotContainsOnly(1, 2, 3, 4)
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

    @Test
    public void testIfContainsMoreThanOnce() {
        Integer[] arrayToTest = {1, 2, 3, 4, 4};
        Integer result1 = iF(arrayToTest).containsMoreThanOnce(4).then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer result2 = iF(arrayToTest).containsMoreThanOnce(1, 2, 3, 4)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
        Integer result3 = iF(arrayToTest).containsMoreThanOnce(1, 2, 5)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result3).isEqualTo(0);
        Integer result4 = iF(arrayToTest).containsMoreThanOnce(5)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result4).isEqualTo(0);
    }

    @Test
    public void testIfStartWith() {
        Integer[] arrayToTest = {1, 2, 3, 4, 4};
        Integer result1 = iF(arrayToTest).startsWith(1).then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer result2 = iF(arrayToTest).startsWith(2).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfEndWith() {
        Integer[] arrayToTest = {1, 2, 3, 4};
        Integer result1 = iF(arrayToTest).endsWith(4).then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer result2 = iF(arrayToTest).endsWith(2).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfIsSubset() {
        Integer[] arrayToTest = {1, 2, 3, 4, 5};
        Integer result1 = iF(arrayToTest).isSubsetOf(1, 2, 3, 4, 5, 6).then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer result2 = iF(arrayToTest).isSubsetOf(1, 2, 3, 4).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfIsEmpty() {
        Integer[] arrayToTest1 = {};
        Integer result1 = iF(arrayToTest1).isEmpty().then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer[] arrayToTest2 = {1, 2, 3, 4, 5};
        Integer result2 = iF(arrayToTest2).isEmpty().then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfHasAnyElementsOfTypes() {
        Integer[] arrayToTest1 = {1, 2, 3, 4, 5};
        Integer result1 = iF(arrayToTest1).hasAnyElementsOfTypes(Integer.class, Character.class)
                .then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer[] arrayToTest2 = {1, 2, 3, 4, 5};
        Integer result2 = iF(arrayToTest2).hasAnyElementsOfTypes(Character.class).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfDoesNotHasAnyElementsOfTypes() {
        Integer[] arrayToTest1 = {1, 2, 3, 4, 5};
        Integer result1 = iF(arrayToTest1).doesNotHasAnyElementsOfTypes(Character.class)
                .then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer[] arrayToTest2 = {1, 2, 3, 4, 5};
        Integer result2 = iF(arrayToTest2).doesNotHasAnyElementsOfTypes(Character.class, Integer.class).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfContainsNull() {
        Integer[] arrayToTest1 = {1, 2, 3, 4, null};
        Integer result1 = iF(arrayToTest1).containsNull().then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer[] arrayToTest2 = {1, 2, 3, 4, 5};
        Integer result2 = iF(arrayToTest2).containsNull().then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfDoesNotContainsNull() {
        Integer[] arrayToTest1 = {1, 2, 3, 4};
        Integer result1 = iF(arrayToTest1).doesNotContainsNull().then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer[] arrayToTest2 = {1, 2, 3, 4, null};
        Integer result2 = iF(arrayToTest2).doesNotContainsNull().then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfContainsOnlyNull() {
        Integer[] arrayToTest1 = {null, null, null, null};
        Integer result1 = iF(arrayToTest1).containsOnlyNull().then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer[] arrayToTest2 = {1, 2, 3, 4, null};
        Integer result2 = iF(arrayToTest2).containsOnlyNull().then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfDoesNotContainsOnlyNull() {
        Integer[] arrayToTest1 = {null, null, null, 1};
        Integer result1 = iF(arrayToTest1).doesNotContainsOnlyNull().then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer[] arrayToTest2 = {null, null, null, null};
        Integer result2 = iF(arrayToTest2).doesNotContainsOnlyNull().then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfContainsDuplicate() {
        Integer[] arrayToTest1 = {1, 1, 2, 1};
        Integer result1 = iF(arrayToTest1).hasDuplicate().then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer[] arrayToTest2 = {1, 2, 3, null};
        Integer result2 = iF(arrayToTest2).hasDuplicate().then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIfNotContainsDuplicate() {
        Integer[] arrayToTest1 = {1, 2, 3, 4};
        Integer result1 = iF(arrayToTest1).doesNotHasDuplicate().then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer[] arrayToTest2 = {1, null, 3, null};
        Integer result2 = iF(arrayToTest2).doesNotHasDuplicate().then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testHasSameSizeAs() {
        Integer[] arrayToTest1 = {1, 2, 3, 4};
        Integer[] arrayToTest2 = {1, null, 3, null};
        Integer result1 = iF(arrayToTest1).hasSameSizeAs(arrayToTest2).then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        Integer[] arrayToTest3 = {1, 2, 3, 4};
        Integer[] arrayToTest4 = {1, null, 3};
        Integer result2 = iF(arrayToTest3).hasSameSizeAs(arrayToTest4).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
        Assertions.assertThat(arrayToTest1).contains(1);
    }

    @Test
    public void testIfIntArrayContains() {
        int[] arrayToTest1 = {1, 1, 2, 1};
        Integer result1 = iF(arrayToTest1).containsNull().then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(null);
        int[] arrayToTest2 = {1, 2, 3, 4};
        int comparator = 1;
        Integer result2 = iF(arrayToTest2).contains(comparator).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(1);
    }

    @Test
    public void testIfCharArrayContains() {
        char[] arrayToTest1 = {'a', 'b', 'c', 'd'};
        Integer result1 = iF(arrayToTest1).contains('a').then(() -> 1).endIF();
        Assertions.assertThat(result1).isEqualTo(1);
        char[] arrayToTest2 = {'a', 'b', 'c', 'd'};
        Integer result2 = iF(arrayToTest2).contains('e').then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

    @Test
    public void testIterables() {
        List<Character> listCharacters = ImmutableList.of('a','b','c','d');
        List<Character> listCharacters2 = ImmutableList.of('e','f','g','h');
        Set<String> setStrings = ImmutableSet.of("aa","bb","cc","dd");
        Integer result = iFAnyOf(listCharacters, listCharacters2).contains('c')
                .and(iF(setStrings).hasSizeBetween(1,6))
                .and(iF(listCharacters).anyMatch(e -> e.equals('b')))
                .then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
        Integer result2 = iFAnyOf(listCharacters, listCharacters2).contains('j')
                .and(iF(setStrings).hasSizeBetween(1,6))
                .and(iF(listCharacters).anyMatch(e -> e.equals('b')))
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result2).isEqualTo(0);
    }

}
