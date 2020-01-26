package com;

import java.util.ArrayList;
import java.util.Collections;

class LamdaEx {
	public static void main(String args[]) {

		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		System.out.println(arrL);//[1,2,3,4]
		for (Integer n : arrL) {
			if(n==2){
				System.out.println(n);
			}
		}
		//int i;
		//System.out.println(items ----->for(arrL)(if))
		// Using lambda expression to print all elements
		// of arrL
		int i=10;
		System.out.println("Using lambda expression to print all elements");
		arrL.forEach(n ->{if(n==2)
		System.out.println(n); 
		} );

		// Using lambda expression to print even elements
		// of arrL
		/*arrL.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});*/
	}
}
