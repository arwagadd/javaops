package javaoperations;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	

	public static Iterator<Integer> getIteratorForVector(Vector v){
		return v.iterator();
	}
		
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		v1.add(22);
		v1.add(50);
		System.out.println("Element at position 0: " + v1.get(0));
		v1.set(0,44);
		System.out.println("Updated element at position 0: " + v1.get(0));
		v1.remove(0);
		v1.add(29);
		v1.add(33);
		
		Iterator<Integer> iterator = getIteratorForVector(v1);
		
		while(iterator.hasNext()) {
			int e = iterator.next();
			System.out.print(e + " ");
		}
		
		while(!v1.isEmpty()) {
			int poppedElement = v1.get(v1.size()-1);
			v1.removeElementAt(v1.size()-1);
			System.out.println();
			System.out.println("Popped element: " + poppedElement); // popping like the stack
		}
	}
}
