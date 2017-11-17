package com.ClearTrip.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItineraryPage extends BasePage{
	
	@FindBy(xpath="")
	private WebElement ItineraryPageHeader;
	@FindBy(xpath="")
	private WebElement flightName;
	
	@FindBy(xpath="")
	private WebElement flightDepartureTime;
	
	@FindBy(xpath="")
	private WebElement flightArrivalTime;
	
	@FindBy(xpath="")
	private WebElement flightDuration;
	
	public ItineraryPage() {
		PageFactory.initElements(browser, this);
	}
}
