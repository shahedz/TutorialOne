package com.google.gmail;

public class LearnClass {
	
	/**
	 * Class level variable
	 * @param args
	 */
	
	//private MyAccount myAccount;
	//instance variable 
	private static MyAccount myAccount;
	
	protected int savingAccount; // Subclass, class, package
	private String myCheckingAccount;
	public int banlBalance1;
	public double savingBalance;
	public double grayHound; // You can access every where 
	private boolean value;
	private boolean valueTrue = true; //Only accessible in the class 
	protected boolean valueTrueProtected = true;
	public final static int MYVALUE = 50000; //Constant 
	String myAccountNmae; //Class and package only
	
	public LearnClass(){
	//	myAccount = new MyAccount();
		System.out.println("this is a constructor for LearnClass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myAccount  = new MyAccount();
		myAccount.showMyTotalbalance();
//		showMyTotalbalance();
	}

}
