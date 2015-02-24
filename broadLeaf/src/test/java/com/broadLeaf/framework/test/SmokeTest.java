package com.broadLeaf.framework.test;

import org.testng.annotations.Test;

import com.broadLeaf.framework.main.BaseClass;

public class SmokeTest extends BaseClass{

	@Test
	public void myFirstTest(){
		System.out.println("I am in test");
		homePageController.chooseFirstHotSauce();
	}
}
