package com.aber.framework.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aber.framework.model.LandingPageModel;

public class LandingPageController extends LandingPageModel{
	
	private LandingPageModel landingPageModel;
	
	public LandingPageController(WebDriver driver){
		this.driver = driver;
		landingPageModel = new LandingPageModel();
	}
	
	public LandingPageController closeDialogBox(){
		landingPageModel.popUpDialogBoxCloseButton().click();
		return this;
	}

	public LandingPageController mouseOverToSignIn() throws InterruptedException{
		 Actions action = new Actions(driver);
		 WebElement we = landingPageModel.signIn_mouseOver();	 
		 action.moveToElement(we).build().perform();
		 landingPageModel.signInButton().click();
		 Thread.sleep(2000);
		 return this;
	}
}