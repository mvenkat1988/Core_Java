package com.colectons;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
public static void main(String[] args) {
	Map map = new HashMap();//
	map.put(1, "Krishna");
	map.put(2, "Yaswenth");
	map.put(3, "Venkat");//
	map.put(2, "abc");
	System.out.println(map);
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.entrySet());
	
	
}
}
