package com.colectons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHassetEx {

	public static void main(String[] args) {
		// HashSet al = new HashSet<>();
		// LinkedHashSet al = new LinkedHashSet<>();
		ArrayList al = new ArrayList<>();
		// TreeSet al = new TreeSet<>();
		al.add("Krishna");
		al.add("Yaswenth");
		al.add("Venkat");
		al.add("Meera");
		al.add("Yaswenth");
		al.add("Venkat");
		al.add("Krishna");
		System.out.println(al);// [Krishna, Meera, Venkat, Yaswenth]
		System.out.println(al.get(2));
		Collections.sort(al);//
		System.out.println(al);
		System.out.println(al.get(2));
	}

}

/*class Collections{
	public void sort() {
		
	}
}
*/