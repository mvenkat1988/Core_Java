package com.colectons;

import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedListEx {
public static void main(String[] args) {
	LinkedList<String> al = new LinkedList<>();
	
	al.add("Ravi");
	al.add("Naresh");
	al.add("Hari");
	al.add("Meena");
	al.add("Yash");
	//al.add(null);
	al.add("Ravi");
	al.add("Naresh");
	al.add("Hari");
	al.add("Meena");
	al.add("Yash");
	//al.add(null);
	al.add("");
	//al.add(12345);
	
	System.out.println(al);
	CopyOnWriteArrayList<String> cal= new CopyOnWriteArrayList<>(al);
	for (char i = 'A'; i <='z'; i++) {
		System.out.print(i);
		cal.add(""+i);
	}
	
	for (String object : cal) {
		System.out.println(object);
		/*if(!al.contains(null)){//"null"
			
		}*/
		if(object.equals("")){
			cal.add("Krishna");
		}
		
	}
	System.out.println(cal);
	LinkedList<String> lll = new LinkedList<>(cal);
	System.out.println(lll);
	
}
}
