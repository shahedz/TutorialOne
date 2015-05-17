package com.aber.framework.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aber.framework.model.ClearanceModel;

public class ClearenceController extends ClearanceModel{
	protected WebDriver driver = null;
	protected ClearanceModel clearanceModel;
    protected Actions action;
	
	public ClearenceController(WebDriver driver) {
		super(driver);
		clearanceModel = new ClearanceModel(driver);
		
		action = new Actions(driver);

	}

	public ClearenceController actont3(){

		action.moveToElement(driver.findElement(By.id("util-account"))).moveToElement(driver.findElement(By.xpath("//div[@id='util-account-nav']/ul/li[2]/a[@class='util-account__link']"))).click().build().perform(); 
		return this;	
	}
	
	public void becomeAMember2(WebDriver driver) throws InterruptedException{
	 Actions action = new Actions(driver);

	 action.moveToElement(driver.findElement(By.id("util-account")));
	 Thread.sleep(5000);
	 
	 action.moveToElement(driver.findElement(By.xpath("//div[@id='util-account-nav']/ul/li[2]/a[@class='util-account__link']"))).click().build().perform(); 

	}
}