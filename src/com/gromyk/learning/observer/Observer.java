package com.gromyk.learning.observer;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
