package com.test.framwork;

public class BMW extends Car {

	//Instance variable
	Car car = new Car();

	public void createBMWCar(){
		car.addDoors();
		car.addWheels();
		car.startEngine();
		car.stopEngine();
	}
	
	//return method
	public int miles(){
		int showMile = 300;
		return showMile;
	}
}
