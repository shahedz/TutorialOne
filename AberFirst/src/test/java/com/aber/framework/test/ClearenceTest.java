package com.aber.framework.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aber.framework.main.BaseClass;

public class ClearenceTest extends BaseClass{
	
	
	 @Test
	 public void test() throws InterruptedException{
		 System.out.println("its woroikgo");

		// clearenceController.becomeAMember2();
		 clearenceController.actont3();
		
		// Actions action = new Actions(driver);
//		 WebElement signInElement =  driver.findElement(By.id("util-account"));
//		 action.moveToElement(signInElement).moveToElement(driver.findElement(By.xpath("//div[@id='util-account-nav']/ul/li[2]/a[@class='util-account__link']"))).click().build().perform(); 
	 }
}
