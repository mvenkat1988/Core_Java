package com;
class StudentDemo{
	static int i =10;
	int j=20;
	public synchronized static void getValues() {
		System.out.println("------getValues-------------");
	}
}
public class StaticDemo {
public static void main(String[] args) {
	System.out.println(StudentDemo.i);
	//System.out.println(StudentDemo.j);
	StudentDemo.getValues();
	
	StudentDemo s = new StudentDemo();
	System.out.println(s.i);
	s.getValues();
	System.out.println(s.j);
}
}
