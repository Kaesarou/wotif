package org.wotif.core.api.numbers;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.wotif.core.api.Conditions.*;


public class NumberConditionTest {

    @Test
    public void testIfZeroIsPositiveThenReturnOne() {
        Integer result = iF(0).isPositive().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfValueIsPositiveThenReturnOne() {
        Integer result = iF(1).isPositive().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfValueIsPositiveThenReturnZero() {
        Integer result = iF(-1).isPositive().thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testIfValueIsNegativeThenReturnOne() {
        Integer result = iF(-1).isNegative().thenReturn(1).endIF();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testIfValueIsNegativeThenReturnZero() {
        Integer result = iF(1).isNegative().thenReturn(1)
                .orElseReturn(0).endIF();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
