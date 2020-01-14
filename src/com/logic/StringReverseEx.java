package com.logic;

public class StringReverseEx {
public static void main(String[] args) {
	String st = "ravi";
	String st1="";
	/*StringBuffer sb = new StringBuffer(st);
	System.out.println(sb.reverse());*/
	for (int i = st.length()-1; i>=0; i--) {
		//st.charAt(i);
		st1=st1+st.charAt(i);
		//System.out.print();
	}
	System.out.println(st1);
	if(st.equals(st1)){
		System.out.println("the given String is palandrom");
	}else {
		System.out.println("the given String is non-palandrom");
	}
}
}
