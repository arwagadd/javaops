package javaoperations;

public abstract class Person {
	private int age;
	private String name;
	private Gender gender;
	private String position;
	
	public Person() {
		
	}
	
	// Setters
	public void setAge(int x) {
		this.age=x;
	}
	public void setName(String n) {
		this.name=n;
	}
	public void setGender(Gender g) {
		this.gender=g;
	}
	public void setPosition(String p) {
		this.position = p;
	}
	
	// Getters
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public Gender getGender() {
		return this.gender;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public abstract void displayInfo();
	public abstract double calculateBonus();
	
}
