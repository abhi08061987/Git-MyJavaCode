/*Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.*/

package com.abhi.array.Lab;

import java.util.HashMap;

public class Lab1 {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		int arr2[]= {2,3,1,0,5,};
		
		//HashMap
		HashMap<Integer,Integer> hm = new HashMap();
		for(int a : arr) {
			hm.put(a, a);
		}
		
		for(int b : arr2) {
			if(!hm.containsKey(b)) {
				System.out.println(b);
			}
		}

		
	}

}
