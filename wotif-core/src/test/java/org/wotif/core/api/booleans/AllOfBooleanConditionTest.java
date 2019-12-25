package org.wotif.core.api.booleans;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.wotif.core.api.Conditions;

public class AllOfBooleanConditionTest {

    @Test
    public void testAllOfWithIsTrueThenReturnOne() {
        Integer result = Conditions.iFAllOf(true,true,true).isTrue()
                .thenReturn(1)
                .end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAllOfWithIsTrueThenReturnZero() {
        Integer result = Conditions.iFAllOf(true,true,false).isTrue()
                .thenReturn(1)
                .orElseReturn(0)
                .end();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testAllOfWithIsFalseThenReturnOne() {
        Integer result = Conditions.iFAllOf(false,false,false).isFalse()
                .thenReturn(1)
                .orElseReturn(0)
                .end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAllOfWithIsFalseThenReturnZero() {
        Integer result = Conditions.iFAllOf(true,false,false).isFalse()
                .thenReturn(1)
                .orElseReturn(0)
                .end();
        Assertions.assertThat(result).isEqualTo(0);
    }


}
