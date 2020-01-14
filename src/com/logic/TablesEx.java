package com.logic;

public class TablesEx {
	public static void main(String[] args) {
		int n=7;
		getOnly7_thTable(n);
		int n1=5;
		getOnly5_thTable(n1);
		getAll_thTable();
	}

	private static void getOnly5_thTable(int n) {
		getOnly7_thTable(n);
	}

	private static void getAll_thTable() { 
		for (int n = 2; n <= 10; n++) {
			getOnly7_thTable(n);
		}
	}

	private static void getOnly7_thTable(int n) {
		System.out.println("===============" + n + "-Table Starteing");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);// 2*1=2
		}
		System.out.println("===============" + n + "-Table complected");
	}
	}
