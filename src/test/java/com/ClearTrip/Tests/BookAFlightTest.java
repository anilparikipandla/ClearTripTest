package com.ClearTrip.Tests;

import org.testng.annotations.Test;

import com.ClearTrip.Pages.HomePage;
import com.ClearTrip.Pages.ItineraryPage;
import com.ClearTrip.Pages.ResultsPage;

public class BookAFlightTest extends BaseTest{
	private static final String EXP_FROM = "";
	private HomePage homepage;
	private ResultsPage resultsPage;
	private ItineraryPage itineraryPage;

/*	@Test
	public void sampleTest(){
		System.out.println("This is a sample Test");
	}*/

	@Test
	public void BookAFlightTicket(){
		homepage = new HomePage();
		resultsPage = new ResultsPage();
		itineraryPage = new ItineraryPage();
		
		System.out.println("HEHEHE");
		
		
	}

}
