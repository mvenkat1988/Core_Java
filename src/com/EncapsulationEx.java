package com;

class Emp {
	private int id;
	private String name;
	private String add;
	private String phoneNmebr;

	
	public String getPhoneNmebr() {
		return phoneNmebr;
	}

	public void setPhoneNmebr(String phoneNmebr) {
		this.phoneNmebr = phoneNmebr;
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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

}

public class EncapsulationEx {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(10);
		e.setName("KKK");
		
	}
}
