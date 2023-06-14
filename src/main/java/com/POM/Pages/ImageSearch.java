package com.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utility.Validations;
import com.Utility.WebDriverUtilities;
import com.Utility.WebElementLocators;

public class ImageSearch extends WebElementLocators {

 WebDriver driver;
 WebDriverUtilities util=new WebDriverUtilities();
 Validations validations=new Validations();
 String expectedText;
	public ImageSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	public void imageSearchclick() throws InterruptedException {
		expectedText=imageLink.getText();
		Thread.sleep(4000);
		imageLink.click();
	  
	}
	
	public void imageTextValidation() {
		
		//String actualText=imageTextElement.getText();
		String actualText=driver.getTitle();
		if(actualText.contains(expectedText)) {
			Assert.assertTrue(true,"Expected image page is displayed");
			System.out.println("Expected image page is displayed");
		}else {
			Assert.assertFalse(false,"Expected image page is not displayed");
			System.out.println("Expected image page is not displayed");	
		}
		
	}
	
	public void imagesearchFunctionality(String value) throws InterruptedException {
		Thread.sleep(4000);
		searchField.sendKeys(value);
		util.keyBoardOperations(driver,"ENTER");
	}																																											
	
	public void imagePageValidation() {
		validations.isEnabled(imageResultElement, "Selected text Images is displayed", "Selected text Images is not displayed");
		
	}
	
	
}
