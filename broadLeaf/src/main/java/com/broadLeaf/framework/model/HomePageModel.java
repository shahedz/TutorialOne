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
}
