package com;

import java.util.Scanner;

public class MagicNUmberEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int n = sc.nextInt();// 12
		int n1 = n * n;// 144
		System.out.println(n1);
		int s = getReverseVal(n1);
		System.out.println(s);
		int k = (int) Math.sqrt(s);
		System.out.println(k);// 21
		int s1 = getReverseVal(k);
		System.out.println(s1);
		if (n == s1) {
			System.out.println("The given Number is Magic Number....>");
		} else {
			System.out.println("The given Number is not-Magic Number....>");
		}
	}

	private static int getReverseVal(int n1) {
		int r = 0;
		int s = 0;
		while (n1 > 0) {
			r = n1 % 10;
			s = s * 10 + r;
			n1 = n1 / 10;
		}
		return s;
	}
}
