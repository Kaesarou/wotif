package org.wotif.wotif.core;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BooleanTest {

    @Test
    public void returnsWithoutExecutions() {
        Boolean statement = Conditions.whether(true).isTrue().thenReturn(true).end();
        Assertions.assertThat(statement).isTrue();

        statement = Conditions.whether(false).isTrue().thenReturn(true).end();
        Assertions.assertThat(statement).isNull();

        statement = Conditions.whether(false).isTrue()
                .thenReturn(true).orElseReturn(false).end();
        Assertions.assertThat(statement).isFalse();

        statement = Conditions.whether(true).isTrue()
                .thenReturn(true).orElseReturn(false).end();
        Assertions.assertThat(statement).isTrue();
    }




}
