package com.threads.quest1;

public class Booking implements Runnable {
	
	private String name;
    private int noOfTickets;
    private TicketCounter ticketCounter;
    private String ticketClass;
    private Thread t;
    
	public Booking(String name, int noOfTickets, String ticketClass, TicketCounter ticketCounter) {
		//super();
		this.name = name;
		this.noOfTickets = noOfTickets;
		this.ticketCounter = ticketCounter;
		this.ticketClass = ticketClass;
		//this.t = t;
		t = new Thread(this , name);
		t.start();
	}
	
	@Override
    public void run() {
        System.out.println(name + " started booking");
        double amount;
        synchronized (ticketCounter) {
            amount = ticketCounter.bookTickets(name, noOfTickets, ticketClass);
        }
        if (amount > 0) {
            System.out.println(name + " needs to pay: " + amount);
        }
        System.out.println(name + " booking process finished");
    }
    
    
}
