package com;

public class PolymorphisamEx {

	public void getM1() {
	System.out.println("---0-Paramateries---Methoed");	
	}
	
	public void getM1(int i) {
		System.out.println("---1-Paramateries---Methoed--->"+i);	
		}
	
	public void getM1(int i,int j) {
		int s = i +j;
		System.out.println("---2-Paramateries---Methoed--->"+s);	
		}
	
	public void getM1(int i,int j,int k) {
		int s = i+j+k;
		System.out.println("---3-Paramateries---Methoed---->"+s);	
		}
	

	public void getM1(int i,int j,int k,String st) {
		int s = i+j+k;
		System.out.println("---3-Paramateries---Methoed---->"+s);	
		}
	
	public static void main(String[] args) {
		PolymorphisamEx p =  new PolymorphisamEx();
		p.getM1(20,30);
	}
	
}
