package com.ClearTrip.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverGenerator {
	private WebDriver driver;
	private static DriverGenerator instance = null;
	
	private DriverGenerator(){
	};
	
	public static DriverGenerator createGeneratorInstance(){
		if(instance == null){
			instance = new DriverGenerator();
		}
		return instance;
	}
	
	public WebDriver getDriver(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
