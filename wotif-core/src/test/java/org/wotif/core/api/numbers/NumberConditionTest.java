package org.wotif.core.api.numbers;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.wotif.core.api.Conditions.iF;


public class NumberConditionTest {

    @Test
    public void testIfZeroIsPositiveThenReturnOne() {
        Integer result = iF(0).isPositive().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfValueIsPositiveThenReturnOne() {
        Integer result = iF(1).isPositive().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfValueIsPositiveThenReturnZero() {
        Integer result = iF(-1).isPositive().thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfValueIsNegativeThenReturnOne() {
        Integer result = iF(-1).isNegative().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfValueIsNegativeThenReturnZero() {
        Integer result = iF(1).isNegative().thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfZeroThenReturnOne() {
        Integer result = iF(0).isZero().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfNotZeroThenReturnOne() {
        Integer result = iF(1).isDifferentFromZero().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfNotZeroThenReturnZero() {
        Integer result = iF(0).isDifferentFromZero().thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsLessThenReturnOne() {
        Integer result = iF(5).isLessThen(10).thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsLessThenReturnZero() {
        Integer result = iF(10).isLessThen(10).thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsEqualToThenReturnOne() {
        Integer result = iF(10).isEqualTo(10).thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsDifferentFromThenReturnZero() {
        Integer result = iF(10).isDifferentFrom(10).thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsGreaterThenReturnOne() {
        Integer result = iF(10).isGreaterThen(5).thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsBetween3And9ThenReturnOne() {
        Integer result = iF(5).isBetween(3,9).thenReturn(1).endIF();
        Integer secondResult = iF(3).isBetween(3,9).thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
        Assertions.assertThat(secondResult).isEqualTo(1);
    }

    @Test
    public void testIfIsBetween3And9ThenReturnZero() {
        Integer result = iF(11).isBetween(3,9).thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsNotBetween3And9ThenReturnOne() {
        Integer result = iF(11).isNotBetween(3,9).thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotBetween3And9ThenReturnZero() {
        Integer result = iF(4).isNotBetween(3,9).thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsStrictlyBetween3And9ThenReturnOne() {
        Integer result = iF(5).isStrictlyBetween(3,9).thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsStrictlyBetween3And9ThenReturnZero() {
        Integer result = iF(3).isStrictlyBetween(3,9).thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);

    }

    @Test
    public void testIfIsCloseThenReturnOne() {
        Integer result = iF(3.6).isCloseTo(4).thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsCloseThenReturnZero() {
        Integer result = iF(3.4).isCloseTo(4).thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsNotCloseThenReturnOne() {
        Integer result = iF(3.4).isNotCloseTo(4).thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotCloseThenReturnZero() {
        Integer result = iF(3.6).isNotCloseTo(4).thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
