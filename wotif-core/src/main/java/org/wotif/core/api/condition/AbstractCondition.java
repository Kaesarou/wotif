package org.wotif.core.api.condition;

public abstract class AbstractCondition<T> implements ICondition<T> {

    protected T value;

    public AbstractCondition(T value){
        this.value = value;
    }

}
