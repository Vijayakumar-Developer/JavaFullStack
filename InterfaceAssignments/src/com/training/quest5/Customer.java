package com.training.quest5;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose phone types basic or touch : ");
		String type = sc.nextLine();

		IFeaturePhone phone;

		if (type.equalsIgnoreCase("basic")) {
			phone = new BasicMobile();
			phone.call();
			phone.messaging();
		} else {
			phone = new TouchScreenMobile();
			phone.call();
			phone.messaging();
			((ISmartPhone) phone).showApps();
			((ISmartPhone) phone).cameraTypes();
		}

		sc.close();

	}

}
