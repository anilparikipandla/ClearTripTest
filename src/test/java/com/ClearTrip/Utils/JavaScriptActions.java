package com.ClearTrip.Utils;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.ClearTrip.Driver.Browser;

public class JavaScriptActions {

	public static void ExecuteJavaScript(String script, WebElement element){
		JavascriptExecutor executor = (JavascriptExecutor)Browser.getBrowser(ConfigReader.configFile().get("BrowserType"));
		executor.executeScript(script, element);
	}
	
	public static void ExecuteJavaScript(String script){
		JavascriptExecutor executor = (JavascriptExecutor)Browser.getBrowser(ConfigReader.configFile().get("BrowserType"));
		executor.executeScript(script);
	}
	
	

}
