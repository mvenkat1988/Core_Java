package com;

class StudentEx {
	int id;
	String name;

	public StudentEx(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void StudentEx(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class HashCodeEx {
	public static void main(String[] args) {
		StudentEx st = new StudentEx(10, "Krishna");
		StudentEx st1 = new StudentEx(11, "Venkat");
		StudentEx st2 = new StudentEx(12, "Yaswanth");
		StudentEx st3 = new StudentEx(10, "Krishna");
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st.getClass());
		
		System.out.println(st1.equals(st));//F
		System.out.println(st2.equals(st1));//F
		System.out.println((st.name).equals(st3.name));//T
		System.out.println((""+st.id).equals(""+st3.id));//T
		System.out.println(st.equals(st));//T
		
		
		System.out.println(st1==st);//F
		System.out.println(st2==st1);//F
		System.out.println(st==st3);//F
		System.out.println(st==st);//T
		
	}
}
