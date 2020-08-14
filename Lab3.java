/*Sum of all Digits of a number in java*/

package com.abhi.array.Lab;

public class Lab3 {

	public static void main(String[] args) {
		
		sumOfAllDigits(47862);
		 
        sumOfAllDigits(416872);
 
        sumOfAllDigits(5674283);
 
        sumOfAllDigits(475496215);

	}

	private static void sumOfAllDigits(int number) {
		int copynumber = number;
		int sum = 0;
		while(copynumber != 0) {
			
			int lastDigit = copynumber%10;
			 sum = sum+lastDigit;
			 copynumber = copynumber/10;
		}
		System.out.println(sum);
	}
}
