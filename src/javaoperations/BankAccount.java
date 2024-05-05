package javaoperations;

public class BankAccount {
	private String accountNumber;
	private String ownerName;
	private double balance;
	
	public BankAccount(String accountNumber, String owner, double balance) {
		this.accountNumber = accountNumber;
		this.ownerName = owner;
		this.balance = balance;
	}
	
	// Getters
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(int amount) {
		if(amount>0) {
			this.balance += amount;
			System.out.println(amount + " deposited successfully");
		}
		else {
			System.out.println("Please enter a valid amount.");
		}
	}
	
	public void withdraw(int amount) {
		if(balance>0 && amount>0) {
			balance -= amount;
			System.out.println(amount+  " withdrawn successfully.");
		}
		else {
			System.out.println("Insufficient funds or Invalid amount");
		}
	}
	
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("6436", "Arwa", 5000);
		System.out.println("Current Balance for " + b1.getOwnerName() + ": " + b1.getBalance());
		b1.deposit(200);
		b1.withdraw(600);
		System.out.println("Current Balance for " + b1.getOwnerName() + ": " + b1.getBalance());

		
	}
	

}
