package javaoperations;

public class Student extends Person {
	
	private int studentID;
	
	public void setStudentID(int id) {
		this.studentID = id; 
	}
	public int getStudentID() {
		return studentID;
	}


	@Override
	public void displayInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Gender: " + getGender());
		System.out.println("Position: " + getPosition());
		System.out.println("ID: " + getStudentID());
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Arwa");
		s1.setAge(22);
		s1.setGender(Gender.FEMALE);
		s1.setPosition("Student");
		s1.setStudentID(6436);
		s1.displayInfo();
	}
	@Override
	public double calculateBonus() {
		return 0;
	}

}
