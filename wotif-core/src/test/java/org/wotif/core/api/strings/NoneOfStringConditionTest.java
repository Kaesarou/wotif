package org.wotif.core.api.strings;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.wotif.core.api.Conditions.iFNoneOf;

public class NoneOfStringConditionTest {

    @Test
    public void testNoneOfWithContainsThenReturnOne() {
        Integer result = iFNoneOf("none", "none", "none").contains("est")
                .then(() -> 1)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNoneOfWithContainsThenReturnZero() {
        Integer result = iFNoneOf("test", "none", "none").contains("est")
                .then(() -> 1)
                .orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testNoneOfWithEqualsThenReturnOne() {
        Integer result = iFNoneOf("none", "none", "none").isEqualTo("test")
                .then(() -> 1)
                .orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNoneOfWithEqualsThenReturnZero() {
        Integer result = iFNoneOf("test", "none", "none").isEqualTo("test")
                .then(() -> 1)
                .orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testNoneOfWithIsNullThenReturnOne() {
        Integer result = iFNoneOf("string", "string", "string").isNull()
                .then(() -> 1)
                .orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNoneOfWithIsNullThenReturnZero() {
        Integer result = iFNoneOf(null, "string", "string").isNull()
                .then(() -> 1)
                .orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
