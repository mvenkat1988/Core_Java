package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	String id;
	String name;
	 private static final long serialVersionUID=1L; 
	 volatile int sid=10;
	Student(String id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(id);
		System.out.println(name);
	}
}

public class SearlizationEx {
	public static void main(String[] args) throws IOException {
		Student st = new Student("10", "abc");
		/*
		 * File f = new File("Student.txt"); FileOutputStream fos = new
		 * FileOutputStream(f); ObjectOutputStream oos = new
		 * ObjectOutputStream(fos);
		 */
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("Student.txt")));
		oos.writeObject(st);
	}
}
