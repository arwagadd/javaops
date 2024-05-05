package javaoperations;

import java.util.Scanner;

public class Car extends Vehicle{
	private static int totalCars; // static variable so it's shared among all instances created of Car
	private String model; // non-static variable so I can create multiple models of a Car
	private double speed;
	
	public Car(String model, double speed) {
		this.model = model;
		totalCars++; 
		this.speed = speed;
	}
	
	// static because i don't need to create an instance of Car in order to get total number of cars
	public static int getTotalCars() {
		return totalCars;
	}
	
	// non-static because i want to create multiple Car models
	public String getModel() {
		return model;
	}
	
	// non-static because i want to set the speed of each instance of Car i created
	public double getSpeed() {
		return speed;
	}
	
	// calculate the distance based on time
	public double getDistance(double time) {
		double distance = this.speed * time;
		return distance;
	}
	
	public boolean isMoving() {
		return this.speed > 0;
	}
	
	public static void main(String args[]) {
		Car car1 = new Car("BMW", 2.4);
		Car car2 = new Car("Porsche" , 0);
		
		System.out.println("Car 1 --> " + "Model: " + car1.getModel() + ", " + "Speed: " + car1.getSpeed() + " " + "m/s" + ", " + "Distance: " + car1.getDistance(10) + ", " +  "Moving: " + car1.isMoving());
		System.out.println("Car 2 --> " + "Model: " + car2.getModel() + ", " + "Speed: " + car2.getSpeed() + " " + "m/s" + ", " + "Distance: " + car2.getDistance(2) + ", " + "Moving: " + car2.isMoving());
		
		System.out.println("Total number of cars: " + Car.getTotalCars() );
		
		
		// Some char operations 
		char a = 'A';
		char b = 'B';
		boolean resultChar = (a>b);
		int asciivalue = (int) a;
		System.out.println(asciivalue);
		Character.toString(b);
		String x = Character.toString(b);
		System.out.println(x);
		System.out.println(resultChar);
		System.out.println(Character.isDigit(a));
		
		
		// Creating scanner input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you name");
		String name = scanner.nextLine();
		
		System.out.print("Enter your age");
		int age = scanner.nextInt();
		
		System.out.println("Name: " + name + " " + "Age: " + age);
		
	}

	@Override
	public void makeSound() {
		System.out.println("Car makes sound");
		
	}

}
