package com.google.gmail;

public class MyAccount extends LearnClass {
	
	//Constructor
	public MyAccount(){
		System.out.println("this is a constructor for MyAccount");
	}
	
	//Void method
	public double usDoller(){
		int t = 5000;
		double u = 2000.2;
		double y = t+u;
		
		System.out.println("This is my usDollar: "+y);
		return y;
	}
	
	public void showMyTotalbalance(){
		double totalAmount = usDoller() + convertToDoolar(9000);
		System.out.println("My total amount is: "+ totalAmount);
	}

	//Return mathod
	public double convertToDoolar(int SavingAccountinTaka){
		
		double dollarAmount = 77.30* SavingAccountinTaka;
		return dollarAmount;
	}

	public boolean test3(){
		return valueTrueProtected;
	}
	

}
