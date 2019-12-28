package org.wotif.core.api.strings;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.wotif.core.api.Conditions.iF;
import static org.wotif.core.api.Conditions.iFAllOf;

public class StringConditionTest {

    @Test
    public void returnsOneWithoutExecutions() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).contains("ing").thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void returnNullWithoutExecutions() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).contains("none").thenReturn(1).endIF();
        Assertions.assertThat(result).isNull();
    }

    @Test
    public void orElseReturnZeroWithoutExecutions() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).contains("none")
                .thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void orElseReturnOneWithoutExecutions() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).contains("ing")
                .thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToStringThenReturnOne() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).isEqualTo("string")
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToStringThenReturnZero() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).isEqualTo("none")
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void ifVariableIsNullThenReturnOne() {
        String variableToTest = null;
        Integer result = iF(variableToTest).isNull()
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNotNullThenReturnOne() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).isNotNull()
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testTwoDifferentValuesWithIsEqualAndContainsThenReturnOne() {
        Integer result = iF("string").isEqualTo("string")
                .and(iF("none").contains("on"))
                .thenReturn(1)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDifferentValuesWithIsEqualContainsOrAllOfContainsThenReturnOne() {
        Integer result = iF("string").isEqualTo("string")
                .and(iF("string").contains("none"))
                .or(iFAllOf("string", "string").contains("ing"))
                .thenReturn(1).orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDifferentValuesWithIsEqualContainsOrAllOfContainsThenReturnZero() {
        Integer result = iF("string").isEqualTo("string")
                .and(iF("string").contains("none"))
                .or(iFAllOf("none", "string").contains("ing"))
                .thenReturn(1).orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfVariableContainsThanExecuteMethod() {
        String variable = "string";
        AtomicReference<Boolean> result = new AtomicReference<>(false);
        iF(variable).contains("ing").thenExecute(() -> {
            result.set(true);
        });
        Assertions.assertThat(result.get()).isTrue();
    }

    @Test
    public void testIfVariableContainsThanDoNotExecuteMethod() {
        String variable = "string";
        AtomicReference<Boolean> result = new AtomicReference<>(null);
        Integer conditionResult = iF(variable).contains("none").thenExecute(() -> {
            result.set(true);
        }).thenReturn(1).orElseExecute(()->{result.set(false);}).orElseReturn(0).endIF();
        Assertions.assertThat(result.get()).isFalse();
        Assertions.assertThat(conditionResult).isEqualTo(0);
    }

}
