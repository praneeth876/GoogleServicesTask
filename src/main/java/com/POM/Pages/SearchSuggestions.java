package com.POM.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utility.ExcelUtility;
import com.Utility.Validations;
import com.Utility.WebDriverUtilities;
import com.Utility.WebElementLocators;

public class SearchSuggestions extends WebElementLocators{
WebDriver driver;
	WebDriverUtilities util=new WebDriverUtilities();
	Validations validation=new Validations();
	ExcelUtility excel;
	public SearchSuggestions(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchSuggestions() throws InterruptedException, IOException {
		excel=new ExcelUtility("./src/main/resources/GoogleServices.xlsx","sheet1");
		String data=excel.getData( 0, 0);
		searchBox.sendKeys(data);
		boolean suggestions=suggestionBar.isEnabled();
		System.out.println(suggestions);
		if(suggestions) {
			System.out.println("In the IF block");
			for(int i=0;i<=5;i++) {
				util.keyBoardOperations(driver,"ARROW_DOWN");
				Thread.sleep(3000);
			}
			util.keyBoardOperations(driver,"ENTER");	
			
		}
	}
	
	public void pageValidation() {
		String expected=HomepageSearchBar.getAttribute("value");
		validation.titleValidationWithContains(expected, driver,"suggestion text is matched with the result page","suggestion text is not matched with the result page");
		
		
	}
	
	
}
