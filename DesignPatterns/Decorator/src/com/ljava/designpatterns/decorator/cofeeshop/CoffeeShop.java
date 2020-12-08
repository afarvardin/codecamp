package com.ljava.designpatterns.decorator.cofeeshop;

public class CoffeeShop {

    public static void main(String[] args) {

        HouseBlend houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + ": " + houseBlend.cost());

        Milk milkAddOn = new Milk(houseBlend);
        System.out.println(milkAddOn.getDescription() + ": " + milkAddOn.cost());

        Sugar sugarAddOn = new Sugar(milkAddOn);
        System.out.println(sugarAddOn.getDescription() + ": " + sugarAddOn.cost());

        System.out.println("---------");

        DarkRosted darkRosted = new DarkRosted();
        System.out.println(darkRosted.getDescription() + " :" + darkRosted.cost());

        milkAddOn = new Milk(darkRosted);
        sugarAddOn = new Sugar(milkAddOn);

        System.out.println(milkAddOn.getDescription() + " :" + milkAddOn.cost());
        System.out.println(sugarAddOn.getDescription() + " :" + sugarAddOn.cost());

    }

}
