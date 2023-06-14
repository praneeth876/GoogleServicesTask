package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebElementLocators {

	@FindBy(xpath = "//*[@class=\"gLFyf\"]")public WebElement searchBar;
	@FindBy(xpath = "//*[@id=\"APjFqb\"]") public WebElement HomePageSearchBar;
//--------------------------------------------------------------------------------	
	@FindBy(xpath="//*[@class=\"gLFyf\"]")public WebElement searchBox;
	@FindBy(xpath="//*[@class=\"aajZCb\"]")public WebElement suggestionBar;
	@FindBy(xpath="//*[@id=\"APjFqb\"]")public WebElement HomepageSearchBar;
//--------------------------------------------------------------------------------
	@FindBy(xpath = "//a[@class=\"gb_v\"][text()='Images']")public WebElement imageLink;
	@FindBy(xpath="//span[@class=\"T8VaVe\"]")public WebElement imageTextElement;
	@FindBy(xpath="//*[@class=\"gLFyf\"]")public WebElement searchField;
	@FindBy(xpath="//*[@class=\"rQEFy NZmxZe\"]")public WebElement imageResultElement;
	
}
