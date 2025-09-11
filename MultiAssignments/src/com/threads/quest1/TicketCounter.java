package com.threads.quest1;

public class TicketCounter {
	private int totalTickets;

	public TicketCounter(int totalTickets) {
		//super();
		this.totalTickets = totalTickets;
	}
	
	public double bookTickets(String name, int noOfTickets, String ticketClass) {
        double chargesPerTicket = 0;
        double totalAmount = 0;

        System.out.println(name + " is trying to book " + noOfTickets + " tickets in class " + ticketClass);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (noOfTickets > totalTickets) {
            System.out.println("Sorry " + name + ", only " + totalTickets + " tickets left. Cannot book " + noOfTickets);
            return 0;
        }

        switch (ticketClass.toUpperCase()) {
            case "A":
                chargesPerTicket = 320;
                break;
            case "B":
                chargesPerTicket = 200;
                break;
            case "C":
                chargesPerTicket = 120;
                break;
            default:
                System.out.println("Invalid class selected by " + name);
                return 0;
        }

        totalAmount = chargesPerTicket * noOfTickets;
        totalTickets -= noOfTickets;

        System.out.println("Booking successful for " + name);
        System.out.println("Tickets booked: " + noOfTickets + ", Class: " + ticketClass +
                ", Total Amount: " + totalAmount);
        System.out.println("Remaining tickets: " + totalTickets);

        return totalAmount;
    }

}
