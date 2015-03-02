package com.broadLeaf.framework.test;

import org.testng.annotations.Test;

import com.broadLeaf.framework.main.BaseClass;

public class RegistrationTest extends BaseClass{
	
	
	@Test
	public void verifyThatUserCanSetEmailAddress() throws InterruptedException{
		
		homePageController.navigateToRegistrationPage();
		registrationController.setEmailAddress();
		Thread.sleep(2000);
		
	}

}