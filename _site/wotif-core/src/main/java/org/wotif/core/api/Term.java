package org.wotif.core.api;

public class Term <TYPE> {

    TYPE value;

    public Term(TYPE term) { this.value = term; }

    public TYPE value() { return this.value; }

}
