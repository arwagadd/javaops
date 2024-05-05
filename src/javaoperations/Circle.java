package javaoperations;

public class Circle extends Shape {
	private double radius;
	
	public Circle(int r) {
		this.radius = r;
	}
	public void setRadius(int r) {
		this.radius = r;
	}
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	
	
}
