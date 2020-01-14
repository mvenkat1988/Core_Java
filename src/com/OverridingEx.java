package com;

class AA{
	public void m1(int i,int j) {
		System.out.println(i+"------super-----"+j);
	}
}

class BB extends AA{
	public void m1(int i,int j) {
		System.out.println(i+"-----sub------"+j);
	}
}


public class OverridingEx {
public static void main(String[] args) {
	AA aa  = new AA();//2
	aa.m1(10, 20);
	
	BB bb = new BB();//3
	bb.m1(40, 30);
	
	int ijklmn = 10;
	
	AA ab = new BB();//3
	ab.m1(50, 60);
	
}
}
