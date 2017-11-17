package com.ClearTrip.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.ClearTrip.Driver.Browser;
import com.ClearTrip.Utils.ConfigReader;


public class BasePage {
	//All the common methods will be defined here
	public WebDriver browser;
	protected HomePage homePage;
	protected ResultsPage resultPage;
	protected ItineraryPage itineraryPage;
	

	@BeforeTest
	public void setUpBrowser(){
		browser = Browser.getBrowser(ConfigReader.configFile().get("BrowserType"));
		
	}

}
