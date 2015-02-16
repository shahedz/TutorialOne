package com.heatClinic.framework.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseScript {
	
	protected WebDriver driver = null;

	@BeforeClass
    public void brforeClass() {
        System.out.println("Do nothing");
    }

	 @BeforeMethod
	    public void beforeMethod() {
		 
		 	driver = new FirefoxDriver();
		 	
//	    	ChromeOptions co = new ChromeOptions();
//	 		co.addArguments("--test-type");
//	 		DesiredCapabilities cap = DesiredCapabilities.chrome();
//			cap.setCapability(ChromeOptions.CAPABILITY, co);
//	 		
//	        Boolean isLinux = System.getProperty("os.name").equals("Linux");
//	       // System.setProperty("webdriver.chrome.driver", "../chromedriver" + (isLinux ? ".linux" : ".mac"));
//	        System.setProperty("webdriver.chrome.driver", "../chromedriver");
//	    	driver = new ChromeDriver(cap);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.navigate().to("https://demo.broadleafcommerce.org/");
	        driver.manage().window().maximize();
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
