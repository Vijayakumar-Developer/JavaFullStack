package com.threads.quest1;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketCounter counter = new TicketCounter(10);
        new Booking("Vijay", 3, "A", counter);
        new Booking("Ezhil", 4, "B", counter);
        new Booking("Maran", 5, "C", counter);
	}

}
