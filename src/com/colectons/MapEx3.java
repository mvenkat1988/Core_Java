package com.colectons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MapEx3 {
	public static void main(String[] args) {
		Map<String, ArrayList> map = new HashMap<String, ArrayList>();
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		map.put("abc", al);
		map.put("US", new ArrayList(new HashSet(ArrayListEX2.getArrayList())));
		map.put("CA", CADetails());// Krishna, Meena, Hari, Yash, Naresh
		System.out.println(map);
		for (Map.Entry<String, ArrayList> map1 : map.entrySet()) {
			if(map1.getKey() !=null && map1.getKey().equals("US")){
			System.out.println(map1.getKey()+" : "+map1.getValue());
			}else if (map1.getKey() !=null && map1.getKey().equals("CA")) {
				System.out.println(map1.getKey()+" : "+map1.getValue());
			}
		}
	}

	private static ArrayList CADetails() {
		ArrayList all = new ArrayList(new HashSet(ArrayListEX2.getArrayList()));
		CopyOnWriteArrayList alll = new CopyOnWriteArrayList<>(all);
		for (Object object : alll) {
			if (object.equals("Ravi")) {
				alll.add(alll.indexOf(object), "Krishna");
				alll.remove(alll.indexOf(object));
			}
		}
		System.out.println(alll);
		return new ArrayList(alll);
	}

}
