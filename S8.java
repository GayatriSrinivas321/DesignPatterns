package com.epam.designPatterns;

public class S8 extends Mi{

	public S8(Charger c) {
		super(c);
	}

	public void USB() {
		System.out.print("S8 charger is ");
		charger.USB();
	} 

}