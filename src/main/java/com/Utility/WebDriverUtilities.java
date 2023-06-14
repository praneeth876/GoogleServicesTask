package com.Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class WebDriverUtilities {

	public WebDriver driver;

	public void moveToElement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}

	public void dragAndDrop(WebDriver driver, WebElement dragElement, WebElement dropElement) {
		Actions action = new Actions(driver);
		action.dragAndDrop(dragElement, dropElement).build().perform();
	}

	public void keyBoardOperations(WebDriver driver, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.valueOf(value)).build().perform();

	}

	

}
