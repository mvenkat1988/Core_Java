package com;

interface CalAdd {
	public void add();
}

/*class CalAddimpl implements CalAdd{
	
}*/
interface CalSub extends CalAdd {
	abstract public void sub();
}

interface CalMul {
	abstract public void mul();

}

class A123 {
	public void getSMS() {
		System.out.println("hi............");
	}
}

class CalcateIML extends A123 implements CalSub, CalMul {

	@Override
	public void add() {
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println(k);
	}

	@Override
	public void sub() {
		int i = 10;
		int j = 20;
		int k = i - j;
		System.out.println(k);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub

	}

}

public class InterFacesEx {
	public static void main(String[] args) {
		CalcateIML obj = new CalcateIML();//
		obj.add();
		int i = 0;
		System.out.println(i);// 0
		i = 10;
		System.out.println(i);// 10
		CalAdd obj1 = null;
		System.out.println(obj1);
		obj1 = new CalcateIML();
		System.out.println(obj1.toString());// obj1.toString()//com.CalcateIML@123

	}
}
