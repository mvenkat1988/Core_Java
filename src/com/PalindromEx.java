package com;

import java.util.Scanner;

public class PalindromEx {

	public static void main(String[] args) {
		System.out.println("Please enter number ");
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int r;
		int s=0;
		while (n>0) {
			r = n % 10;//1,2,1
			s = s*10+r;//1,12,12*10+1=121
			n = n/10;
			System.out.println("s="+s+"------"+"r="+r+"------"+"n="+n);
		}
		if(t==s){
			System.out.println("the given number is Palindrom");
		}else {
			System.out.println("the given number is non-Palindrom");
		}

	}

}
