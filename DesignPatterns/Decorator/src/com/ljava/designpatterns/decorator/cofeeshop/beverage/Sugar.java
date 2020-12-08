package com.ljava.designpatterns.decorator.cofeeshop.beverage;

import com.ljava.designpatterns.decorator.cofeeshop.beverage.AddOn;
import com.ljava.designpatterns.decorator.cofeeshop.beverage.Beverage;

public class Sugar extends AddOn {

    public Sugar(Beverage bev){
        super("Sugar", bev);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
