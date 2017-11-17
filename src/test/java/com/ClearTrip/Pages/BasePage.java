package com.ClearTrip.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ClearTrip.Driver.DriverGenerator;

public class BasePage {
	//All the common methods will be defined here
	public static WebDriver driver = DriverGenerator.createGeneratorInstance().getDriver();
	
	public void sample(){
	}
	

}
