package com.test.framwork;

public class ReviewClassVoidMethod {

	public int num = 2;
	private int myNuv = 4;
	protected int mySaving = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3;
		modifyValue(i);
		System.out.println(i);
	}
	
	
	public void savingAccout(){
		System.out.println("I have 10 dollars");
	}
	
	private static void modifyValue(int number) {
		  number += 1;
		}
	
	
	

}
