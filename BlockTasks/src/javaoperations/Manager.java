package javaoperations;

public class Manager extends Employee {
	
	private String department;

	public Manager(String name, String employeeId, double salary, String d) {
		super(name, employeeId, salary);
		this.department = d;
	}
	
	 public String getDepartment() {
	        return department;
	    }

     public void setDepartment(String department) {
	        this.department = department;
	    }
     
     // override the method in Employee since managers get a higher bonus 
     public double calculateBonus() {
    	 return this.getSalary() * 0.15; 
     }
	
}
