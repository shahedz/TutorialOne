package com.broadLeaf.framework.controller;

import org.openqa.selenium.WebDriver;

public class ControllerBase {
	
	protected WebDriver driver = null;
	
	public ControllerBase(WebDriver driver){
		this.driver = driver;
	}
}
