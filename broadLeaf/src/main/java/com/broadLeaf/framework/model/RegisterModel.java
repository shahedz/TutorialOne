package com.broadLeaf.framework.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterModel extends HomePageModel{

	public RegisterModel(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.ID, using = "customer.emailAddress")
	  private WebElement getEmailTextBoxElement;

	  public WebElement getEmailTextBoxElement() {
		  return getEmailTextBoxElement;
	  } 

}
