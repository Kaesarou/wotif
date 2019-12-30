package org.wotif.core.api.strings;

import org.apache.commons.lang3.StringUtils;
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
        }).thenReturn(1).orElseExecute(() -> {
            result.set(false);
        }).orElseReturn(0).endIF();
        Assertions.assertThat(result.get()).isFalse();
        Assertions.assertThat(conditionResult).isEqualTo(0);
    }

    @Test
    public void testIfVariableDoNotContainsThenReturnOne() {
        String variable = "string";
        Integer result = iF(variable).notContains("none").thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfVariableIsEmptyThenReturnZero() {
        String variable = "string";
        Integer result = iF(variable).isEmpty().thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfVariableIsNotEmptyThenReturnOne() {
        String variable = "string";
        Integer result = iF(variable).isNotEmpty().thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
        Assertions.assertThat("r").isInstanceOf(String.class);
    }

    @Test
    public void testIfContainsIgnoringCaseThenReturnOne() {
        String variable = "string";
        Integer result = iF(variable).containsIgnoringCase("ING")
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfContainsIgnoringCaseThenReturnZero() {
        String variable = "string";
        Integer result = iF(variable).containsIgnoringCase("none")
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsEmptyThenReturnOne() {
        String variable = "";
        Integer result = iF(variable).isEmpty().thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotEmptyThenReturnZero() {
        String variable = "";
        Integer result = iF(variable).isNotEmpty().thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsBetweenThenReturnOne() {
        String variable = "string";
        Integer result = iF(variable).isBetween("startstringend", "start", "end").thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsBetweenThenReturnZero() {
        String variable = "none";
        Integer result = iF(variable).isBetween("startstringend", "start", "end").thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsBetweenIgnoringCaseThenReturnOne() {
        String variable = "strIng";
        Integer result = iF(variable).isBetweenIgnoringCase("startstringend", "START", "END").thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotBetweenThenReturnOne() {
        String variable = "string";
        Integer result = iF(variable).isNotBetween("string", "start", "end").thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotBetweenIgnoringCaseThenReturnZero() {
        String variable = "strIng";
        Integer result = iF(variable).isNotBetweenIgnoringCase("startstringend", "START", "END").thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsEqualIgnoringCaseThenReturnOne() {
        String variable = "strIng";
        Integer result = iF(variable).isEqualToIgnoringCase("string").thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsDifferentFromThenReturnZero() {
        String variable = "strIng";
        Integer result = iF(variable).isDifferentFromIgnoringCase("string").thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsBlankThenReturnOne() {
        String value = "   ";
        Integer result = iF(value).isBlank().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotBlankThenReturnOne() {
        String value = "test";
        Integer result = iF(value).isNotBlank().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsInstanceOfThenReturnOne() {
        String value = "test";
        Integer result = iF(value).isInstanceOf(String.class).thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsInstanceOfThenReturnZero() {
        String value = "test";
        Integer result = iF(value).isInstanceOf(Integer.class)
                .thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsNotInstanceOfThenReturnOne() {
        String value = "test";
        Integer result = iF(value).isNotInstanceOf(Integer.class).thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotInstanceOfThenReturnZero() {
        String value = "test";
        Integer result = iF(value).isNotInstanceOf(String.class).thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
