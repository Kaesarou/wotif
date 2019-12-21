package org.wotif.wotif.core;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BooleanTest {

    @Test
    public void returnTrueWithoutExecutions() {
        Boolean statement = ConditionalStatement.whether(true).isTrue().thenReturn(true);
        Assertions.assertThat(statement).isTrue();
    }

    @Test
    public void returnFalseWithoutExecutions() {
        Boolean statement = ConditionalStatement.whether(false).isTrue().thenReturn(true);
        Assertions.assertThat(statement).isNull();
    }

}
