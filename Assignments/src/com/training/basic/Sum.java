package com.training.basic;

public class Sum {

	public static void main(String[] args) {
int[] num = {1,2,3,4,7};
int length= num.length;
int sum =0;
for(int i=0;i<num.length;i++) {
	sum = sum + num[i];
}
System.out.println("sum of elements in the array is: " +sum);
float average = sum /length;
System.out.println("Average of the elemetns in the array is: " +average);
	}

}
