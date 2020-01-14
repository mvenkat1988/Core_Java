package com;

class EMP3 {
	static EMP3 e = null;
	private EMP3() {

	}

	public static EMP3 getInstant() {
		if (e == null) {//true
			e = new EMP3();
		}
		return e;
	}
}

public class SingletonEx {
public static void main(String[] args) {
	EMP3 e1 = EMP3.getInstant();
	System.out.println("-------e1--------"+e1.hashCode());
	EMP3 e2 = EMP3.getInstant();
	System.out.println("-------e2--------"+e2.hashCode());
	
	/*
	EMP3 e3 = new EMP3();//2
	EMP3 e1 = new EMP3();//2
	
	EMP3 e2 = new EMP3();//2
	System.out.println("----e1---"+e1.hashCode());
	System.out.println("----e2---"+e2.hashCode());
	System.out.println("----e3---"+e3.hashCode());
	
	
*/}
}
