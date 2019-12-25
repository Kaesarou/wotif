package org.wotif.core.api;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BooleanConditionTest {

    @Test
    public void returnsOneWithoutExecutions() {
        boolean variableToTest = true;
        Integer result = Conditions.iF(variableToTest).isTrue().thenReturn(1).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void returnNullWithoutExecutions() {
        boolean variableToTest = false;
        Integer result = Conditions.iF(variableToTest).isTrue().thenReturn(1).end();
        Assertions.assertThat(result).isNull();
    }

    @Test
    public void orElseReturnZeroWithoutExecutions() {
        boolean variableToTest = false;
        Integer result = Conditions.iF(variableToTest).isTrue()
                .thenReturn(1)
                .orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void orElseReturnOneWithoutExecutions() {
        boolean variableToTest = true;
        Integer result = Conditions.iF(variableToTest).isTrue()
                .thenReturn(1)
                .orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifIsFalseThenReturnOne() {
        boolean variableToTest = false;
        Integer result = Conditions.iF(variableToTest).isFalse()
                .thenReturn(1).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifIsFalseThenReturnZero() {
        boolean variableToTest = false;
        Integer result = Conditions.iF(variableToTest).isFalse()
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToTrueThenReturnOne() {
        boolean variableToTest = true;
        Integer result = Conditions.iF(variableToTest).isEqualTo(true)
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToTrueThenReturnZero() {
        boolean variableToTest = true;
        Integer result = Conditions.iF(variableToTest).isEqualTo(false)
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void ifVariableIsNotEqualToTrueThenReturnZero() {
        boolean variableToTest = true;
        Integer result = Conditions.iF(variableToTest).isDifferentFrom(false)
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNullThenReturnOne() {
        Boolean variableToTest = null;
        Integer result = Conditions.iF(variableToTest).isNull()
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNotNullThenReturnOne() {
        boolean variableToTest = true;
        Integer result = Conditions.iF(variableToTest).isNotNull()
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

}
