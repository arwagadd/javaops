package javaoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		
		for(int i=0;i<6;i++) {
			a1.add(i);
		}
		System.out.println(a1);
		
	    Collection<String> c = Arrays.asList("apple", "banana", "orange");
	    ArrayList<String> arr = new ArrayList<>(c);
	    
	    System.out.println(arr);
	    if(a1.isEmpty())
	    	System.out.println("ArrayList a1 is empty");
	    else
	    	System.out.println("ArrayList a1 is not empty");
	    
	    
	    a1.add(1, 22);
	    System.out.println("Updated ArrayList a1: " + a1);
	    
	    a1.remove(0);
	    System.out.println("ArrayList a1 after removing: " + a1);
	    
	    System.out.println("Index 0 of ArrayList a1: " + a1.get(0));
	    
	    System.out.println("Index of 22: " + a1.indexOf(22));
	    
	    ArrayList<Object> mix = new ArrayList<>();
	    mix.add("Arwa");
	    mix.add(22);

	    System.out.println(mix.get(0));
	    System.out.println("Mix elements: " + mix);
	    
	    // ArrayList of Vectors
	    ArrayList<Vector<Integer>> listOfVectors = new ArrayList<>();
	    
	    Vector<Integer> v1 = new Vector<>();
	    v1.add(1);
	    v1.add(3);
	    v1.add(5);
	    
	    Vector<Integer> v2 = new Vector<>();
	    v2.add(2);
	    v2.add(4);
	    v2.add(6);
	    
	    listOfVectors.add(v1);
	    listOfVectors.add(v2);
	    System.out.println(listOfVectors);
	    }
	



}
