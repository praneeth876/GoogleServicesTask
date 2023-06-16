package com.POM.TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BaseClass.BaseTest;
import com.POM.Pages.ImageSearch;

public class ImageSearchTest extends BaseTest{

	ImageSearch image;
	
	@Test
	public void imageSearchClickTest() throws InterruptedException, IOException {
		image=new ImageSearch(driver);
		image.imageSearchclick();
		image.imageTextValidation();
		image.imagesearchFunctionality();
		image.imagePageValidation();
		image.imagePageValidation1();
	}
}
