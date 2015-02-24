package com.broadLeaf.framework.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.broadLeaf.framework.model.HomePageModel;

public class HomePageController extends ControllerBase {
	
	 HomePageModel homePageModel;

	public HomePageController(WebDriver driver) {
		super(driver);
		homePageModel = PageFactory.initElements(driver, HomePageModel.class);

	}
	
	public void chooseFirstHotSauce(){
		homePageModel.gethotSauceItemOne().click();
	}
	
	public void verifyHotSauceIsSelected(){
		
	}
}
