package com.customerportal.tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.customerportal.tests.TestBaseSetup;
import com.customerportal.pageobjects.BasePage;

public class BasePageTest extends TestBaseSetup{
	
	private WebDriver driver;
	
	
		
		
	
	
	@BeforeClass
	public void setUp() throws ClassNotFoundException {
		driver=getDriver();
		
	}
	
	@Parameters({"expectedPageTitle"})
	@Test
	public void verifyHomePage(String expectedPageTitle) {
		//BasePageTest base = new BasePageTest();
		BasePage basePage = new BasePage(driver);
		System.out.println("Home page test...");
		logger = reports.createTest("verifyHomePage");
		Assert.assertTrue(basePage.verifyBasePageTitle(expectedPageTitle), "Home page title doesn't match");
	}

}
