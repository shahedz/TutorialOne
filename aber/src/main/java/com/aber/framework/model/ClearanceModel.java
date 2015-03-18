package com.aber.framework.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClearanceModel {
	
	protected WebDriver driver = null;
	private WebElement getSignInButton;
	private WebElement getBeComeAMemberButton;
	
	
	
	public ClearanceModel(WebDriver driver){
		this.driver = driver;
	}

	public WebElement getSignInButton(){
		
		WebElement getSignInButton = driver.findElement(By.id("util-account"));
		return getSignInButton;
	}
	
	public WebElement getBeComeAMemberButton(){
		
		WebElement getBeComeAMemberButton = driver.findElement(By.id("//div[@id='util-account-nav']/ul/li[2]/a[@class='util-account__link']"));
		return getBeComeAMemberButton;
	}
}
