package org.wotif.core.api.booleans;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.wotif.core.api.Conditions;

public class NoneOfBooleanConditionTest {

    @Test
    public void testNoneOfWithIsTrueThenReturnOne() {
        Integer result = Conditions.iFNoneOf(false,false,false).isTrue()
                .thenReturn(1)
                .end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNoneOfWithIsTrueThenReturnZero() {
        Integer result = Conditions.iFNoneOf(true,false,false).isTrue()
                .thenReturn(1)
                .orElseReturn(0)
                .end();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testNoneOfWithIsFalseThenReturnOne() {
        Integer result = Conditions.iFNoneOf(true,true,true).isFalse()
                .thenReturn(1)
                .orElseReturn(0)
                .end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNoneOfWithIsFalseThenReturnZero() {
        Integer result = Conditions.iFNoneOf(true,true,false).isFalse()
                .thenReturn(1)
                .orElseReturn(0)
                .end();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
