package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Validations {
	
	public void textValidationWithContains(String expected, WebElement element,String PassMsg,String FailMsg) {
		String actual = element.getText();
		if (actual.contains(expected)) {
			Assert.assertTrue(true, PassMsg);
			System.out.println(PassMsg);
		} else {
			Assert.assertTrue(false, FailMsg);
			System.out.println(FailMsg);
		}
	}
	public void textValidationWithEquals(String expected, WebElement element,String PassMsg,String FailMsg) {
		String actual = element.getText();
		if (actual.equalsIgnoreCase(expected)) {
			Assert.assertTrue(true, PassMsg);
			System.out.println(PassMsg);
		} else {
			Assert.assertTrue(false, FailMsg);
			System.out.println(FailMsg);
		}
	}

	public void titleValidationWithContains(String expected, WebDriver driver, String PassMsg,String FailMsg) {
		String actual = driver.getTitle();

		if (actual.contains(expected)) {
			Assert.assertTrue(true, PassMsg);
			System.out.println(PassMsg);
		} else {
			Assert.assertTrue(false, FailMsg);
			System.out.println(FailMsg);
		}

	}
	public void titleValidationWithEquals(String expected, WebDriver driver, String PassMsg,String FailMsg) {
		String actual = driver.getTitle();

		if (actual.equals(expected)) {
			Assert.assertTrue(true, PassMsg);
			System.out.println(PassMsg);
		} else {
			Assert.assertTrue(false, FailMsg);
			System.out.println(FailMsg);
		}

	}
//=================================================================================================================	
	
	public void isDisplayed(WebElement element,String PassMsg,String FailMsg) {
		if(element.isDisplayed()) {
			Assert.assertTrue(true, PassMsg);
			System.out.println(PassMsg);
		}else {
			Assert.assertTrue(false, FailMsg);
			System.out.println(FailMsg);
		}
	}
	
	public void isEnabled(WebElement element,String PassMsg,String FailMsg) {
		if(element.isEnabled()) {
			Assert.assertTrue(true, PassMsg);
			System.out.println(PassMsg);
		}else {
			Assert.assertTrue(false, FailMsg);
			System.out.println(FailMsg);
		}
	}
	
	public void isSelected(WebElement element,String PassMsg,String FailMsg) {
		if(element.isSelected()) {
			Assert.assertTrue(true, PassMsg);
			System.out.println(PassMsg);
		}else {
			Assert.assertTrue(false, FailMsg);
			System.out.println(FailMsg);
		}
	}
//===============================================================================================================	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
