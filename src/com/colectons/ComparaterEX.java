package com.colectons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentBeanEX {
	int sid;
	String sname;
	int sage;
	ArrayList al;
	/* ArrayList al2; */

	StudentBeanEX(int sid, String sname, int sage, ArrayList al) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.al = al;
	}
}
class StudentAgeSorting implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		StudentBeanEX st1=(StudentBeanEX)obj1;//sal
		StudentBeanEX st2=(StudentBeanEX)obj2;
		if(st1.sage==st2.sage){
			return 0;
		} else if (st1.sage>st2.sage) {
			return 1;
		}else {
			return -1;
		}
	
	}

}
class StudentNameSorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		StudentBeanEX st1 = (StudentBeanEX) o1;// sal
		StudentBeanEX st2 = (StudentBeanEX) o2;
		System.out.println(st1.sname + "----------" + st2.sname);
		return st1.sname.compareTo(st2.sname);
	}

}

public class ComparaterEX {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add("MCA");
		al.add("MBA");
		al.add("B.Tech");
		System.out.println(al);//10,20,30
		ArrayList<StudentBeanEX> sal = new ArrayList<>();
		StudentBeanEX sb1 = new StudentBeanEX(10, "Yaswanth", 29,al);//10,20,30
		StudentBeanEX sb4 = new StudentBeanEX(40, "Yaswanth", 27,al);//10,20,30
		StudentBeanEX sb2 = new StudentBeanEX(20, "Krishna", 28,al);//10,20,30
		StudentBeanEX sb3 = new StudentBeanEX(30, "Venkat", 30,al);//10,20,30
		sal.add(sb1);// StudentBean@123
		sal.add(sb2);
		sal.add(sb3);
		sal.add(sb4);
		// Collections.sort(sal,new StudentNameSorting());
		Collections.sort(sal, new StudentAgeSorting());
		for (StudentBeanEX studentBean : sal) {
			System.out.println(
					studentBean.sid + "-------------" + studentBean.sname + "-------------" + studentBean.sage+ "-------------" + studentBean.al);
		}
	}
}
