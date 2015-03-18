package com.aber.framework.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aber.framework.controller.ClearenceController;

/**
 * BaseClass 
 * @author 
 * Version 1.0
 */

public class BaseClass {
	
	protected WebDriver driver;
	protected ClearenceController clearenceController;
	
	public BaseClass(){
		System.out.println("I am in constructor");
		//Constructor has no return type
	}

	
	@BeforeClass
	public void beforeClss(){
		System.out.println("I am in beforeclass");
	}
	
	 @BeforeMethod
	    public void beforeMethod() {
		 
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.navigate().to("http://www.abercrombie.com/shop/us/mens-featured-items-clearance");
	     driver.manage().window().maximize();
	     System.out.println("I am in BeforeMethod");
	     clearenceController = new ClearenceController(driver);
	 }
	 
//	 public  ClearenceController aberCormbie(){
//		 if()
//		 return clearenceController;
//	 }
	 
	 @AfterMethod
	    public void afterMethod() {
	       driver.close();
	       driver.quit();
	       System.out.println("I am in AfterMethod");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("done");
	        System.out.println("I am in AfterClass");
	    }
}
