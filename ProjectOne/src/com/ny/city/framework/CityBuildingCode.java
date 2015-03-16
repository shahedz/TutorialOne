package com.ny.city.framework;

public class CityBuildingCode {
	
	public String publicTest = "My cityTest";
	private static long myAccountNumber = 23477799999788788L;
	protected static int mySaviigAccount = 898;

	public void showMyName(){

		String xy = getMyName();
		System.out.println(xy);
	}

	public String getMyName(){
		
		return publicTest;
	}
	
	public void protectedTest(long someAccount){
		int g = 56;
		long y = g+someAccount;
		System.out.println(y);
	}
	
	
	public long returnMyCheckingAccount(){
		long y = myAccountNumber + 100;
		return y;
	}
	
}