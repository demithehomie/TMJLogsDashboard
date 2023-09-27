package com.dasgalaxias.logsdashboard;

import java.util.ArrayList;
import java.util.List;

public class Metric implements Subject {
    private List<Observer> observers;
    private int value;

    public Metric() {
        observers = new ArrayList<>();
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    public int getValue() {
        return value;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(value);
        }
    }
}

