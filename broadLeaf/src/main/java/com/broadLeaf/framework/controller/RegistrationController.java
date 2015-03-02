package com.broadLeaf.framework.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.broadLeaf.framework.model.HomePageModel;
import com.broadLeaf.framework.model.RegisterModel;

public class RegistrationController extends HomePageController{
	
	private RegisterModel registerModel;

	public RegistrationController(WebDriver driver) {
		super(driver);
		registerModel = PageFactory.initElements(driver, RegisterModel.class);
	}
	
	
	public void setEmailAddress(){
		registerModel.getEmailTextBoxElement().sendKeys("Adel@gmail.com");
	}
	

}
