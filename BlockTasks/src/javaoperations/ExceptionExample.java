package javaoperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample {
	
	void m(){  
		int data=50/0;  
	}  
	void n(){  
		    m();  
	}  
	void p(){  
		try{  
		   n();  
		   }
		catch(Exception e){
			   System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally statement"); //Finally Block always executes whether the Exception is thrown or not
		}
	}
	
	void s() {
		try(Scanner scanner = new Scanner("test.txt")){
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine()); 
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	void multipleCatchBlocks() {
		try {
			int a[] = new int[5];
			a[5] = 30/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	int age = 12;
	void validateAge() throws InvalidAgeException {
		if( age < 18)
			throw new InvalidAgeException("Age below 18"); // custom exception is checked because it extends Exception class not RuntimeException class
	}
	
	
	
	public static void main(String args[]) throws IOException, InvalidAgeException{  
		ExceptionExample obj = new ExceptionExample();  
		obj.p();  
		System.out.println("normal flow");  
		obj.s();
		obj.multipleCatchBlocks();
		obj.validateAge();
//		
//		FileReader file = new FileReader("C:\\test\\a.txt");
//		BufferedReader inputt = new BufferedReader(file);
//		
//		for(int i=0;i<3;i++) {
//			System.out.println(inputt.readLine());
//		}
//		inputt.close();
	}  

}
