package javaoperations;

public class DeadlockExample {
	
	
	public static void main(String[] args ) {
		
		final String resource1  = "r1";
		final String resource2  = "r2";
		
		Thread t1 = new Thread () {
			public void run() {
				synchronized(resource1) {
					System.out.println("Thread 1 locked resource1");
				}
				try {
					Thread.sleep(100);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				synchronized(resource2) {
					System.out.println("Thread 1 locked resource2");
				}
			}
		};
		
		Thread t2 = new Thread () {
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread 2 locked resource2");
				}
				try {
					Thread.sleep(100);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				synchronized(resource1) {
					System.out.println("Thread 2 locked resource1");
				}
			}
		};
		
		t1.start();
		t2.start();
		
		// Avoid deadlock by allowing both threads to acquire the locks in same order
		
	}
}
