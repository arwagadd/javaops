package javaoperations;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public void setLength(double l) {
		this.length = l;
	}
	public void setWidth(double w) {
		this.width = w;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	@Override
	public double calculateArea() {
		return length * width;
	}
	@Override
	public double calculatePerimeter() {
		return (2 * length) + (2 * width);
	}
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}
	

}
