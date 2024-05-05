package javaoperations;

import java.util.LinkedList;

public class LinkedListExample {
	
	private LinkedList<Integer> stack;
	
	public LinkedListExample() {
		stack = new LinkedList<>();
	}
	
	// Using LinkedList as Stack
	public void push(int element) {
		stack.addFirst(element);
	}
	public int pop() {
		return stack.removeFirst();
	}
	// get peek element
	public int peek(){
		 return stack.peekFirst();
	}
	
	public int getSize() {
		return stack.size();
	}
	public LinkedList getElements() {
		LinkedList ll = new LinkedList();
		for(int i=0;i<stack.size();i++) {
			ll.add(stack.get(i));
		}
		return ll;
	}
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(3);
		l.add(5);
		l.add(1, 20);
		System.out.println(l);
		l.remove(Integer.valueOf(20));
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
//		l.clear();
//		System.out.println(l);
		
		for(int i=0;i<l.size();i++) {
			l.set(i,l.get(i)*2 );
		}
		System.out.println(l);
		
		
		LinkedListExample list = new LinkedListExample();
		
		list.push(8);
		list.push(9);
		list.push(10);
		
		System.out.println(list.getElements());
		
		System.out.println(list.peek());
		list.pop();
		System.out.println(list.getElements());
		
		LinkedList<Object> mix = new LinkedList<>();
		mix.add("Arwa");
		mix.add(22);
		System.out.println(mix);




		
	}

}
