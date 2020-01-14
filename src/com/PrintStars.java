package com;

public class PrintStars {

public static void main(String[] args) {
	for (int i = 1; i <=6; i++) {//i++=i+1=2/3/4/5/6/7
		for (int j = 1; j <=i; j++) {//1/2
			System.out.print("*");
		}
		System.out.println("="+i);
		//System.out.println();
		
	}
}

}
