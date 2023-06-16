package com.POM.TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BaseClass.BaseTest;
import com.POM.Pages.SearchSuggestions;

public class SearchSuggestionsTest extends BaseTest {
	SearchSuggestions suggestion;
	@Test
	public void searchSuggestionsTest() throws InterruptedException, IOException {
		suggestion=new SearchSuggestions(driver);
		suggestion.searchSuggestions();
		suggestion.pageValidation();
	}
	}





