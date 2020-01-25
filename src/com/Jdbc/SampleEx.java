package com.Jdbc;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleEx {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('1', 'Venkat', 'Hyd','IT','8148180997')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('2', 'Yaswenth', 'US','MCA','123')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('3', 'Krishna', 'US','Btech','321')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('4', 'Ravi', 'Hyd','MCA','456')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('5', 'Srinu', 'Hyd','IT','654')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('6', 'Koti', 'Hyd','Btech','987')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('7', 'Raj', 'Hyd','MCA','789')");
	al.add("INSERT INTO Std_TB123 (SID ,Sname,Sadd,SDept,S_Phone_Number) VALUES ('8', 'Rani', 'Hyd','Inter','123')");
	/*System.out.println(al);
	for (String sql : al) {
		System.out.println(sql);
	}*/
	Iterator it = al.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
}
}
