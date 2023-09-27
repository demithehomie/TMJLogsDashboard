package com.dasgalaxias.logsdashboard;

public class DashboardPanel implements Observer {
    private int displayedValue;

    @Override
    public void update(int value) {
        displayedValue = value;
        display();
    }

    public void display() {
        System.out.println("Displaying value: " + displayedValue);
    }
}

