package com;

class EmployeeShadowClEx implements Cloneable {
	int id;
	String name;
	Emp_Address add;

	public EmployeeShadowClEx(int id, String name, Emp_Address add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShadowCloningEx {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp_Address eadd = new Emp_Address("INDIA", "USA");
		EmployeeShadowClEx e1 = new EmployeeShadowClEx(10, "abc", eadd);
		System.out.println(eadd.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e1.id + "------e1------" + e1.name + "----add1----" + eadd.add1 + "----add2----" + eadd.add2);
		EmployeeShadowClEx e2 = (EmployeeShadowClEx) e1.clone();
		System.out.println(e2.id + "------e2------" + e2.name + "----add1----" + eadd.add1 + "----add2----" + eadd.add2);
		System.out.println(eadd.hashCode());
		System.out.println(e2.hashCode());
	}
}
