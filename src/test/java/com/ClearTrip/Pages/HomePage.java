package com.ClearTrip.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{
	
	@FindBy(xpath="//*[@id='SearchForm']/h1")
	private WebElement SearchFlightsTitle;
	
	WebElement ele = browser.findElement(By.xpath("//*[@id='SearchForm']/h1"));
	
	@FindBy(xpath="")
	private WebElement rBtn_RoundTrip;
	
	@FindBy(xpath="")
	private WebElement From;
	
	@FindBy(xpath="")
	private WebElement To;
	
	@FindBy(xpath="")
	private WebElement DepartOn;
	
	@FindBy(xpath="")
	private WebElement ReturnOn;
	
	@FindBy(xpath="")
	private WebElement Adults;
	
	@FindBy(xpath="")
	private WebElement Children;
	
	@FindBy(xpath="")
	private WebElement SearchFlights;
	
	public HomePage() {
		PageFactory.initElements(browser, this);
	}

	public String getPageHeaderContent(){
//		WebElement ele = SearchFlightsTitle;
		String str = ele.getText();
		return str;
	}
	
	public void selectTypeOfTrip(String flightType){
		if(!rBtn_RoundTrip.getAttribute("checked").equalsIgnoreCase("checked")){
			rBtn_RoundTrip.click();
		}
	}
	
	public void enterTheOriginAirportName(String originAirportName){
		From.sendKeys(originAirportName);
	}
	
	public void enterTheDestinationAirportName(String destinationAriportName){
		To.sendKeys(destinationAriportName);
	}
	
	public void selectDepartOnDate(String departOnDate){
		
	}
	
	public void selectReturnOnDate(String returnOnDate){
		
	}
	
	public void selectNumberOfAdults(int NoOfAdults){
		Select drpAdults = new Select(Adults);
		drpAdults.selectByValue(Integer.toString(NoOfAdults));
	}
	
	public void selectNumberOfChildren(int NoOfChildren){
		Select drpChildren = new Select(Children);
		drpChildren.selectByValue(Integer.toString(NoOfChildren));
	}
	
	public void ClickOnSearchFlights(){
		SearchFlights.click();
	}
	
	
}








