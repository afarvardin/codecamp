package com.ljava.designpatterns.decorator.cofeeshop;

public abstract class Beverage {
    private String description;

    public Beverage(String description){
        super();
        this.description = description;
    }

    public String getDescription(){
        return  this.description;
    }

    public abstract double cost();
}
