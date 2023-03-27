package com.global.TechnicalChallenge.appPages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.global.TechnicalChallenge.resource.Testing;

public class Product {
	
	@FindBy(xpath="//div[@option-label='S']")
	private WebElement sizeS;
	
	public void selectSize_S(Testing test) {
		test.myFunctions().click(test, sizeM);
	}
	
	@FindBy(xpath="//div[@option-label='M']")
	private WebElement sizeM;
	
	public void selectSize_M(Testing test) {
		test.myFunctions().click(test, sizeM);
	}
	
	@FindBy(xpath="//div[@option-label='Green']")
	private WebElement color_Green;
	
	public void selectColorGreen(Testing test) {
		test.myFunctions().click(test, color_Green);
	}
	
	@FindBy(xpath="//div[@option-label='Yellow']")
	private WebElement color_Yellow;
	
	public void selectColorYellow(Testing test) {
		test.myFunctions().click(test, color_Yellow);
	}
	
	@FindBy(id="qty")
	private WebElement quantity;
	
	public void enterQty(Testing test, String count) {
		test.myFunctions().type(test, quantity, count);
	}
	
}
