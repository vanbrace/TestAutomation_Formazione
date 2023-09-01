package org.example;

public class Checkout4 {
    private int total;

    public void add(int amount, int price) {
        total += (amount*price);
    }

    public int getTotal(){
        return total;
    }
}

