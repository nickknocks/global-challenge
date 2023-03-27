package com.global.TechnicalChallenge.appPages;

import org.openqa.selenium.By;
import com.global.TechnicalChallenge.resource.Testing;

public class SearchResults {
	
	
	public void openProduct(Testing test, String product) {
		
		String xpath_Size = "//strong[@class='product name product-item-name']//a[contains(text(),'{product}')]";

		String xpath = xpath_Size.replace("{product}", product);
		
		test.driver.findElement(By.xpath(xpath)).click();

	}

	
	
}
