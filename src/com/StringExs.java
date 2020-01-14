package com;

public class StringExs {
public static void main(String[] args) {
	int i = 10;
	String st = "Krishna";
	String st1 = new String("Krishna");
	String st4 = st;
	st.concat("US");
	System.out.println(st);
	String st2 = st.concat("-US");//KrishnaUS
	System.out.println(st2);//KrishnaUS
	
	String st3 =st2.concat("-Alabma");//35004
	System.out.println(st3.length());//KrishnaUS
	
	if(st.equals(st1)){
		System.out.println("True");
	}else {
		System.out.println("False");
	}
	
	if(st.equalsIgnoreCase(st1)){
		System.out.println("True");
	}else {
		System.out.println("False");
	}
	
	if(st==st1){
		System.out.println("True");
	}else {
		System.out.println("False");
	}
	
	if(st.equals(st4)){
		System.out.println("st4==e=="+"True");
	}else {
		System.out.println("st4=e==="+"False");
	}
	if(st==st4){
		System.out.println("st4===="+"True");
	}else {
		System.out.println("st4===="+"False");
	}
	
	
	
}
}
