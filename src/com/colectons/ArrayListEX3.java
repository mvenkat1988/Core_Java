package com.colectons;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListEX3 {
	public static void main(String[] args) {
		// ArrayList<String> al = new ArrayList<>();
		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();
		al.add("Ravi");
		al.add("Naresh");
		al.add("Hari");
		al.add("Meena");
		al.add("Yash");
		al.add(null);
		al.add("");
		if((al.contains(null)) || (al.contains(""))){
		for (String st : al) {
			System.out.println(st);
			if (st == null) {
				System.out.println("hello----->" + al.indexOf(st));
				al.remove(al.indexOf(st));
				al.add("Venkat");
				al.add(ArrayListEX2.getSMS());
			} else if (st.equalsIgnoreCase("")) {
				al.remove(al.indexOf(st));
				al.add("Krishna");
				al.addAll(ArrayListEX2.getArrayList());
			}
		}
		}
		if(al.contains("Meena")){
		System.out.println("bye...");
		}
	}
}
