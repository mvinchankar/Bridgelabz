package com.bridgelabz.datastructures;

import com.bridgelabz.algorithmprograms.Utility;

public class StackPrimeNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter the range of Prime Number :");
		int number = Utility.integerScanner();
		stackgeneric stack =new stackgeneric();
			int[] anagrams= Utility.printAnagram(number);
			for (int i = 0; i < anagrams.length; i++) 
			{
			if (anagrams[i]!=0) 
			{
			
			stack.push(anagrams[i]);
			}
			}
			
			Utility.printAnagram(number);
			System.out.println("--------------------");
			for (int i = 0; i < anagrams.length-2; i++) {
			if(!stack.isEmpty())
			System.out.println(stack.pop());
			}
	}
    
}

