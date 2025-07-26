package com.javalearn.arrays;

public class OneDimArray {

	public static void main(String[] args) {
int [] nums = new int[4];
System.out.println(nums.length);
nums[0]=10;
nums[1]=20;
nums[2]=30;
nums[3]=40;
System.out.println(nums[2]);
int sum =0;
for(int i =0;i<nums.length;i++) {

//sum= sum +nums[i];
sum +=nums[i];

}
System.out.println("sum :" + sum);
	}

}
