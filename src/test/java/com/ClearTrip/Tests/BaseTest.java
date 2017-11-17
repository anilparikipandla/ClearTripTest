package com.ClearTrip.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.ClearTrip.Driver.Browser;
import com.ClearTrip.Utils.ConfigReader;

public class BaseTest {
	protected WebDriver browser;
	
	
	@BeforeTest
	public void OpenBrowser(){
		//set the browserType in Genericconfig property file
		ConfigReader.readConfigFile(".//resources//GenericConfig.properties");
		browser = Browser.getBrowser(ConfigReader.configFile().get("BrowserType"));
		
	}

}
