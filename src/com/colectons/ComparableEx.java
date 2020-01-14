package com.colectons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class StudentBean  implements Comparable<StudentBean>{
	int sid;
	String sname;
	int sage;

	StudentBean(int sid, String sname, int sage) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}

	public int compareTo(StudentBean sb) {
		if(sid==sb.sid){
			return 0;
		} else if (sid>sb.sid) {
			return 1;
		}else {
			return -1;
		}
	}
}

public class ComparableEx {
public static void main(String[] args) {
	ArrayList<StudentBean> sal = new ArrayList<>();
	//HashSet<StudentBean> sal= new HashSet<>();
	StudentBean sb1 = new StudentBean(10, "Yaswanth", 28);
	StudentBean sb4 = new StudentBean(40, "Yaswanth", 28);
	StudentBean sb2 = new StudentBean(20, "Krishna", 28);
	StudentBean sb3 = new StudentBean(30, "Venkat", 38);
	sal.add(sb1);//StudentBean@123
	sal.add(sb2);
	sal.add(sb3);
	sal.add(sb4);
	
	System.out.println(sal);
	Collections.sort(sal);
	for (StudentBean studentBean : sal) {
		System.out.println(studentBean.sid+"-------------"+studentBean.sname+"-------------"+studentBean.sage);
	}
}
}
