package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSearlizationEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*FileInputStream fis = new FileInputStream("Student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);*/
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.txt"));
		Student st = (Student) ois.readObject();
		System.out.println(st.id);
		System.out.println(st.name);
	}
}
