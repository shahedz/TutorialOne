package com.broadLeaf.framework.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageModel extends ModelBase{

	public HomePageModel(WebDriver driver) {
		super(driver);
	}

	  @FindBy(how = How.XPATH, using = "//div[2]/ul/li[1]/div[1]/a/img")
	  private WebElement gethotSauceItemOne;

	  public WebElement gethotSauceItemOne() {
		  return gethotSauceItemOne;
	  } 
	  
	  @FindBy(how = How.XPATH, using = "//div[@id='cart_info']/a[2]")
	  private WebElement registrationButton;

	  public WebElement registrationButton() {
		  return registrationButton;
	  }
	  
}
