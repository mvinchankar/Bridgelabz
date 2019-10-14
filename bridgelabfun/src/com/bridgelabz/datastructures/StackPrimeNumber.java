package com.bridgelabz.datastructures;
import com.bridgelabz.algorithmprograms.Utility;
public class StackPrimeNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter the range of Prime Number :");
		int number = Utility.integerScanner();
		StackGeneric stack =new StackGeneric();
			int[] anagrams= Utility.printAnagram(number);
			for (int i = 0; i < anagrams.length; i++) 
			{
			if (anagrams[i]!=0) 
			{
			/*
			 * adding element to stack if it is anagram
			 */
			stack.push(anagrams[i]);                       
			}
			}
			/*
			 *printAnagram method to print the Anagrams of numbers 
			 */
			Utility.printAnagram(number);
			System.out.println("--------------------");
			for (int i = 0; i < anagrams.length-2; i++) {
			if(!stack.isEmpty())
			System.out.println(stack.pop());               
			}
	}
    
}
