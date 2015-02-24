package com.heatClinic.framework.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.heatClinic.framework.main.BaseScript;

public class BaseController extends BaseScript {
	
	
	
	//private WebElement hotSauce;
	
//	public WebElement hotSauce(){
//		hotSauce = driver.findElement(By.xpath("//div[@id='content']/nav/ul/li[2]/a"));
//		return hotSauce;
//	}

	 public BaseController(WebDriver driver) {
	        super();
	        PageFactory.initElements(driver, BaseScript.class);
	    }
//
//	 @FindBy(xpath = "//div[@id='content']/nav/ul/li[2]/a") WebElement hotSauce;
//	 public void hotSauceLinkVerificaiton(){
//		 String link = hotSauce.getText();
//			Assert.assertEquals(link, "HOT SAUCES"); 
//			hotSauce.click();
//			
//			String title = driver.getTitle();
//			Assert.assertEquals(title, "Broadleaf Commerce Demo Store - Heat Clinic - Hot Sauces");
//			System.out.println("All worked");
//	 }
	 @FindBy(how = How.XPATH, using = "//div[@id='content']/nav/ul/li[2]/a")
	    @CacheLookup
	    private WebElement hotSauce;

	    public WebElement getHotSauce() {
	        return hotSauce;
	    }
	    
	    public void hotSauceLinkVerificaiton(){
	    	 String link = hotSauce.getText();
				Assert.assertEquals(link, "HOT SAUCES"); 
				hotSauce.click();
				
				String title = driver.getTitle();
				Assert.assertEquals(title, "Broadleaf Commerce Demo Store - Heat Clinic - Hot Sauces");
				System.out.println("All worked");
	    }


	
	

}
