package com.project.framework.controller;

import java.sql.Driver;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.project.framework.main.BaseClass;

public class BaseController extends BaseClass{

	
	
	public void verifyTestHelloWork(){
		
		driver = new FirefoxDriver();
		
	}
}
