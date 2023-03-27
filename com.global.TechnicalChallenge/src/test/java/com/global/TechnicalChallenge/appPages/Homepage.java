package com.global.TechnicalChallenge.appPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.global.TechnicalChallenge.resource.Testing;

public class Homepage {

	@FindBy(id="search")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//*[@id=\"qs-option-0\"]/span[1]")
	private WebElement matchingOption;

	public void searchProduct(Testing test, String product) {
		test.myFunctions().click(test, searchTextBox);
		test.myFunctions().type(test, searchTextBox, product);
		test.myFunctions().click(test, matchingOption);
		test.getLogger().info("Searched the product - "+product);
	}
}
