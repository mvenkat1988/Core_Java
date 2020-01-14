package com.colectons;

import java.util.HashSet;
import java.util.TreeSet;

public class TreesetEx {
public static void main(String[] args) {
	HashSet al = new HashSet<>();
	//TreeSet al = new TreeSet<>();
	al.add("Krishna");
	al.add("Yaswenth");
	al.add("Venkat");
	al.add("Meera");
	al.add("Yaswenth");
	al.add("Venkat");
	al.add("Krishna");
	System.out.println(al);//[Krishna, Meera, Venkat, Yaswenth]

}
}
