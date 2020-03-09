package com.epam.designPatterns;

public abstract class Mi {
	
	protected Charger charger;
	
	public Mi(Charger c){
		this.charger = c;
	}	
	
	abstract public void USB();
}