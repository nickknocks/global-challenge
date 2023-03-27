package com.global.TechnicalChallenge.appPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.global.TechnicalChallenge.resource.Testing;

public class UpperNavPanel {

	
	@FindBy(xpath="//a[@class='action showcart']")
	private WebElement showCart;

	public void clickCart(Testing test) {
		test.myFunctions().click(test, showCart);
	}
	
	@FindBy(xpath="//span[@class='price-wrapper']/span[@class='price']")
	private WebElement totalPrice;

	public String getTotalPrice(Testing test) {
		test.getLogger().info(totalPrice.getText());
		return totalPrice.getText();
		
	}
	
	
	@FindBy(xpath="//div[@class='details-qty qty']/input[@class]")
	private WebElement qty;
	
	@FindBy(xpath="//div[@class='details-qty qty']/button[@class]")
	private WebElement update;

	public void changeQty(Testing test, String newCount) {
		test.myFunctions().type(test, qty, newCount);
		test.myFunctions().click(test, update);
	}
}
