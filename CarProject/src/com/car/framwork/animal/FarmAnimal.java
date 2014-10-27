package com.car.framwork.animal;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FarmAnimal {
	
	public void chicken(){
		System.out.println("chicken lays egg and we can sell it for: ");
	}

	public int eggPrice(){
		int x = 2;
		int b = 100;
		int totalPrice = x+b;
		return totalPrice;
	}
	
	public static void main(String[] arg){
		
		FarmAnimal animanInstance = new FarmAnimal();
		animanInstance.chicken();
		
		System.out.println("$"+animanInstance.eggPrice());
	}
}
