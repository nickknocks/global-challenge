package com.global.TechnicalChallenge.testCase;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setUp() {	
    	PropertyConfigurator.configure("log4j.properties");

    }

    @AfterClass
    public void tearDown() {
        // Close the browser window
    }
}

