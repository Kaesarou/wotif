package org.wotif.wotif.core;

public abstract class AbstractConditionalState<T> implements IConditionalState<T> {

    protected T value;

    AbstractConditionalState(T value){
        this.value = value;
    }

}
