package com.epam.designPatterns;

public class IndustrialRobot extends RobotTemplate{

	@Override
	public void brainSystem() {
		System.out.println("\tBrain : not incoperated");
	}

	@Override
	public void muscleSystem() {
		System.out.println("\tMuscle : Machine working");
	}

	@Override
	public void sensorySystem() {
		System.out.println("\tSensors : Receiving information");
	}

}
