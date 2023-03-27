package com.global.TechnicalChallenge.testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.global.TechnicalChallenge.appPages.Homepage;
import com.global.TechnicalChallenge.appPages.Product;
import com.global.TechnicalChallenge.appPages.SearchResults;
import com.global.TechnicalChallenge.appPages.UpperNavPanel;
import com.global.TechnicalChallenge.resource.Testing;

public class FunctionalTests extends BaseTest {

	@Test
//	public void testAddToCart() throws Throwable {
	public static void main(String[] args) throws Exception {
		
		//Creating a new test and STEP-1
		Testing test = new Testing("Test Case 1");
//		test.myFunctions().staticWait(20000);

		try {
			//Search the product
			test.setPage(Homepage.class);
			Homepage home = (Homepage) PageFactory.initElements(test.driver, test.getPage());
			home.searchProduct(test, "Gwyn Endurance Tee");
			
			//Open the the product
			test.setPage(SearchResults.class);
			SearchResults searchResults = (SearchResults) PageFactory.initElements(test.driver, test.getPage());
			searchResults.openProduct(test, "Gwyn Endurance Tee");
			
			//Select Size
			test.setPage(Product.class);
			Product product = (Product) PageFactory.initElements(test.driver, test.getPage());
			product.selectSize_M(test);
			
			//Select Color - Green
			product.selectColorGreen(test);
			
			//Enter Qty - 4
			product.enterQty(test, "4");
			
			//Check cart total - $92.00
			test.setPage(UpperNavPanel.class);
			UpperNavPanel upperPanel = (UpperNavPanel) PageFactory.initElements(test.driver, test.getPage());
			upperPanel.clickCart(test);
			test.softAssert.assertEquals(upperPanel.getTotalPrice(test), "$92.00");
			
			//Update the Quantity of  Gwyn Endurance Tee Medium Green to 3
			upperPanel.changeQty(test, "3");
			
//			----------
			
			//Search the product
			test.setPage(Homepage.class);
			home.searchProduct(test, "Gwyn Endurance Tee");
			
			//Open the product
			test.setPage(SearchResults.class);
			searchResults.openProduct(test, "Gwyn Endurance Tee");
			
			//Select Size
			test.setPage(Product.class);
			product.selectSize_S(test);
			
			//Select Color - Yellow
			product.selectColorYellow(test);
			
			//Enter Qty - 1
			product.enterQty(test, "1");
			
//			----------
			//Search the product
			test.setPage(Homepage.class);
			home.searchProduct(test, "Quest Lumaflex™ Band");
			
			//Open the product
			test.setPage(SearchResults.class);
			searchResults.openProduct(test, "Quest Lumaflex™ Band");
			
			//Enter Qty - 1
			product.enterQty(test, "1");
			
			//Check cart total - $116.00
			test.setPage(UpperNavPanel.class);
			upperPanel.clickCart(test);
			upperPanel.getTotalPrice(test);
			test.softAssert.assertEquals(upperPanel.getTotalPrice(test), "$116.00");
			
			
			test.getLogger().pass("Test has passed.");

		} catch (Exception e) {
			test.getLogger().error("Error occured.");
			throw (e);
		} finally {
			test.tearDown();
		}
	}	
}	