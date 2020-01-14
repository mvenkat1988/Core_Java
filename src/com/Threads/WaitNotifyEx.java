package com.Threads;

class WaitNotifyImpl  {
synchronized public void getWait() throws InterruptedException {
		wait();
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread()+"---getWait-->"+i);
			//Thread.sleep(1000);

		}
	}
synchronized public void getWait1() throws InterruptedException {
	wait();
	for (int i = 1; i <= 10; i++) {
		System.out.println(Thread.currentThread()+"---getWait-->"+i);
		//Thread.sleep(1000);

	}
}
synchronized public void getNotify() {
	System.out.println(Thread.currentThread()+"---getNotify-->");
		//notify();
		notifyAll();
	}
}

public class WaitNotifyEx {
	public static void main(String[] args)  {
		WaitNotifyImpl tm = new WaitNotifyImpl();
		
		WaitNotifyImpl tm1 = new WaitNotifyImpl();
	
		
		Thread t1 = new Thread() 
	     {
	         @Override
	         public void run(){
	             try {
	            	 tm.getWait();
	            	 tm1.getWait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	         }
	     };
	     t1.start();
	     
	     Thread t2 = new Thread() 
	     {
	         @Override
	         public void run(){
	        	// tm1.getNotify();
	             tm.getNotify();
	         }
	     };

	     t2.start();
	}
}
