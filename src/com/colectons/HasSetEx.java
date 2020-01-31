package com.colectons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HasSetEx {
	public static void main(String[] args) {
		//Set hs = new HashSet<>();
		ArrayList hs = new ArrayList<>();
		hs.add("b");
		hs.add("c");
		hs.add("a");
		hs.add("e");
		hs.add("d");
		hs.add("c");
		hs.add("a");
		hs.add(null);
		hs.add("e");
		hs.add("c");
		hs.add("a");
		hs.add("e");
		hs.add("c");
		hs.add("a");
		hs.add("e");
		hs.add(122);
		hs.add("a");
		hs.add("e");
		hs.add(null);
		hs.addAll(ArrayListEX2.getArrayList());
		System.out.println(hs);
		hs.add(ArrayListEX2.getArrayList());
		System.out.println(hs);
		ArrayList al = ArrayListEX2.getArrayList();
		al.add("Krishna");
		al.add("Yaswenth");
		al.add("Venkat");
		al.add("Meera");
		al.add("Yaswenth");
		al.add("Venkat");
		al.add("Krishna");
		al.addAll(hs);
		System.out.println(al);
		HashSet hs1 = new HashSet<>(al);
		//hs1.addAll(hs);
		System.out.println("----====---"+hs1);
		for (Object object : hs1) {
			if((object !=null)  && (object.equals("Krishna") || object.equals("Venkat") || object.equals("Yaswenth"))){
			System.err.println(object+"-------"+Collections.frequency(al, object));
			}
		}
		
	}
}
