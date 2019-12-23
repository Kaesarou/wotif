package org.wotif.wotif.core.condition;

public abstract class AbstractCondition<T> implements ICondition<T> {

    protected T value;

    public AbstractCondition(T value){
        this.value = value;
    }

}
