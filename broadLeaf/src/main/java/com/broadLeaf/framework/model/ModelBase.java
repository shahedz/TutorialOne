package com.broadLeaf.framework.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModelBase {
	
	protected WebDriver driver = null;

	public ModelBase(WebDriver driver){
	
		this.driver = driver;
	}

	 public static void waitFor(WebDriver driver, By by) {
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	    } 
}
