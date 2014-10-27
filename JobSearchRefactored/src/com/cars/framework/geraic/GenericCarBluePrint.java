package com.cars.framework.geraic;

public class GenericCarBluePrint {

	private static int r = 200; // Class level variable 

	/*
	 * This is a main void method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returnMilage();
		stopCar();
		System.out.println(returnMilage()); 
	}

	/*
	 * This is a void method
	 */
	public void startCar(){
		System.out.println("My Engine is being started");
	}

	/*
	 * This is a void method
	 */
	public static void stopCar(){
		System.out.println("My Engine is being stoped");
		
		int x = 4; // method level variable 
		int y = 6;
		int i = x+y;
		System.out.println(i);
	}
	 
	/*
	 * This is a void method
	 */
	public void driverCar(){
		System.out.println("I am driving");
	}

	/*
	 * This is a return method
	 */
	public static int returnMilage(){
		int x = 400;
		return x+r;
	}

	/*
	 * This is a return method
	 */
	public int showTotalMilage(){
		return r;
	}
}
