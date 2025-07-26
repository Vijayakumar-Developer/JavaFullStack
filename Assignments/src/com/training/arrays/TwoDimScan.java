package com.training.arrays;

import java.util.Scanner;

public class TwoDimScan {

	public static void main(String[] args) {
int [][] marks = new int [3][2];
System.out.println(marks.length);
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values:");

for (int i =0; i< marks.length;i++) {
	for (int j=0;j < marks[i].length;j++) {
		marks[i][j] = sc.nextInt();
		
	}
	
}
for (int[] one : marks) {
	for (int val : one) {
		System.out.print(val +" ");
		
	}
	System.out.println();
}


	}

}
