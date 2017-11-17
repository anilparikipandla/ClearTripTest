package com.ClearTrip.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ClearTrip.Driver.Browser;

public class Waits {
	WebDriver browser = Browser.getBrowser(ConfigReader.configFile().get("BrowserType"));
	private static final int MIN_TIMEOUT_IN_SECONDS = Integer.parseInt(ConfigReader.configFile().get("MinTimeOut"));

    public void waitForElementClickable(WebElement object) {
        WebDriverWait wait = new WebDriverWait(browser,MIN_TIMEOUT_IN_SECONDS );
        wait.until(ExpectedConditions.elementToBeClickable(object));
    }
    
    public void waitForElementNotVisible(WebElement object) {
        WebDriverWait wait = new WebDriverWait(browser, MIN_TIMEOUT_IN_SECONDS);
        wait.until(ExpectedConditions.invisibilityOf(object));
    }
}
