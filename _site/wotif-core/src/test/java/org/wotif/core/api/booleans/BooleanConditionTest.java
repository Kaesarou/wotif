package org.wotif.core.api.booleans;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.wotif.core.api.Conditions.iF;
import static org.wotif.core.api.Conditions.iFAllOf;

public class BooleanConditionTest {

    @Test
    public void returnsOneWithoutExecutions() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isTrue().then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void returnNullWithoutExecutions() {
        boolean variableToTest = false;
        Integer result = iF(variableToTest).isTrue().then(() -> 1).endIF();
        Assertions.assertThat(result).isNull();
    }

    @Test
    public void orElseReturnZeroWithoutExecutions() {
        boolean variableToTest = false;
        Integer result = iF(variableToTest).isTrue()
                .then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void orElseReturnOneWithoutExecutions() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isTrue()
                .then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifIsFalseThenReturnOne() {
        boolean variableToTest = false;
        Integer result = iF(variableToTest).isFalse()
                .then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifIsFalseThenReturnZero() {
        boolean variableToTest = false;
        Integer result = iF(variableToTest).isFalse()
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToTrueThenReturnOne() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isEqualTo(true)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToTrueThenReturnZero() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isEqualTo(false)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void ifVariableIsNotEqualToTrueThenReturnZero() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isDifferentFrom(false)
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNullThenReturnOne() {
        Boolean variableToTest = null;
        Integer result = iF(variableToTest).isNull()
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNotNullThenReturnOne() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isNotNull()
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testTwoDifferentValuesWithIsTrueAndIsFalseThenReturnOne() {
        Integer result = iF(true).isTrue()
                .and(iF(false).isFalse())
                .then(() -> 1)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDifferentValuesWithIsTrueIsFalseOrAllOfIsTrueThenReturnOne() {
        Integer result = iF(false).isTrue()
                .and(iF(true).isFalse())
                .or(iFAllOf(true, true).isTrue())
                .then(() -> 1).orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDifferentValuesWithIsTrueIsFalseOrAllOfIsTrueThenReturnZero() {
        Integer result = iF(false).isTrue()
                .and(iF(false).isFalse())
                .or(iFAllOf(false, true).isTrue())
                .then(() -> 1).orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfVariableIsTrueThanExecuteMethod() {
        Boolean variable = true;
        AtomicReference<Boolean> result = new AtomicReference<>(false);
        iF(variable).isTrue().then(() -> result.set(true)).endIF();
        Assertions.assertThat(result.get()).isTrue();
    }

    @Test
    public void testIfVariableIsTrueThanDoNotExecuteMethod() {
        Boolean variable = false;
        AtomicReference<Boolean> result = new AtomicReference<>(null);
        iF(variable).isTrue().then(() -> result.set(true)).orElse(() -> result.set(false)).endIF();
        Assertions.assertThat(result.get()).isFalse();
    }

}
