package org.wotif.core.api.booleans;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.wotif.core.api.Conditions.iFAnyOf;

public class AnyOfBooleanConditionalTest {

    @Test
    public void ifAnyOfThisBooleansIsTrueReturnOne() {
        Integer result = iFAnyOf(false, true, false, false).isTrue().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifAnyOfThisBooleansIsTrueReturnOneExpectedZero() {
        Integer result = iFAnyOf(false, false, false, false).isTrue()
                .thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void orElseReturnZeroWithoutExecutionsExpectedOne() {
        Integer result = iFAnyOf(false, false, true, false).isTrue()
                .thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifIsFalseThenReturnOne() {
        Integer result = iFAnyOf(true, true, false).isFalse()
                .thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifIsFalseThenReturnOneElseZeroExpectedOne() {
        Integer result = iFAnyOf(true, true, false).isFalse()
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToTrueThenReturnOne() {
        Integer result = iFAnyOf(false, false, true).isEqualTo(true)
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsEqualToTrueThenReturnZero() {
        Integer result = iFAnyOf(true, true, true).isEqualTo(false)
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void ifVariableIsNotEqualToTrueThenReturnZero() {
        Integer result = iFAnyOf(false, false, true).isDifferentFrom(false)
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNullThenReturnOne() {
        Integer result = iFAnyOf(null, false, false).isNull()
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void ifVariableIsNotNullThenReturnOne() {
        Integer result = iFAnyOf(null, null, true).isNotNull()
                .thenReturn(1).orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

}
