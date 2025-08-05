package com.inher.quest4;

import java.util.Scanner;

public class CommMain {

	public static void main(String[] args) {
//Switch cas eto call all mehtods

		Scanner sc = new Scanner(System.in);
		Communication comm;

		System.out.println("1.Mail 2.Phone 3.Sms 4. Whatsapp . Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			comm = new MailCommunication();
			comm.sendMessage();

			String[] types = ((MailCommunication) comm).showTypes();
			System.out.println("Mail Types: ");
			for (String type : types)
				System.out.println(" : " + type);
			break;
		case 2:
			comm = new SMSCommunication();
			comm.sendMessage();
			((SMSCommunication) comm).messageLength();
			break;
		case 3:
			comm = new PhoneCommunication();
			comm.sendMessage();
			((PhoneCommunication) comm).callService();
			break;

		case 4:
			comm = new WhatsppCommunication();
			comm.sendMessage();
			((WhatsppCommunication) comm).otherFeatures();
			break;
		default:
			System.out.println("Invalid choice");
		}
		sc.close();
	}

}
