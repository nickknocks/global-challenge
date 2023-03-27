package com.global.TechnicalChallenge.resource;


import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Testing {
	public WebDriver driver;
	private Class page;
	private BrowserFactory bf;
	private MyFunctions myFunctions;
	private Report reporter;
	public String leadName;
	public SoftAssert softAssert;

	// CONSTRUCTOR
	public Testing(String scriptName) {
		reporter = new Report(scriptName);
		myFunctions = new MyFunctions();
		bf = new BrowserFactory("https://magento.softwaretestingboard.com/");
		driver = bf.driver;
		softAssert = new SoftAssert();

		//3. INITIALING CURRENT PAGE TO NULL
		page = null;
	}

	// GETTERs and SETTERs FOR PAGE:
	public Class getPage() {
		return page;
	}

	public void setPage(Class page) {
		this.myFunctions.staticWait(1500);
		String title = this.driver.getTitle();
		this.getLogger().info("Landed on page: " + title);
		this.page = page;
	}

	// ---------------------------------------------------------------------
//	TEAR DOWN FOR TESTCASE:
	public void tearDown() {
		softAssert.assertAll();
		bf.closeBrowser();
		reporter.flush();
	}

	// ---------------------------------------------------------------------
	public MyFunctions myFunctions() {
		return myFunctions;
	}

//	---------------------------------------------------------------------
	public Report getLogger() {
		return reporter;
	}

}