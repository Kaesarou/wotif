package org.wotif.core.api.condition.typed.iterables.arrays;

import org.wotif.core.api.condition.typed.iterables.AbstractIterableCondition;
import org.wotif.core.api.condition.typed.iterables.IIterableCondition;

import java.util.ArrayList;
import java.util.List;

public class CharArraysCondition extends AbstractIterableCondition<Character, char[]>
        implements IIterableCondition<Character, char[]> {

    public CharArraysCondition(char[] term) {
        super(term);
    }

    @Override
    protected Iterable<Character> iterable() {
        List<Character> chars = new ArrayList<>();
        for (char c : this.term.value()) {
            chars.add(c);
        }
        return chars;
    }

}
