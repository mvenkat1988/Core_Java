package com;

class A{
	int i=10;// veriable 
	static int j =20;
	public void getM1() {
		System.out.println("this is -Non-Static-Methoed....");
	}
	
	public static void  getM2() {
		System.out.println("this is - Static-Methoed....");
	}
	
	{
		System.out.println("this is Non-Static--Block--->");
	}
	static{
		System.out.println("this is Static---Block-->");
	}
}


public class Ex2 {
public static void main(String[] args) {
	System.out.println(A.j);
	A.getM2();
	A a = new A();//
	System.out.println(a.i);
	a.getM1();
}
}
