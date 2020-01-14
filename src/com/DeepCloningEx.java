package com;


class EmployeeDeepClEx implements Cloneable {
	int id;
	String name;
	Emp_Address add;

	public EmployeeDeepClEx(int id, String name, Emp_Address add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


public class DeepCloningEx {

	public static void main(String[] args) throws CloneNotSupportedException {
		Emp_Address eadd = new Emp_Address("INDIA", "USA");
		EmployeeDeepClEx e1 = new EmployeeDeepClEx(10, "abc", eadd);
		System.out.println(eadd.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e1.id + "------e1------" + e1.name + "----add1----" + eadd.add1 + "----add2----" + eadd.add2);
		EmployeeDeepClEx e2 = (EmployeeDeepClEx) e1.clone();
		Emp_Address eadd2 = (Emp_Address) eadd.clone();
		System.out.println(e2.id + "------e2------" + e2.name + "----add1----" + eadd2.add1 + "----add2----" + eadd2.add2);
		System.out.println(eadd2.hashCode());
		System.out.println(e2.hashCode());
	}

}
