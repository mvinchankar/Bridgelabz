package com.bridgelabz.algorithmprograms;

public class AnagramandPalindrome {

	
	public static void main(String[] args) {
		
	   System.out.println("Series of number :");
       int number = Utility.integerScanner();
       
       System.out.println("Prime numbers are :");
       Utility.isPrime(number);
       
       System.out.println("Palindrome in Prime Numbers are :");
       
	   Utility.isPalindrome(number);
	   
	   Utility.printAnagram(number); 
	}
}
	