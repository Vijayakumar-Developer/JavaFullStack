package com.training.question4;

public class TicketBooking {
	void bookingDetails(String busName, String destination, String source, String... passengerNames) {
		System.out.println("Bus Name: " + busName);
		System.out.println("From: " + source + " To: " + destination);
		System.out.println("Passenger Names:");
		
		for (String name : passengerNames) {
			System.out.println("- " + name);
		}
	}
}