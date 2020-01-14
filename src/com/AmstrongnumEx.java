package com;

import java.util.Scanner;

public class AmstrongnumEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int t = n;
		int r;
		int s = 0;
		while (n > 0) {
			r = n % 10;
			s = s + r * r * r;
			n = n / 10;
			System.out.println("s=" + s + "------" + "r=" + r + "------" + "n=" + n);
		}
		System.out.println(s);
		if (t == s) {
			System.out.println("The given number amst");
		} else {
			System.out.println("the given number not-amst");

		}
	}

}
