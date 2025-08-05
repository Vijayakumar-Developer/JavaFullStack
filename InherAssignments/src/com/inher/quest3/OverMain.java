package com.inher.quest3;

import java.util.Scanner;

public class OverMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Figures fig;
		
		System.out.println("PLease enter the choice from 1 to 4: 1.Cube 2.Cuboid 3.Oval 4.Cylinder");
		int choice =sc.nextInt();
		
		switch(choice) {
		
		case 1 :
			System.out.println("Enter x  value for find cube volume:");
			fig = new Cube();
			fig.volume(sc.nextInt(), 0);
			break;
		case 2 :
			System.out.println("Enter l, b  value for find Cuboid volume:");
			fig = new Cuboid();
			fig.volume(sc.nextInt(), sc.nextInt());
			break;
		case 3 :
			System.out.println("Enter r1 ,r2  value for find Oval volume:");
			fig = new Oval();
			fig.volume(sc.nextInt(), sc.nextInt());
			break;
		case 4 :
			System.out.println("Enter r ,h   value for find Cylinder volume:");
			fig = new Cylinder();
			fig.volume(sc.nextInt(), sc.nextInt());
			break;
		}
		sc.close();
	}

}

