package com;

abstract class Animal{
	public void getEyes() {
		System.out.println("Both are having two eyes");
	}

	public void getTail() {
		System.out.println("Both are having one Tail");
	}


	public void getLeggs() {
		System.out.println("Both are having 4 leggs");
	}
	abstract public void getPet();
	abstract public void getEats();

}

class Cat extends Animal{

	@Override
	public void getPet() {
		System.out.println("it is pet Animal");
	}

	@Override
	public void getEats() {
		System.out.println(" it will eates Rates");
	}
}

class Tiger extends Animal{

	@Override
	public void getPet() {
		System.out.println("it is un-pet Animal");
		}

	@Override
	public void getEats() {
		System.out.println("it will eates any Anmial....");
		}
	
}

public class AbstractEx {
public static void main(String[] args) {
	Cat cat  = new Cat();//3
	cat.getEats();
	cat.getLeggs();
	cat.getPet();
	cat.getTail();
	cat.getEyes();
	
	Tiger t = new Tiger();
	t.getEats();
	t.getLeggs();
	t.getPet();
	t.getTail();
	t.getEyes();
	
}
}
