package com.ny.state.framework;

import com.ny.city.framework.CityBuildingCode;

public class StateBuildingCode extends CityBuildingCode{

	// void main method runs your test
	
	static CityBuildingCode city = new CityBuildingCode();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Array states: "+returnAllStates());
//		
//		for(String x : returnAllStates()) System.out.println("Each status:"+x);
//		
//
//		System.out.println(showMeTheMoney(4000));
//		
//		int u = showMeTheMoney(777);
//		
//		System.out.println(u);
//		
		city.showMyName();
		city.getMyName();
		//System.out.println(myAccountNumber);
		//city.protectedTest(myAccountNumber);
		city.protectedTest(mySaviigAccount);
		long show = city.returnMyCheckingAccount();
		System.out.println(show);
		
	}

	/*
	 * Ther are two types of Method:
	 * 1. Void method
	 * and 2. Return method
	 */
	
	
	public static void getAllTheStatesName(){
		
		System.out.println();
		
		
	}

	
	public static String[] returnAllStates(){
		
		String[] states = {"NY", "NJ", "CA", "Tx"};
		
		return states;
	}
	
	//Rturn method - return taka
	public static int showMeTheMoney(int newTaka){
	
	int taka = 0;
	
	int value = taka + newTaka + 100;
	return value;
	
	}
	

}
