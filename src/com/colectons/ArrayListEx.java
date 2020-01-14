package com.colectons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;

/*interface list{
	void add(String a);//public abstrt void add(String a);
	void add(int i,String a);//public abstrt void add(int i,String a);
}*/


public class ArrayListEx {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("Krishna");
	list.add(12);
	list.add("yaswenth");
	list.add(13);
	list.add("Venkat");
	list.add(15);
	list.add(null);
	list.add(1,"Venkat             ");
	list.add("Krishna   ");
	list.add(12);
	list.add("yaswenth                    ");
	list.add(13);
	list.add("");
	list.add("Krishna");
	list.add(1,"yaswenth");
	ArrayListEX2 al2 = new ArrayListEX2();
	//ArrayList al3= al2.getArrayList();
	//System.out.println("----al2--------"+al3);
	//String st2 = al2.getSMS();
	//System.out.println(st2);
	list.add(0,al2.getSMS());
    list.add(1,al2.getArrayList());
    System.out.println("-----------"+list);
	System.out.println(list.get(1));
	System.out.println(list.remove(5));
	System.out.println(list);
	
	//System.out.println(list);//[k,12,v,15,y,13]
	/*for (int i = 0; i < 15; i++) {
		System.out.println(list.get(i));
	}*/
	/*Iterator itr = list.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}*/
	System.out.println(list);
		for (Object object : list) {
			//if(StringUtils.isEmpty(object))
			if(object != null && object!=""){
			 String st = object.toString();//null.toString()
			 System.out.println(st.trim());
			/*if ((st != null) && (st.equals("Krishna") || (st.equals("yaswenth")))) {
				System.out.println(st);
			}*/
			}
		}
}
}
