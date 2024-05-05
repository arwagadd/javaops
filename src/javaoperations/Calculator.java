package javaoperations;

public class Calculator {
	
	// Method Overloading
	public int add(int a, int b) {
		return a + b;
	}
	public int add(int a) {
		return a + 5;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int res1 = calc.add(4,4);
		System.out.println(res1);
		int res2 = calc.add(5);
		System.out.println(res2);
	}

}
