package com.ljava.designpatterns.decorator.cofeeshop;

public class Milk extends AddOn {

    public Milk(Beverage bev){
        super("Milk", bev);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1;
    }
}
