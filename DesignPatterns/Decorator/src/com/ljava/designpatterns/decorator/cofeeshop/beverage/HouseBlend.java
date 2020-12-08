package com.ljava.designpatterns.decorator.cofeeshop.beverage;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        super("House blend Coffee");
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
