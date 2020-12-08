package com.ljava.designpatterns.decorator.cofeeshop.beverage;

import com.ljava.designpatterns.decorator.cofeeshop.beverage.Beverage;

public abstract class AddOn extends Beverage {
    protected Beverage beverage;

    public AddOn(String Description, Beverage bev){
        super(Description);
        this.beverage = bev;
    }

    public abstract String getDescription();
}
