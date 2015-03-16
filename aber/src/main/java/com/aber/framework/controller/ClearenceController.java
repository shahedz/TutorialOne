package com.aber.framework.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.aber.framework.model.ClearanceModel;

public class ClearenceController extends ClearanceModel{
	
	protected ClearanceModel clearanceModel;
	
	public ClearenceController(WebDriver driver) {
		super(driver);
		clearanceModel = new ClearanceModel(driver);
	}

	protected WebDriver driver = null;
	
	public void becomeAMember(){
		Actions action = new Actions(driver);
		 action.moveToElement(clearanceModel.getSignInButton()).moveToElement(clearanceModel.getBeComeAMemberButton()).click().build().perform(); 
	}
	
	
	
	

}
