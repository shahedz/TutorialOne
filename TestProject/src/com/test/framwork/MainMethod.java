package com.test.framwork;

public class MainMethod extends BMW {

	static BMW miniBMW = new BMW();
	
	public static void main(String[] args) {
		
		miniBMW.createBMWCar();
		System.out.println(miniBMW.miles());

	}

}
