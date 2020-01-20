package org.wotif.core.api.strings;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.wotif.core.api.Conditions.iFAnyOf;

public class AnyOfStringConditionalTest {

    @Test
    public void testAnyOfWithContainsThenReturnOne() {
        Integer result = iFAnyOf("test", "none", "none").contains("est")
                .thenReturn(1)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAnyOfWithContainsThenReturnZero() {
        Integer result = iFAnyOf("none", "none", "none").contains("est")
                .thenReturn(1)
                .orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testAnyOfWithEqualsThenReturnOne() {
        Integer result = iFAnyOf("test", "none", "none").isEqualTo("test")
                .thenReturn(1)
                .orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAnyOfWithEqualsThenReturnZero() {
        Integer result = iFAnyOf("none", "none", "none").isEqualTo("test")
                .thenReturn(1)
                .orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testAnyOfWithIsNullThenReturnOne() {
        Integer result = iFAnyOf(null, "string", "string").isNull()
                .thenReturn(1)
                .orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAnyOfWithIsNullThenReturnZero() {
        Integer result = iFAnyOf("string", "string", "string").isNull()
                .thenReturn(1)
                .orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
