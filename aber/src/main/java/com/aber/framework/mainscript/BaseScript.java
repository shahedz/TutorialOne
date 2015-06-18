package com.aber.framework.mainscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aber.framework.controller.LandingPageController;

public class BaseScript {
	
	protected WebDriver driver = null;
	protected LandingPageController landingPageController;
	
	 @BeforeClass
	    public void brforeClass() {
	        System.out.println("Do nothing");
	    }

	 @BeforeMethod
	    public void beforeMethod() {
		 
		// driver = new FirefoxDriver();
		 
		 ChromeOptions co = new ChromeOptions();
	 		co.addArguments("--test-type");
	 		DesiredCapabilities cap = DesiredCapabilities.chrome();
			// cap.setCapability(CapabilityType.PROXY, p);
			cap.setCapability(ChromeOptions.CAPABILITY, co);
	 		
	        Boolean isLinux = System.getProperty("os.name").equals("Linux");

	        //driver = new FirefoxDriver();
	        //System.setProperty("webdriver.chrome.driver", "./assets/chromedriver" + (isLinux ? ".linux" : ".mac"));
	        System.setProperty("webdriver.chrome.driver", "../chromedriver");
	      
	    	driver = new ChromeDriver(cap);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://www.abercrombie.com/shop/us");
		 driver.manage().window().maximize();
		 landingPageController = new LandingPageController(driver);
	 }
	 
	 @AfterMethod
	    public void afterMethod() {
		 
	 }
	 
	 @AfterClass
	    public void afterClass() {
	        System.out.println("Do nothing");
	        driver.close();
	        driver.quit();
	    }
}