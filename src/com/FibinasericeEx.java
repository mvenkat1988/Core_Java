package com;



public class FibinasericeEx {
public static void main(String[] args) {//0 1 1 2 3 5 8 13 21
	int f0=0;
	int f1=1;
	int f=0;
	int sum =0;
	
	for (int i = 0; i <=10; i++) {
		//System.out.println(f0+"-----f1-------"+f1+"-----f-------"+f);
		
		f0=f1;//1//1
		f1=f;//0//1//2
		f=f0+f1;//1//2
		sum = sum+f1;
		System.out.print(f1+",");
	}
	System.out.println();
	System.out.println(sum);
}
}
