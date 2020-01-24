package org.wotif.core.api.booleans;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.wotif.core.api.Conditions.iFAllOf;

public class AllOfBooleanConditionTest {

    @Test
    public void testAllOfWithIsTrueThenReturnOne() {
        Integer result = iFAllOf(true, true, true).isTrue()
                .then(() -> 1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAllOfWithIsTrueThenReturnZero() {
        Integer result = iFAllOf(true, true, false).isTrue()
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testAllOfWithIsFalseThenReturnOne() {
        Integer result = iFAllOf(false, false, false).isFalse()
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAllOfWithIsFalseThenReturnZero() {
        Integer result = iFAllOf(true, false, false).isFalse()
                .then(() -> 1).orElse(() -> 0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
