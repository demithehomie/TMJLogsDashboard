package com.dasgalaxias.logsdashboard;

public class Main {
    public static void main(String[] args) {
        Metric metric = new Metric();
        DashboardPanel panel = new DashboardPanel();

        metric.registerObserver(panel);
        metric.setValue(5);
        metric.setValue(10);
    }
}

