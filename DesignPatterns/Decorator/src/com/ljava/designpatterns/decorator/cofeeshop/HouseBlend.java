package com.ljava.designpatterns.decorator.cofeeshop;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        super("House blend Coffee");
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
