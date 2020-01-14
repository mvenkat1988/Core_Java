package com;

class Test{
	final int i=10;
	public void getVal1() {
		//i =10;	
		System.out.println(i);//10
	}
	 public void getVal2() {
		//i =20;	
		System.out.println(i);//20
	}
}

class Test1 extends Test{

	final int i=10;
	public void getVal1() {
		//i =10;	
		System.out.println(i);//10
	}
	 public void getVal2() {
		//i =20;	
		System.out.println(i);//20
	}

}
public class FinalEx {
public static void main(String[] args) {
	Test1 t = new Test1();
	t.getVal1();
	t.getVal2();
	
}
}
