package javaoperations;

import java.io.Serializable;
import java.util.ArrayList;

public class Professor extends Person implements Serializable{

	
	private ArrayList<String> courses;
	
	public void setCourses(ArrayList<String> c) {
		this.courses = c;
	}
	public ArrayList<String> getCourses(){
		return this.courses;
	}
	
	
	@Override
	public void displayInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Gender: " + getGender());
		System.out.println("Position: " + getPosition());
		System.out.println("Courses taught by " + getName() + ": " + getCourses());

	}
	
	public static void main(String[] args) {
		Professor p1 = new Professor();
		p1.setName("Soubra");
		p1.setAge(43);
		p1.setPosition("Professor");
		
		ArrayList<String> courseList = new ArrayList<>();
		courseList.add("Operating Systems");
		courseList.add("Computer Architecture");
		p1.setGender(Gender.MALE);
		p1.setCourses(courseList);
		p1.displayInfo();
		
	}
	@Override
	public double calculateBonus() {
		return 0;
	}


	
}
