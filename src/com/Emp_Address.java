package com;

public class Emp_Address implements Cloneable {
	String add1;
	String add2;
	Emp_Address(String add1,String add2) {
		this.add1 = add1;
		this.add2 = add2;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
