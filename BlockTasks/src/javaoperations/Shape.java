package javaoperations;

public abstract class Shape {
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
//	public abstract void displayInfo();
	
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		Rectangle rect = new Rectangle(2,3);
		circle.calculateArea();
		circle.calculatePerimeter();
		System.out.println("Circle's area is " + circle.calculateArea() + " and Perimeter is " + circle.calculatePerimeter());
		System.out.println("Rectangle's area is " + rect.calculateArea() + " and Perimeter is " + rect.calculatePerimeter());
	}
}
