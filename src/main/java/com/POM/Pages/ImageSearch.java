package com.POM.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utility.ExcelUtility;
import com.Utility.Validations;
import com.Utility.WebDriverUtilities;
import com.Utility.WebElementLocators;

public class ImageSearch extends WebElementLocators {

 WebDriver driver;
 WebDriverUtilities util=new WebDriverUtilities();
 Validations validations=new Validations();
 ExcelUtility excel;
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
	
	public void imagesearchFunctionality() throws InterruptedException, IOException {
		excel=new ExcelUtility("./src/main/resources/GoogleServices.xlsx","sheet1");
		String data=excel.getData( 0, 0);
		Thread.sleep(4000);
		searchField.sendKeys(data);
		util.keyBoardOperations(driver,"ENTER");
	}	
	public void imagePageValidation1() {
		validations.isSelected(newsResultElement, "Selected text news is displayed", "Selected text news is not displayed");
		
	}
	
	public void imagePageValidation() {
		validations.isSelected(imageResultElement, "Selected text Images is displayed", "Selected text Images is not displayed");
		
	}
	
	
}
