package com;

class EmployeeEx implements Cloneable{
	int id;
	String name;
	public EmployeeEx(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneingEx {
public static void main(String[] args) throws CloneNotSupportedException {
	EmployeeEx e1 = new EmployeeEx(10,"abc");
	EmployeeEx e2 =(EmployeeEx) e1.clone();
	EmployeeEx e3 =(EmployeeEx) e2.clone();
	//EmployeeEx e2 = new EmployeeEx(10,"abc");
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	System.out.println(e3.hashCode());
	System.out.println(e1.id+"------e1------"+e1.name);
	System.out.println(e2.id+"------e2------"+e2.name);	
	System.out.println(e3.id+"------e3------"+e3.name);	
	
}
}
