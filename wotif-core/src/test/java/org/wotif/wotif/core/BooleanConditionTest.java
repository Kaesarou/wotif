package org.wotif.wotif.core;

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

}
