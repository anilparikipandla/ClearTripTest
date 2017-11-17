package com.ClearTrip.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import com.ClearTrip.Driver.Browser;
import com.ClearTrip.Pages.HomePage;
import com.ClearTrip.Utils.ConfigReader;

public class BaseTest {
	protected WebDriver browser;
	private static final String EXPECTED_HOMEPAGE_HEADER = "Search flights"; 
	
	
	@BeforeTest
	public void OpenBrowser(){
		//set the browserType in Genericconfig property file
		ConfigReader.readConfigFile(".//resources//GenericConfig.properties");
		browser = Browser.getBrowser(ConfigReader.configFile().get("BrowserType"));
		Browser.openApplication();
		Assert.assertEquals((new HomePage()).getPageHeaderContent(), EXPECTED_HOMEPAGE_HEADER, "HomePage Header does not match!");
		
	}

}
