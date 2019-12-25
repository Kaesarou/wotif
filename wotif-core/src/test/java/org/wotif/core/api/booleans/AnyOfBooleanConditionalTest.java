package org.wotif.core.api.booleans;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.wotif.core.api.Conditions;

public class AnyOfBooleanConditionalTest {

    @Test
    public void ifAnyOfThisBooleansIsTrueReturnOne() {
        Integer result = Conditions.iFAnyOf(false, true, false, false).isTrue().thenReturn(1).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifAnyOfThisBooleansIsTrueReturnOneExpectedZero() {
        Integer result = Conditions.iFAnyOf(false, false, false, false).isTrue()
                .thenReturn(1)
                .orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void orElseReturnZeroWithoutExecutionsExpectedOne() {
        Integer result = Conditions.iFAnyOf(false, false, true, false).isTrue()
                .thenReturn(1)
                .orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifIsFalseThenReturnOne() {
        Integer result = Conditions.iFAnyOf(true, true, false).isFalse()
                .thenReturn(1).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifIsFalseThenReturnOneElseZeroExpectedOne() {
        Integer result = Conditions.iFAnyOf(true, true, false).isFalse()
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToTrueThenReturnOne() {
        Integer result = Conditions.iFAnyOf(false, false, true).isEqualTo(true)
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToTrueThenReturnZero() {
        Integer result = Conditions.iFAnyOf(true, true, true).isEqualTo(false)
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void ifVariableIsNotEqualToTrueThenReturnZero() {
        Integer result = Conditions.iFAnyOf(false,false,true).isDifferentFrom(false)
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNullThenReturnOne() {
        Integer result = Conditions.iFAnyOf(null,false,false).isNull()
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNotNullThenReturnOne() {
        Integer result = Conditions.iFAnyOf(null,null,true).isNotNull()
                .thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

}
