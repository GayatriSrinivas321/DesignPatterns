package com.epam.designPatterns;

public class Template {
	Template(){
	RobotTemplate robotType = new HumanoidRobot();

	System.out.println("HUMANOID ROBOT");
	robotType.Robot();
	System.out.println();
	System.out.println("INDUSTRIAL ROBOT");
	robotType = new IndustrialRobot();
	robotType.Robot();
	}
}
