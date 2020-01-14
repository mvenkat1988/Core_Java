package com.logic;

import java.util.Scanner;

public class DemonatorEx {
	public static void main(String[] args) {
		int rev = 0;
		int k = 0;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		if(k != 0){
		while (k>0) {
			rev = rev % 10;
			rev = rev * 10+ k ;
			k = k / 10;
		}
		System.out.println(rev);
	}
	}
}
