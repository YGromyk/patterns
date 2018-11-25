package com.gromyk.learning.observer;

public class StateObserver extends Observer {
    private String observerName;

    StateObserver(String observerName, Subject subject) {
        this.observerName = observerName;
        this.subject = subject;
        this.subject.subscribe(this);
    }


    @Override
    void update() {
        System.out.println(observerName + ": received value -> " + subject.getState());
    }
}
