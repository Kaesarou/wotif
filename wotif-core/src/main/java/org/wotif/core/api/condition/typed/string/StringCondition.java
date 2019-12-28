package org.wotif.core.api.condition.typed.string;

import org.wotif.core.api.CompletableResult;

public class StringCondition extends AbstractStringCondition {

    public StringCondition(String term) { super(term); }

    @Override
    public CompletableResult contains(String contains) {
        boolean value = this.term.value().contains(contains);
        return new CompletableResult(value);
    }

}
