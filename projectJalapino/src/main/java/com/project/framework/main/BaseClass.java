package com.project.framework.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	
	protected WebDriver driver = null;
//	private WebDriver driver1 = null;
//	WebDriver driver2 = null;
//	public WebDriver driver3 = null;
	

    @BeforeClass
    public void brforeClass() {
        System.out.println("Do nothing");
    }

	 @BeforeMethod
	    public void beforeMethod() {
	    	ChromeOptions co = new ChromeOptions();
	 		co.addArguments("--test-type");
	 		DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(ChromeOptions.CAPABILITY, co);
	 		
	        Boolean isLinux = System.getProperty("os.name").equals("Linux");
	       // System.setProperty("webdriver.chrome.driver", "../chromedriver" + (isLinux ? ".linux" : ".mac"));
	        System.setProperty("webdriver.chrome.driver", "../chromedriver");
	    	driver = new ChromeDriver(cap);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.navigate().to("https://demo.broadleafcommerce.org/");
	        driver.manage().window().maximize();
	    }
	 
	 	@Test
	 	public void testOne(){
	 		
	 		System.out.println("run");
	 		
	 	}
	 	
	 	public void verifyLink(){
	 		
	 		
	 	}
	 	
	 	
	 	
	 	
	 	
	 	

	    @AfterMethod
	    public void afterMethod() {
	       driver.close();
	       driver.quit();
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("done");
	    }
}
