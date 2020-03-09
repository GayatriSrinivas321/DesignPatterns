package com.epam.designPatterns;

public class BuildCar {
	BuildCar(){
		System.out.println(FactoryPattern.buildCar(CarType.SMALL));
        System.out.println(FactoryPattern.buildCar(CarType.HATCHBACK));
        System.out.println(FactoryPattern.buildCar(CarType.SUV));
        System.out.println(FactoryPattern.buildCar(CarType.LUXURY));
	}

}
