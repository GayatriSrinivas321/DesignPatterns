package com.epam.designPatterns;

public class FactoryPattern {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
        case SMALL:
            car = new SmallCar();
            break;
 
        case HATCHBACK:
            car = new  HatchbackCar();
            break;
 
        case LUXURY:
            car = new LuxuryCar();
            break;
        case SUV:
        	car = new SUVCar();
        	break;
 
        default:
            // throw some exception
            break;
        }
        return car;
    }
}