package com.ljava.designpatterns.decorator.cofeeshop;

public class DarkRosted extends Beverage {
    public DarkRosted(){
        super("Dark roast Coffee");
    }

    @Override
    public double cost() {
        return 3;
    }
}
