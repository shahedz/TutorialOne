package com.broadLeaf.framework.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.broadLeaf.framework.controller.HomePageController;
import com.broadLeaf.framework.controller.RegistrationController;

public class BaseClass {
	
	protected WebDriver driver;
	protected HomePageController homePageController;
	protected RegistrationController registrationController;
	
	@BeforeClass
	public void beforeClss(){
		System.out.println("I am in beforeclass");
	}
	
	 @BeforeMethod
	    public void beforeMethod() {
//	    	ChromeOptions co = new ChromeOptions();
//	 		co.addArguments("--test-type");
//	 		DesiredCapabilities cap = DesiredCapabilities.chrome();
//			cap.setCapability(ChromeOptions.CAPABILITY, co);
//	 		
//	        Boolean isLinux = System.getProperty("os.name").equals("Linux");
//	       // System.setProperty("webdriver.chrome.driver", "../chromedriver" + (isLinux ? ".linux" : ".mac"));
//	        System.setProperty("webdriver.chrome.driver", "../chromedriver");
//	    	driver = new ChromeDriver(cap);
		 
		    driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.navigate().to("https://demo.broadleafcommerce.org/");
	        driver.manage().window().maximize();
	       System.out.println("I am in BeforeMethod");
	       homePageController = new HomePageController(driver);
	       registrationController = new RegistrationController(driver);
	       
	    }
	
//	 public HomePageController home(WebDriver driver){
//		 homePageController = new HomePageController(driver);
//		 return homePageController;
//		 
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
