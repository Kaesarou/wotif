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
        Integer result = iF(variableToTest).contains("ing").then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void returnNullWithoutExecutions() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).contains("none").then(() -> 1).endIF();
        Assertions.assertThat(result).isNull();
    }

    @Test
    public void orElseReturnZeroWithoutExecutions() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).contains("none")
                .then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void orElseReturnOneWithoutExecutions() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).contains("ing")
                .then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToStringThenReturnOne() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).isEqualTo("string")
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToStringThenReturnZero() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).isEqualTo("none")
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void ifVariableIsNullThenReturnOne() {
        String variableToTest = null;
        Integer result = iF(variableToTest).isNull()
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNotNullThenReturnOne() {
        String variableToTest = "string";
        Integer result = iF(variableToTest).isNotNull()
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testTwoDifferentValuesWithIsEqualAndContainsThenReturnOne() {
        Integer result = iF("string").isEqualTo("string")
                .and(iF("none").contains("on"))
                .then(() -> 1)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDifferentValuesWithIsEqualContainsOrAllOfContainsThenReturnOne() {
        Integer result = iF("string").isEqualTo("string")
                .and(iF("string").contains("none"))
                .or(iFAllOf("string", "string").contains("ing"))
                .then(() -> 1).orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDifferentValuesWithIsEqualContainsOrAllOfContainsThenReturnZero() {
        Integer result = iF("string").isEqualTo("string")
                .and(iF("string").contains("none"))
                .or(iFAllOf("none", "string").contains("ing"))
                .then(() -> 1).orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfVariableContainsThanExecuteMethod() {
        String variable = "string";
        AtomicReference<Boolean> result = new AtomicReference<>(false);
        iF(variable).contains("ing").then(() -> { result.set(true); }).endIF();
        Assertions.assertThat(result.get()).isTrue();
    }

    @Test
    public void testIfVariableContainsThanDoNotExecuteMethod() {
        String variable = "string";
        AtomicReference<Boolean> result = new AtomicReference<>(null);
        Integer conditionResult = iF(variable).contains("none").then(() -> { result.set(true); return 1; })
                .orElse(() -> { result.set(false); return 0; }).endIF();
        Assertions.assertThat(result.get()).isFalse();
        Assertions.assertThat(conditionResult).isEqualTo(0);
    }

    @Test
    public void testIfVariableDoNotContainsThenReturnOne() {
        String variable = "string";
        Integer result = iF(variable).notContains("none").then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfVariableIsEmptyThenReturnZero() {
        String variable = "string";
        Integer result = iF(variable).isEmpty().then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfVariableIsNotEmptyThenReturnOne() {
        String variable = "string";
        Integer result = iF(variable).isNotEmpty().then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
        Assertions.assertThat("r").isInstanceOf(String.class);
    }

    @Test
    public void testIfContainsIgnoringCaseThenReturnOne() {
        String variable = "string";
        Integer result = iF(variable).containsIgnoringCase("ING")
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfContainsIgnoringCaseThenReturnZero() {
        String variable = "string";
        Integer result = iF(variable).containsIgnoringCase("none")
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsEmptyThenReturnOne() {
        String variable = "";
        Integer result = iF(variable).isEmpty().then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotEmptyThenReturnZero() {
        String variable = "";
        Integer result = iF(variable).isNotEmpty().then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsBetweenThenReturnOne() {
        String variable = "string";
        Integer result = iF(variable).isContainedInSubstring("startstringend", "start", "end")
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsBetweenThenReturnZero() {
        String variable = "none";
        Integer result = iF(variable).isContainedInSubstring("startstringend", "start", "end")
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsBetweenIgnoringCaseThenReturnOne() {
        String variable = "strIng";
        Integer result = iF(variable).isContainedInSubstringIgnoreCase("startstringend", "START", "END")
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotBetweenThenReturnOne() {
        String variable = "string";
        Integer result = iF(variable).isNotContainedInSubstring("string", "start", "end")
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotBetweenIgnoringCaseThenReturnZero() {
        String variable = "strIng";
        Integer result = iF(variable).isNotContainedInSubstringIgnoreCase("startstringend", "START", "END")
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsEqualIgnoringCaseThenReturnOne() {
        String variable = "strIng";
        Integer result = iF(variable).isEqualToIgnoringCase("string").then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsDifferentFromThenReturnZero() {
        String variable = "strIng";
        Integer result = iF(variable).isDifferentFromIgnoringCase("string").then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsBlankThenReturnOne() {
        String value = "   ";
        Integer result = iF(value).isBlank().then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotBlankThenReturnOne() {
        String value = "test";
        Integer result = iF(value).isNotBlank().then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsInstanceOfThenReturnOne() {
        String value = "test";
        Integer result = iF(value).isInstanceOf(String.class).then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsInstanceOfThenReturnZero() {
        String value = "test";
        Integer result = iF(value).isInstanceOf(Integer.class)
                .then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfIsNotInstanceOfThenReturnOne() {
        String value = "test";
        Integer result = iF(value).isNotInstanceOf(Integer.class).then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfIsNotInstanceOfThenReturnZero() {
        String value = "test";
        Integer result = iF(value).isNotInstanceOf(String.class).then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfContainedInThenReturnOne() {
        String value = "test";
        Integer result = iF(value).isContainedIn("abctestabc").then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfContainedInThenReturnZero() {
        String value = "test";
        Integer result = iF(value).isContainedIn("abcabc").then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfContainedInIgnoreCaseThenReturnOne() {
        String value = "TEST";
        Integer result = iF(value).isContainedInIgnoreCase("abctestabc").then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfContainedInIgnoreCaseThenReturnZero() {
        String value = "test";
        Integer result = iF(value).isContainedInIgnoreCase("abcabc").then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfNotContainedInThenReturnOne() {
        String value = "test";
        Integer result = iF(value).isNotContainedIn("abcabc").then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfNotContainedInThenReturnZero() {
        String value = "test";
        Integer result = iF(value).isNotContainedIn("abctestabc").then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfNotContainedInIgnoreCaseThenReturnOne() {
        String value = "TEST";
        Integer result = iF(value).isNotContainedInIgnoreCase("abcabc").then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfNotContainedInIgnoreCaseThenReturnZero() {
        String value = "test";
        Integer result = iF(value).isNotContainedInIgnoreCase("abcTESTabc").then(() -> 1)
                .orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testOrElseTestWithExpectedReturn1() {
        Integer result = iF("montest").isEqualTo("montest")
                .then(() -> 1).orElse(iF("mo").contains("o"), () -> 2)
                .orElse(() -> 3).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testOrElseTestWithExpectedReturn2() {
        Integer result = iF("montest").isEqualTo("test")
                .then(() -> 1).orElse(iF("mo").contains("o"), () -> 2)
                .orElse(() -> 3).endIF();
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void testOrElseTestWithExpectedReturn3() {
        Integer result = iF("montest").isEqualTo("test")
                .then(() -> 1).orElse(iF("mo").contains("ing"), () -> 2)
                .orElse(() -> 3).endIF();
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void testOrElseWithCallbackThenReturn1() {
        AtomicReference<Integer> result = new AtomicReference<>(0);
        iF("monTest").contains("ing").then(() -> result.set(1))
                .orElse(iF("monTest").isEqualTo("monTest").and(iF("A").isEmpty()), () -> result.set(2))
                .orElse(iF("monTest").isEqualTo("monTest").and(iF("A").isNotEmpty()), () -> result.set(3))
                .endIF();
        Assertions.assertThat(result.get()).isEqualTo(3);
    }

    @Test
    public void testOrElseWithCallbackThenReturn0() {
        AtomicReference<Integer> result = new AtomicReference<>(0);
        iF("monTest").contains("ing").then(() -> result.set(1))
                .orElse(iF("monTest").isEqualTo("monTest").and(iF("A").isEmpty()), () -> result.set(2))
                .orElse(iF("monTest").isEqualTo("monTest").and(iF("").isNotEmpty()), () -> result.set(3))
                .endIF();
        Assertions.assertThat(result.get()).isEqualTo(0);
    }

    @Test
    public void testOrElseWithCallbackThenReturn2() {
        AtomicReference<Integer> result = new AtomicReference<>(0);
        iF("monTest").contains("ing").then(() -> result.set(1))
                .orElse(iF("monTest").isEqualTo("monTest").and(iF("").isEmpty()), () -> result.set(2))
                .orElse(iF("monTest").isEqualTo("monTest").and(iF("").isNotEmpty()), () -> result.set(3))
                .endIF();
        Assertions.assertThat(result.get()).isEqualTo(2);
    }

}
