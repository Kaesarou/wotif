package org.wotif.core.api.strings;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.wotif.core.api.Conditions.iFAllOf;

public class AllOfStringConditionTest {

    @Test
    public void testAllOfWithContainsThenReturnOne() {
        Integer result = iFAllOf("test","test","test").contains("est")
                .thenReturn(1)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAllOfWithContainsThenReturnZero() {
        Integer result = iFAllOf("test","test","none").contains("est")
                .thenReturn(1)
                .orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testAllOfWithEqualsThenReturnOne() {
        Integer result = iFAllOf("test","test","test").isEqualTo("test")
                .thenReturn(1)
                .orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAllOfWithEqualsThenReturnZero() {
        Integer result = iFAllOf("test","test","none").isEqualTo("test")
                .thenReturn(1)
                .orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testAllOfWithIsNullThenReturnOne() {
        String string = null;
        Integer result = iFAllOf(null,null,string).isNull()
                .thenReturn(1)
                .orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testAllOfWithIsNullThenReturnZero() {
        Integer result = iFAllOf("test",null,null).isNull()
                .thenReturn(1)
                .orElseReturn(0)
                .endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
