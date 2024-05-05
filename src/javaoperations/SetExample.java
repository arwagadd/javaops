package javaoperations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	// TreeMap is the same as HashMap but it sorted.
	public static void getFrequency(int[] arr) {
		HashMap<Integer,Integer> hmap = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			Integer c = hmap.get(arr[i]);
			if(c==null) {
				hmap.put(arr[i], 1);
			}
			else {
				hmap.put(arr[i], ++c);
			}
		}
		
		for(Map.Entry m : hmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
		
		
	}
	
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("Arwa");
		s1.add("Marc");
		s1.add("Arwa");
		s1.add("Jana");
		System.out.println("Set 1 " + s1);
		
		Set<String> s2 = new HashSet<>();
		s2.add("Aseel");
		s2.add("Arwa");
		s2.add("Jana");
		System.out.println("Set 2 " + s2);
		
		// Union
		s2.addAll(s1);
		System.out.println("Union of Set 1 and 2 " + s2);
		
		// Intersection
		Set<Integer> setNum1  = new HashSet<Integer>();
		setNum1.add(1);
		setNum1.add(4);
		setNum1.add(8);
		
		Set<Integer> setNum2  = new HashSet<Integer>();
		setNum2.add(7);
		setNum2.add(1);
		setNum2.add(4);
		
		setNum1.retainAll(setNum2);
		System.out.println("Intersection is " + setNum1);
		
		// Difference
		Set<String> standard  = new HashSet<String>();
		standard.add("Arwa");
		standard.add("Marc");
		standard.add("Jana");
		
		Set<String> setNum3  = new HashSet<String>();
		setNum3.add("Arwa");
		setNum3.add("Marc");
		setNum3.add("Jana");
		
		Set<String> setNum4  = new HashSet<String>();
		setNum4.add("Aseel");
		setNum4.add("Arwa");
		setNum4.add("Jana");
		
		setNum3.removeAll(setNum4);
		setNum4.removeAll(standard);
		setNum3.addAll(setNum4);
		System.out.println("Difference is " + setNum3);
		
		int count = 0;
		for(String item : setNum3) {
			count++;
		}
		System.out.println("Number of items in " + setNum3 +" is " + count);
		
		
		// TreeSet 
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		
		treeSet.remove(2);
		
		boolean contains = treeSet.contains(1);
		System.out.println(contains);
		System.out.println(treeSet);
		
		// Iterating over treeSet
		for(Integer s : treeSet)
			System.out.println(s);
		
		// HashSet/TreeSet with Custom Objects
		Professor p1 = new Professor();
		p1.setName("Soubra");
		Professor p2 = new Professor();
		p2.setName("Malak");
		HashSet<Professor> peopleHashSet = new HashSet<>();
		peopleHashSet.add(p1);
		peopleHashSet.add(p2);
		
		for(Professor p : peopleHashSet)
			System.out.println("Professor " + p.getName());	
		
		int[] arr = {2,1,8,9,9,1};
		getFrequency(arr);
		
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		 
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
 
        int valueA = hashtable.get("A");
        System.out.println("Value of A: " + valueA);
 
        hashtable.remove("B");
        System.out.println(hashtable);
	}

}
