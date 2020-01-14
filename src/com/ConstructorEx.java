package com;

class B {
	int i=10;
	B(){
		System.out.println("--------------");
	}
	B(int i) {
		System.out.println("--------B-----------"+i);
	}
	B(int i,int j,int k) {
		System.out.println(j+"--------B-----------"+i);
	}
	B(int i,float j) {
		System.out.println(j+"--------B--float---------"+i);
	}

	B(int i,String st) {
		System.out.println(st+"--------B-----------"+i);
	}
	void B() {
		System.out.println("-----void---B-----------");
	}
	
	void getSMS(int i,int j,int k) {
		System.out.println("-----void---B-----------");
	}
	/*@Override
	public String toString() {
		
		return "Krishna";
	}*/
}
public class ConstructorEx {
public static void main(String[] args) {
	B obj = new B(10,20);//
	/*obj.B();*/
	int i =10;
	int j=20;
	int k =0;
	obj.getSMS(10, 20, k);//
	System.out.println(obj);//B@1234//obj.toString()
	System.out.println(obj.toString());//B@1234//obj.toString()
}
}
