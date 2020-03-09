package com.epam.designPatterns;

public class ElectronicDevices {
	ElectronicDevices(){
	Mi s8 = new S8(new CType());
	s8.USB();

	Mi s6 = new S6(new MicroUSB());
	s6.USB();
	}
}
