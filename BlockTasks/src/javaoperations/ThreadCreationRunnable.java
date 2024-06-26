package javaoperations;

public class ThreadCreationRunnable implements Runnable {
	public void run() {
		try {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<8;i++) {
			Thread obj = new Thread(new ThreadCreationRunnable());
			obj.start();
		}
	}
}
