package com.Threads;

class ThreadSyncEx extends Thread{
	synchronized public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread() + "-----" + i);
		}
		getValues();
	}

	 private void getValues() {
		  synchronized (this) { 
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread() + "-----" + i);
				}
				} 
	}
}


public class SynchronizedEx {
	public static void main(String[] args) {
		ThreadSyncEx t0 = new ThreadSyncEx();
		t0.start();
		ThreadSyncEx t1 = new ThreadSyncEx();
		t1.start();
	}
}
