package com.epam.designPatterns;

public class S6 extends Mi{

	public S6(Charger c) {
		super(c);
	}

	public void USB() {
		System.out.print("S6 charger is ");
		charger.USB();
	} 
	
}