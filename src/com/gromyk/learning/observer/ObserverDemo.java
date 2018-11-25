package com.gromyk.learning.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new StateObserver("first observer", subject);
        new StateObserver("second observer", subject);
        new StateObserver("third observer", subject);

        new Thread(() -> {
            int i = 0;
            while (i < 100) {
                subject.setState(i);
                i++;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).run();
    }
}
