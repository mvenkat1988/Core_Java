package com;

class Emplyee{

	int id =10;
	String name="abc";
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
	
	@Override
	public String toString() {
		
		return "hi this is venkat";
	}
}
public class ToStringEx {
public static void main(String[] args) {
	Emplyee e = new Emplyee();
	ToStringEx t = new ToStringEx();
	//System.out.println(e.id+"--------"+e.name);//e.toString()//com.Emplyee@123455
	System.out.println(e);//com.Emplyee@1db9742
	System.out.println(e.toString());//com.Emplyee@1db9742
	System.out.println(e.hashCode());
	System.out.println(t.hashCode());
	
}
}
