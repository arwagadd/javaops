package javaoperations;

import java.util.Stack;

public class StackExample {
	
	// Reverse a String using Stack
	public void reverseString(String str) {
		System.out.println("String: " + str);
		int length = str.length();
		Stack<Character> s = new Stack<>();

		for(int i=0;i<length;i++) {
			s.push(str.charAt(i));
		}
		StringBuilder reversedString = new StringBuilder();
		
		while(!s.isEmpty()) {
			reversedString.append(s.pop());
		}
		String finalString = reversedString.toString();
		System.out.println("Reversed String: " + finalString);
	}
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		
		System.out.println(s1);
		while(!s1.isEmpty()) {
			int x = s1.pop();
			System.out.println("Popped element: " + x);
		}
		StackExample e = new StackExample();
		e.reverseString("Arwa");
		
	
	}
}
