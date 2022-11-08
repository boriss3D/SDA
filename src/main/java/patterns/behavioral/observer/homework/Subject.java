package patterns.behavioral.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Subject extends Observer {
    private final List<Observer> observers;
    private int value;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void setValue(int value) {
        this.value = value;
        System.out.println("Master source value -> " + this.value);
    }

    public int getValue() {
        return value;
    }

    @Override
    void update() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
