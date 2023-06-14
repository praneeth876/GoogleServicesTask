package com.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.Utility.LogUtility;


public class BaseTest {

	public static WebDriver driver;
	Properties prop=new Properties();
	LogUtility log=new LogUtility();
	
	@BeforeClass
	public void setUp() throws FileNotFoundException {
		log.info("Setting Up the Test Environment");
		try {
		FileInputStream fileInput=new FileInputStream("./src/main/resources/GoogleServices.properties");
		
		prop.load(fileInput);
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		if(prop.getProperty("Browser").equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver","./driverFiles/msedgedriver.exe");
			
			driver=new EdgeDriver();
			log.warn("Launching Edge Browser");
		}
		else if (prop.getProperty("Browser").equalsIgnoreCase("chrome")) {
             System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
			
			driver=new ChromeDriver();
			log.warn("Launching Chrome Browser");
		}
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		log.info("Successfully navigated to url :"+prop.getProperty("Url"));
		
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.close();
		log.info("Browser is successfully closed");
	}
	
	
	
}
