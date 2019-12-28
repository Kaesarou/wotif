package org.wotif.core.api.booleans;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import java.util.concurrent.atomic.AtomicReference;
import static org.wotif.core.api.Conditions.*;

public class BooleanConditionTest {

    @Test
    public void returnsOneWithoutExecutions() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isTrue().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void returnNullWithoutExecutions() {
        boolean variableToTest = false;
        Integer result = iF(variableToTest).isTrue().thenReturn(1).endIF();
        Assertions.assertThat(result).isNull();
    }

    @Test
    public void orElseReturnZeroWithoutExecutions() {
        boolean variableToTest = false;
        Integer result = iF(variableToTest).isTrue()
                .thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void orElseReturnOneWithoutExecutions() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isTrue()
                .thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifIsFalseThenReturnOne() {
        boolean variableToTest = false;
        Integer result = iF(variableToTest).isFalse()
                .thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifIsFalseThenReturnZero() {
        boolean variableToTest = false;
        Integer result = iF(variableToTest).isFalse()
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToTrueThenReturnOne() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isEqualTo(true)
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToTrueThenReturnZero() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isEqualTo(false)
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void ifVariableIsNotEqualToTrueThenReturnZero() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isDifferentFrom(false)
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNullThenReturnOne() {
        Boolean variableToTest = null;
        Integer result = iF(variableToTest).isNull()
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNotNullThenReturnOne() {
        boolean variableToTest = true;
        Integer result = iF(variableToTest).isNotNull()
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testTwoDifferentValuesWithIsTrueAndIsFalseThenReturnOne() {
        Integer result = iF(true).isTrue()
                .and(iF(false).isFalse())
                .thenReturn(1)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDifferentValuesWithIsTrueIsFalseOrAllOfIsTrueThenReturnOne() {
        Integer result = iF(false).isTrue()
                .and(iF(true).isFalse())
                .or(iFAllOf(true, true).isTrue())
                .thenReturn(1).orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDifferentValuesWithIsTrueIsFalseOrAllOfIsTrueThenReturnZero() {
        Integer result = iF(false).isTrue()
                .and(iF(false).isFalse())
                .or(iFAllOf(false, true).isTrue())
                .thenReturn(1).orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfVariableIsTrueThanExecuteMethod() {
        Boolean variable = true;
        AtomicReference<Boolean> result = new AtomicReference<>(false);
        iF(variable).isTrue().thenExecute(() -> {
            result.set(true);
        });
        Assertions.assertThat(result.get()).isTrue();
    }

    @Test
    public void testIfVariableIsTrueThanDoNotExecuteMethod() {
        Boolean variable = false;
        AtomicReference<Boolean> result = new AtomicReference<>(null);
        Integer conditionResult = iF(variable).isTrue().thenExecute(() -> {
            result.set(true);
        }).thenReturn(1).orElseExecute(()->{result.set(false);}).orElseReturn(0).endIF();
        Assertions.assertThat(result.get()).isFalse();
        Assertions.assertThat(conditionResult).isEqualTo(0);
    }

}
