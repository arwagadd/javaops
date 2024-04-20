package javaoperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ArraysOperations {
	
	public static int[] removeDuplicates(int[] array) {
		// Convert the array to a list
		List<Integer> list = new ArrayList<>();
		for(int num : array) {
			list.add(num);
		}
		
		// Concert the list to a Set (doesn't allow duplicates)
		Set<Integer> set = new HashSet<>(list);
		
		// Convert the set back to array
		int[] result = new int[set.size()];
		int i=0;
		for(int num : set) {
			result[i++] = num;
		}
		return result;
		
	}
	public static int[] rotateElementsRight(int[] arr) {
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=arr[i];
		}
		for(int i=1;i<res.length;i++) {
			res[i]=arr[i-1];
		}
		res[0]=arr[arr.length-1];
		return res;
	}
	public static int findMissingNumber(int[] array) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<array.length-1;i++) {
			list.add(array[i+1]-array[i]);
//			System.out.println("Elements of the list " + list.get(i));
		}
		Map<Integer,Integer> countMap = new HashMap<>();
		for(int num : list) {
			int currentCount = countMap.getOrDefault(num, 0);
			int newCount = currentCount+1;
			countMap.put(num, newCount);
		}
//		for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//			System.out.println("Key: " + entry.getKey() + "\n" + "Value: " + entry.getValue());
//		}
//		
		int missingNumber = 0;
		int count = 0;
		for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if(entry.getValue()!=1)
				count = entry.getKey();
		}
//		System.out.println(count);
		// Find element with only one occurrence
		for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == 1) {
                for(int i=0;i<array.length-1;i++) {
                	if(array[i+1] - array[i] == entry.getKey()) {
                		 missingNumber =  array[i] + count;
                	}
                }
            }
		}
		return missingNumber;
		
	}
	
	public static List<Integer> findCommonElements(int[] arr1, int[] arr2){
		Set<Integer> commonElements = new HashSet<>();
		
		Set<Integer> set = new HashSet<>();
		for(int num : arr1) {
			set.add(num);
		}
		for(int num : arr2) {
			if(set.contains(num)) {
				commonElements.add(num);
			}
		}
		return new ArrayList<Integer>(commonElements);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter the elements of the array.");
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("Array without duplicates");
		int[] uniqueElements = removeDuplicates(array);		
		for(int num : uniqueElements) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.println("Rotated Elements to the Right");
		int[] rotatedElementsRight = rotateElementsRight(array);
		for(int n : rotatedElementsRight) {
			System.out.print(n + " ");
		}
		
		System.out.println("Missing number is " + findMissingNumber(array));
		
		
		int[] arr1 = {1,2,3,4,6};
		int[] arr2 = {2,6,3};
		
		List<Integer> res = findCommonElements(arr1,arr2);
		for(int n : res) {
			System.out.print(n + " ");
		}
	}
}

	
