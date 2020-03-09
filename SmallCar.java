package com.epam.designPatterns;

public class SmallCar extends Car {
	 
    SmallCar() {
        super(CarType.SMALL);
        construct();
    }
 
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}

