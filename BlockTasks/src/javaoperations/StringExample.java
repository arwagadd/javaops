package javaoperations;

import java.util.Arrays;
import java.util.regex.*;

public class StringExample {
	
	int vowelCount ;

	public int countVowel(String str) {
		// Count vowels and consonants
		for(int i=0; i< str.length();i++) {
			char c = str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelCount++;
			}
		}
		return vowelCount;
	}
	
	public String joinWithDelimiter(String[] words, String delimiter) {
		return String.join(delimiter, words);
	}
	
	
	// Array Initialization and Sum
	public static int sumArray(int[] array){
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static int[] bubbleSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	
	private static int linearSearch(int[] x, int val) {
		for(int i=0;i<x.length;i++) {
			if(x[i] == val)
				return i;
		}
		return -1;
	}
	
	public static int removeDuplicates(int[] array) {
		
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(i==j) {
					continue;
				}
				if(array[i] == array[j]) {

					count++;
				}
			}
		}
		return count/2;
	}
	
	public static void main(String[] args) {
		
		int[] x = {2,8,5,3,9,4,1};
		int [] y = {1,2,2,2};
		System.out.println(removeDuplicates(y));
		int a1 = linearSearch(x,4);
		System.out.println(a1);
		int[] sortedArray = StringExample.bubbleSort(x);
		
		for(int i=0;i<sortedArray.length;i++) {
			System.out.print(sortedArray[i] + " ");
		}
		System.out.println();
		System.out.println(StringExample.sumArray(x));
		String phrase = "My name is Arwaa";
		String toReplace = "Arwaa";
		
		String replacedText = phrase.replaceAll(toReplace, "Yara");
		System.out.println(replacedText);
		
	
		Pattern pattern = Pattern.compile("Arwa", Pattern.CASE_INSENSITIVE);
		Matcher match = pattern.matcher("arwa");
		Boolean res = match.find();
		System.out.println(res);
		
		StringExample st = new StringExample();
		String[] wordss = {"java","delimiter"};
		String de = "-";
		System.out.println(st.joinWithDelimiter(wordss, de));		
		String myName = "Arwa";
		String myName1 = "arwa";
		System.out.println(myName.equals(myName1));
		System.out.println(myName.equalsIgnoreCase(myName1));
		String words[] = phrase.split(" ");
		System.out.println(myName.substring(1,3));
		int n = 10;
		System.out.println(Arrays.toString(words));
		System.out.println(phrase);
		System.out.println(n);
		
		int a = 2;
		Integer b = a;
		int c = 4;
		Integer d = c;
		System.out.println(b.compareTo(d));
		
		// StringBuilder and StringBuffer to reverse a String
		StringBuilder reversedString = new StringBuilder(myName);
		StringBuilder reversed = reversedString.reverse();
		System.out.println(reversed);
		
//		StringBuffer reversedBuffer = new StringBuffer(myName1);
//		StringBuffer reversedB = reversedBuffer.reverse();
//		System.out.println(reversedB);
//		System.out.println("Vowel count: " + st.countVowel(myName1));
		
	
	
	}



}
