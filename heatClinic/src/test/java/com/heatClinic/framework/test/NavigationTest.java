package com.heatClinic.framework.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.heatClinic.framework.controller.BaseController;
import com.heatClinic.framework.main.BaseScript;

public class NavigationTest extends BaseScript {
	
	
	

	@Test
	public void printOutAllTheLinksOnTheHomePage() {
		
		System.out.println("Browser opened");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		for(WebElement e: link){
			
			System.out.println("My links are: "+e.getText());
		}
	}
	
	@Test
	public void verifyAllTheLinksInNavBar() {

		
//		String[] s = {"HOME", "HOT SAUCES", "MERCHANDISE", "CLEARANCE", "NEW TO HOT SAUCE?","FAQS" };
//		
//		System.out.println("Browser opened");
//		List<WebElement> link = driver.findElements(By.xpath("//div[@id='content']/nav/ul/li/a"));
//		
//		for(WebElement element: link){
//			element.getText().contains(s).click();
//			Assert.assertEquals(element, s);
//			
//		}
		
		WebElement hotSauces = driver.findElement(By.xpath("//div[@id='content']/nav/ul/li[2]/a"));
		String link = hotSauces.getText();
		Assert.assertEquals(link, "HOT SAUCES"); 
		hotSauces.click();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Broadleaf Commerce Demo Store - Heat Clinic - Hot Sauces");
		System.out.println("All worked");

		}	
	}
