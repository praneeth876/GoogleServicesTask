package com.POM.TestPages;

import org.testng.annotations.Test;

import com.BaseClass.BaseTest;
import com.POM.Pages.SearchSuggestions;

public class SearchSuggestionsTest extends BaseTest {
	SearchSuggestions suggestion;
	@Test
	public void searchSuggestionsTest() throws InterruptedException {
		suggestion=new SearchSuggestions(driver);
		suggestion.searchSuggestions("Amazon");
		suggestion.pageValidation();
	}
	}





