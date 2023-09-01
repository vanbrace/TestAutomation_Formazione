package org.example;

public class Checkout2 {
    private int runningTotal;

    public void add(int count, int price) {
        runningTotal += (count*price);
    }

    public int total() {
        return runningTotal;
    }
}