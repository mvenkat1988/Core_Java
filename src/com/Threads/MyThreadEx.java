package com.Threads;

/*class Thread{
	public void start(){
		run();
	}	
}
*/

class ThreadEx extends Thread {
	public void getValue() {
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
	}
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
	}
	}
public class MyThreadEx {
public static void main(String[] args) {
	ThreadEx t = new ThreadEx();//3// new State
	t.start();
	//t.run();
	ThreadEx t1 = new ThreadEx();
	t1.start();
	//t.run();
	/*ThreadEx t1 = new ThreadEx();//3
	t1.start();*/
	//t.run();
	//System.out.println("------------");
	
	
}
}
