package javaoperations;

public class ThreadCreationExample extends Thread {
	
	int amount = 10000;
	
	public void withdraw(int n) {
		System.out.println("Going to withdraw...");
		try {
			System.out.println("Insufficient balance. Waiting for deposit...");
			wait();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		this.amount-=n;
		System.out.println("Amount after withdrawal: " + amount);
	}
	public void deposit(int n) {
		System.out.println("Going to deposit...");
		this.amount += n;
		System.out.println("Amount after deposit: " + amount);
		notify();
	}
	
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	}
	
	public static void main(String[] args) {
//		for(int i=0;i<8;i++) {
//			ThreadCreationExample obj = new ThreadCreationExample(); 	// The OS does the thread scheduling
//			obj.start();
//		}
		ThreadCreationExample e = new ThreadCreationExample();
		Thread withdrawalThread = new Thread( ()-> e.withdraw(15000) );
		withdrawalThread.start();
		
		Thread depositThread = new Thread( () -> e.deposit(10000) );
		depositThread.start();
	}
}
