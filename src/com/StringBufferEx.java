package com;

public class StringBufferEx {
public static void main(String[] args) {
	StringBuffer sb1 = new StringBuffer();
	System.out.println(sb1.capacity());//abc
	StringBuffer sb = new StringBuffer("abc");
	System.out.println(sb.capacity());//abc
	sb.append("pqr");//
	System.out.println(sb);//abcpqr
	System.out.println(sb.length());//abcpqr
	
	
	String st1 = new String("Krishna");
	//String st2 = new String();
	String st2 = st1.concat("US");//
	System.out.println(st2);//KrishnaUS
	
}
}
