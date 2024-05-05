package javaoperations;

public class SynchronizedMethod {
	int balance = 10000;
	
	public synchronized void withdraw(int n) {
		if (n>this.balance) {
			System.out.println("Insufficient balance. Please deposit first");
		}
		else
			System.out.println("going to withdraw " + n);
			this.balance-=n;
	}
	public void deposit(int n) {
		synchronized(this) {
			this.balance+=n;
		}
		System.out.println("going to deposit " + n);
		
	}
	public int getBalance() {
		return this.balance;
	}
	
	public static void main(String[] args) throws InterruptedException {
		SynchronizedMethod obj = new SynchronizedMethod();
		Thread withdrawThread  = new Thread (() -> obj.withdraw(2000) );
		Thread depositThread = new Thread (()-> obj.deposit(410) );
		withdrawThread.start();
		depositThread.start();
		
	    withdrawThread.join(); // Wait for withdraw thread to finish
	    depositThread.join(); // Wait for deposit thread to finish
	    
		System.out.println("Final balance: " + obj.getBalance());
	}
	


}
