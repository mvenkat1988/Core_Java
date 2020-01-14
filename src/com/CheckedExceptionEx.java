package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class CheckedExceptionEx {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	//ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("Emp_Details1555555566877755.txt")));
	//new FileOutputStream(new File("Emp_Details1555555566877755.txt"));
	new FileOutputStream("Emp_Details1555555566877755.txt");
	//ObjectOutputStream objectOutputStream = new ObjectOutputStream("Emp_Details1555555566877755.txt");
}
}
