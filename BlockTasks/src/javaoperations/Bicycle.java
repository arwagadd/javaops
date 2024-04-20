package javaoperations;

public class Bicycle extends Vehicle {
	// No need to define any constructors explicitly
    // Java will provide a default constructor that calls the empty constructor of Vehicle
	
	private int numberOfGears;
	
	public int getNumberOfGears() {
		return numberOfGears;
	}
	public void setNumberOfGears(int g) {
		numberOfGears = g;
	}
	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
//		Bicycle b2 = new Vehicle(); // cannot assign an instance of a superclass to a reference variable of a subclass
		Vehicle v2 = new Bicycle(); // a Bicycle is a vehicle (Upcasting)
		Bicycle b3 = (Bicycle) v2; // Downcasting: casting a vehicle into a bicycle
		b1.setNumberOfGears(2);
		
		b1.setBrand("Porsche");
		
//		b1.brand = "B11" // not accessible because brand is private 
		System.out.println("Bicycle 1: " + b1.getNumberOfGears() + " " + b1.getBrand());
	}
	@Override
	public void makeSound() {
	
	}
	
}
