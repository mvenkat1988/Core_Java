package com.colectons;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {

public static void main(String[] args) {
	Map<String,Integer> map = new HashMap();// int i=10
	map.put("Krishna",10);// new Integer(10);O/P: Krishna : 10
	map.put("Yaswenth",20);
	map.put("Venkat",30);//
	map.put("abc",40);
	map.put("Krishna",10);
	map.put("xyz",10);//r,n,
	map.put(null,10);
	System.out.println(map);//{null=10, Krishna=10, abc=40, Yaswenth=20, Venkat=30}
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.entrySet());//[null=10, Krishna=10, abc=40, Yaswenth=20, Venkat=30]
	System.out.println(map.keySet() +":" + map.values());
	for (Map.Entry<String,Integer> map1 : map.entrySet()) {
		if(map1.getKey() !=null && map1.getKey().equals("Krishna")){
		System.out.println(map1.getKey()+" : "+map1.getValue());
		}
	}
}

}
