package com.global.TechnicalChallenge.resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public WebDriver driver;

	// CONSTRUCTOR
	BrowserFactory(String url) {
		// Use WebDriver Manager to download and setup chromedriver
        WebDriverManager.chromedriver().setup();


        // Create a new ChromeDriver object
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
		driver.get(url);

	}

	// ------------------------------------------------------------------------------------------

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
