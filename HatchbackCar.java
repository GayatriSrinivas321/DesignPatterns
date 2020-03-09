package com.epam.designPatterns;

public class HatchbackCar extends Car {
	 
	HatchbackCar() {
        super(CarType.HATCHBACK);
        construct();
    }

    protected void construct() {
        System.out.println("Building HatchBack car");
        // add accessories
    }
}
