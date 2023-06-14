package com.POM.TestPages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.BaseClass.BaseTest;
import com.POM.Pages.SearchFunctionality;

public class SearchFunctionalityTest extends BaseTest {
	
	SearchFunctionality search;
	
	@Test
	public void searchfunctionalityTest() throws AWTException {
		search=new SearchFunctionality(driver);
		search.searchfunctionality("Amazon");
		search.validation();
	}
	
	
	
}
