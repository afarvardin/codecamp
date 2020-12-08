package com.ljava.designpatterns.decorator.cofeeshop;

public abstract class AddOn extends Beverage {
    protected Beverage beverage;

    public AddOn(String Description, Beverage bev){
        super(Description);
        this.beverage = bev;
    }

    public abstract String getDescription();
}
