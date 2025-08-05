package com.inher.quest5;

public class MobMain {

	public static void main(String[] args) {
		Mobile m1 = new FeaturePhone();
		m1.call();
		Mobile m2 = new SmartPhone();
		m2.call();

		SmartPhone sp = (SmartPhone) m2;
		String[] appl = sp.apps();

		// String[] appl = m2.apps();
		System.out.println("Smart Phone Apps : ");

		for (String app : appl) {
			System.out.println("app");
		}

	}

}
