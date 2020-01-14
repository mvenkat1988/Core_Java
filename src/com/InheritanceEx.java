package com;

class Parent {
	int i = 10;

	public void setValues() {
		Employee emp = new Employee();
		emp.setId(25);// VM5008945
		emp.setName("abc");
		emp.setAdd("US");
		emp.setPhoneNmebr("12345");
		System.out.println(i);
		getValues(emp);
	}

	private void getValues(Employee emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAdd());
		System.out.println(emp.getPhoneNmebr());

	}
}

class Chaild extends Parent {
	int j = 20;
	int k = i + j;
	/*
	 * public void getValue() { System.out.println(k);
	 * 
	 * }
	 */
}

public class InheritanceEx {
	public static void main(String[] args) {
		Chaild ch = new Chaild();// 3
		/* ch.getValue(); */
		ch.setValues();
	}
	
	
}
