package com.aber.framework.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageModel {

	protected WebDriver driver;
	private WebElement signIn_mouseOver;
	private WebElement signInButton;
	private WebElement popUpDialogBoxCloseButton;

	public WebElement popUpDialogBoxCloseButton(){
		popUpDialogBoxCloseButton = driver.findElement(By.xpath(".//*[@id='simplemodal-container']/a"));
		return popUpDialogBoxCloseButton;
	}

	public WebElement signIn_mouseOver(){
		signIn_mouseOver = driver.findElement(By.id("util-account"));
		return signIn_mouseOver;
	}

	public WebElement signInButton(){
		signInButton = driver.findElement(By.cssSelector(".util-account__link"));
		return signInButton;
	}
}