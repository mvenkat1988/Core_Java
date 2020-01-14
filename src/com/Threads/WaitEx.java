package com.Threads;

class PNBCustomer {
	int amount = 9000;

	public synchronized void withdraw(int amount) {
		System.out.println("withdrawing...");

		if (this.amount < amount) {
			System.out.println("Amount is not enough; waiting + " + amount);
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("after deposit, balance is available: " + this.amount);
		this.amount -= amount;
		System.out.println("withdraw completed...");
		System.out.println("after Withdraw, balance is available: " + this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}

public class WaitEx {
	public static void main(String args[]) {
		PNBCustomer c = new PNBCustomer();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				c.withdraw(15000);
			}
		};
		t1.start();
		new Thread() {
			@Override
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}
