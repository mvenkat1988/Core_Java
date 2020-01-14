package com;

import java.util.Scanner;

public class Palindrom_AmbstrongEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("do you want to do Palindrom or Ambstrong(P/A)--->");
		String cst = sc.next();
		if (cst.equalsIgnoreCase("P") || cst.equalsIgnoreCase("A")) {
			System.out.println("Enter a number:");
			int n = sc.nextInt();
			int t = n;
			int r;
			int s = 0;
			while (n > 0) {
				r = n % 10;
				if (cst.equalsIgnoreCase("P")) {
					s = s * 10 + r;
				} else if (cst.equalsIgnoreCase("A")) {
					s = s + r * r * r;
				}
				n = n / 10;
				System.out.println("s=" + s + "------" + "r=" + r + "------" + "n=" + n);
			}
			System.out.println(s);
			if (t == s) {
				if (cst.equalsIgnoreCase("P")) {
					System.out.println("the given number is Palindrom");
				} else if (cst.equalsIgnoreCase("A")) {
					System.out.println("The given number amst");
				}
			} else {
				if (cst.equalsIgnoreCase("P")) {
					System.out.println("the given number is non-Palindrom");
				} else if (cst.equalsIgnoreCase("A")) {
					System.out.println("The given number non-amst");
				}
			}
		} else {
			System.out.println("The given input is wrong....>");
		}
	}
}
