package org.wotif.core.api;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AllOfBooleanConditionTest {

    @Test
    public void testAllOfThenReturnOne() {
        Integer result = Conditions.iFAllOf(true,true,true).isTrue().thenReturn(1).end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAllOfThenReturnZero() {
        Integer result = Conditions.iFAllOf(true,true,false).isTrue().thenReturn(1).orElseReturn(0).end();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
