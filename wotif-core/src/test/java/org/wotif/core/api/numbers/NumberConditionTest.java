package org.wotif.core.api.numbers;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.wotif.core.api.Conditions.iF;


public class NumberConditionTest {

    @Test
    public void testIfZeroIsPositiveThenReturnOne() {
        Integer result = iF(0).isPositive().then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfValueIsPositiveThenReturnOne() {
        Integer result = iF(1).isPositive().then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfValueIsPositiveThenReturnZero() {
        Integer result = iF(-1).isPositive().then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfValueIsNegativeThenReturnOne() {
        Integer result = iF(-1).isNegative().then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfValueIsNegativeThenReturnZero() {
        Integer result = iF(1).isNegative().then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfZeroThenReturnOne() {
        Integer result = iF(0).isZero().then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfNotZeroThenReturnOne() {
        Integer result = iF(1).isDifferentFromZero().then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfNotZeroThenReturnZero() {
        Integer result = iF(0).isDifferentFromZero().then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsLessThenReturnOne() {
        Integer result = iF(5).isLessThen(10).then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsLessThenReturnZero() {
        Integer result = iF(10).isLessThen(10).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsEqualToThenReturnOne() {
        Integer result = iF(10).isEqualTo(10).then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsDifferentFromThenReturnZero() {
        Integer result = iF(10).isDifferentFrom(10).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsGreaterThenReturnOne() {
        Integer result = iF(10).isGreaterThen(5).then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsBetween3And9ThenReturnOne() {
        Integer result = iF(5).isBetween(3, 9).then(() -> 1).endIF();
        Integer secondResult = iF(3).isBetween(3, 9).then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
        Assertions.assertThat(secondResult).isEqualTo(1);
    }

    @Test
    public void testIfIsBetween3And9ThenReturnZero() {
        Integer result = iF(11).isBetween(3, 9).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsNotBetween3And9ThenReturnOne() {
        Integer result = iF(11).isNotBetween(3, 9).then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotBetween3And9ThenReturnZero() {
        Integer result = iF(4).isNotBetween(3, 9).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsStrictlyBetween3And9ThenReturnOne() {
        Integer result = iF(5).isStrictlyBetween(3, 9).then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsStrictlyBetween3And9ThenReturnZero() {
        Integer result = iF(3).isStrictlyBetween(3, 9).then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);

    }

    @Test
    public void testIfIsCloseThenReturnOne() {
        Integer result = iF(3.6).isCloseTo(4).then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsCloseThenReturnZero() {
        Integer result = iF(3.4).isCloseTo(4).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsNotCloseThenReturnOne() {
        Integer result = iF(3.4).isNotCloseTo(4).then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotCloseThenReturnZero() {
        Integer result = iF(3.6).isNotCloseTo(4).then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfFloatIsNaNExpectedResult1() {
        AtomicReference<Integer> result = new AtomicReference<>(0);
        iF(2.0 % 0).isNaN().then(() -> result.set(1)).endIF();
        Assertions.assertThat(result.get()).isEqualTo(1);
    }

    @Test
    public void testIfFloatIsInfinitePositiveExpectedResult1() {
        AtomicReference<Integer> result = new AtomicReference<>(0);
        iF(Float.POSITIVE_INFINITY).isInfinite().then(() -> result.set(1)).endIF();
        Assertions.assertThat(result.get()).isEqualTo(1);
    }

    @Test
    public void testIfFloatIsInfiniteNegativeExpectedResult1() {
        AtomicReference<Integer> result = new AtomicReference<>(0);
        iF(Float.NEGATIVE_INFINITY).isInfinite().then(() -> result.set(1)).endIF();
        Assertions.assertThat(result.get()).isEqualTo(1);
    }

    @Test
    public void testIfFloatIsInfiniteExpectedResultNull() {
        AtomicReference<Integer> result = new AtomicReference<>(null);
        iF(Float.POSITIVE_INFINITY).isFinite().then(() -> result.set(1)).endIF();
        Assertions.assertThat(result.get()).isNull();
    }

}
