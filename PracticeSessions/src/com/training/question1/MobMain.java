package com.training.question1;

public class MobMain {
	public static void main(String[] args) {
		
		Mobile obj = new Mobile("Vivo", 10000, "LIte");
		Mobile mob = new Mobile("Honor", 20000, "Major");
		String[] arr = obj.ShowFeatures();
		obj.getDetails();
		
		for (String ar : arr) {
			System.out.println(ar);
		}
		
		String[] mobi = mob.ShowFeatures();
		mob.getDetails();
		
		for (String mo : mobi) {
			System.out.println(mo);
			
		}
	}
}