package com.ClearTrip.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ClearTrip.Utils.ConfigReader;

public class Browser {
	private static WebDriver browser;
	public static String str = ConfigReader.configFile().get("ImplicitWaitTimeInSeconds");
	private static final int IMPLICIT_WAIT_TIME_IN_SECONDS = Integer.parseInt(str);
	
	//Private constructor - singleton pattern
	private Browser(){
		
	}

	public static WebDriver getBrowser(String browserType){
		if(browser == null){
			if(browserType.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", ConfigReader.configFile().get("ChromeDriverPath"));
				browser = new ChromeDriver();
				browser.manage().window().maximize();
				System.out.println("Chrome Browser is opened!");
				browser.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME_IN_SECONDS, TimeUnit.SECONDS);
			}else if(browserType.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", ConfigReader.configFile().get("FirefoxDriverPath"));
				browser = new FirefoxDriver();
				browser.manage().window().maximize();
				System.out.println("Firefox Browser is opened!");
				browser.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME_IN_SECONDS, TimeUnit.SECONDS);
			}else{
				System.out.println("Browser does not match. Please provide proper browser name.");
			}
		}
		return browser;
	}
	
	public static WebDriver closeBrowser(){
		if(browser != null){
			browser.quit();
		}
		browser = null;
		System.out.println("Browser Closed!");
		return browser;
	}
}
