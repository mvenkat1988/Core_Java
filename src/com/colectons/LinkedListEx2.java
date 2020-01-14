package com.colectons;

import java.util.ArrayList;

class Student{
	int id;
	String sname;
	Student(int id,String sname){
		this.id=id;
		this.sname=sname;
	}
}

public class LinkedListEx2 {
	public static void main(String[] args) {
		Student st1 = new Student(10, "Krishna");
		Student st3 = new Student(30, "Yaswanth");
		Student st2 = new Student(20, "Venkat");

		ArrayList<Student> alist = new ArrayList<>();
		alist.add(st1);
		alist.add(st2);
		alist.add(st3);
		
		for (Student student : alist) {
			System.out.println(student.id+"-----------"+student.sname);//student@123
		}

	}
}
