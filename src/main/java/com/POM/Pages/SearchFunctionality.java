package com.POM.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utility.Validations;
import com.Utility.WebElementLocators;

public class SearchFunctionality extends WebElementLocators{

	 WebDriver driver;
	 Validations valid=new Validations();
	
	public SearchFunctionality(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchfunctionality(String text) throws AWTException {
		searchBar.sendKeys(text);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public void validation() {
		String expectedText=HomePageSearchBar.getAttribute("value");
		valid.titleValidationWithContains(expectedText,driver,"Related info is displayed as per the Searched text","Related info is not displayed as per the Searched text");
	
	}
	
	
}
