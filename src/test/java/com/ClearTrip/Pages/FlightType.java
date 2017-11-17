package com.ClearTrip.Pages;

public enum FlightType {
	ONE_WAY("One way"),
	ROUND_TRIP("Round Trip"),
	MULTI_CITY("Multi-city");

	String name;
	FlightType(String name) {
		this.name=name;
	}
}

 
