/*How to find the largest and smallest number in an array?*/

package com.abhi.array.Lab;

import java.util.Arrays;

public class Lab2 {
	public static void main(String[] args) {

		minmax(new int[]{20, 34, 21, 87, 92,10,2}); 
		/*
		 * topTwo(new int[]{0, Integer.MIN_VALUE, -2}); topTwo(new
		 * int[]{Integer.MAX_VALUE, 0, Integer.MAX_VALUE}); topTwo(new int[]{1, 1, 0});
		 */
	}

	private static void minmax(int[] is) {

		int min = 0;
		int max = 0;
		int count=0;
		System.out.println(min +"======="+max);
		
		for(int max1 : is) {
			if(max < max1) {
				max = max1;
				if(min==0 && count == 0) {
					count++;
				min=max1;
				}
			}else if(min > max1){
				min = max1;
			}
		}
		
		System.out.println("Given integer array : " + Arrays.toString(is)); 
		System.out.println("Largest number in array is : " + max); 
		System.out.println("Smallest number in array is : " + min);
	}

}
