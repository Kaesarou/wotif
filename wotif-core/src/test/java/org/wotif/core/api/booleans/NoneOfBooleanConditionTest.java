package org.wotif.core.api.booleans;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.wotif.core.api.Conditions.iFNoneOf;

public class NoneOfBooleanConditionTest {

    @Test
    public void testNoneOfWithIsTrueThenReturnOne() {
        Integer result = iFNoneOf(false, false, false).isTrue()
                .then(() -> 1)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNoneOfWithIsTrueThenReturnZero() {
        Integer result = iFNoneOf(true, false, false).isTrue()
                .then(() -> 1)
                .orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testNoneOfWithIsFalseThenReturnOne() {
        Integer result = iFNoneOf(true, true, true).isFalse()
                .then(() -> 1)
                .orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNoneOfWithIsFalseThenReturnZero() {
        Integer result = iFNoneOf(true, true, false).isFalse()
                .then(() -> 1)
                .orElse(() -> 0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
