package com.epam.designPatterns;


public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("unused")
		BuildCar car = new BuildCar();
        ElectronicDevices device = new ElectronicDevices();
        Template template = new Template();
    }
}
