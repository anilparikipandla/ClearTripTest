package com.ClearTrip.Pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.xalan.xsltc.util.IntegerArray;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.ClearTrip.Utils.Misc;

public class ResultsPage extends BasePage{
	
	private String OnwardPricesPath = "";
	private String ReturnPricesPath = "";
	private int[] OnwardFlightPrices;
	private int[] ReturnFlightPrices;
	private WebElement secondHighestOnwardFlight = null;
	private WebElement secondHighestReturnFlight = null;
	
	@FindBy(xpath="")
	private WebElement allAirlines;
	
	@FindBys({
			@FindBy(xpath="")})
	private List<WebElement> OnwardFlights;
	
	@FindBys({
		@FindBy(xpath="")})
	private List<WebElement> ReturnFlights;
	
	@FindBy(xpath="")
	private WebElement BookFlight;
	
	public ResultsPage(){
		PageFactory.initElements(browser, this);
	}
	
	public String getFlightResultsPageHeader(){
		return allAirlines.getText();
	}
	
	public WebElement getSecondHighestPriceOnwardFlight(){
		OnwardFlightPrices = new int[OnwardFlights.size()];
		for(int i = 0; i < OnwardFlights.size(); i++){
			String price = OnwardFlights.get(i).findElement(By.xpath(OnwardPricesPath)).getText();
			OnwardFlightPrices[i] = Integer.parseInt(price);
		}
		int secondHighestFlightPrice = Misc.getSecondLargestPrice(OnwardFlightPrices);
		
		return 	null;
	}
	
	public String getSecondHighestPriceReturnFlight(){
		ReturnFlightPrices = new int[ReturnFlights.size()];
		for(int i = 0; i < ReturnFlights.size();i++){
			String price = ReturnFlights.get(i).findElement(By.xpath(ReturnPricesPath)).getText();
			ReturnFlightPrices[i] = Integer.parseInt(price);
		}
		return null;
			
		
	}
	
	public void selectSecondHighestPriceOnwardFlight(){
		
	}
	
	public void selectSecondHighestPriceReturnFlight(){
		
	}
	
	public void clickOnBookFlight(){
		BookFlight.click();
	}
	
	
	
}
