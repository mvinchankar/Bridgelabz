package com.bridgelabz.algorithmprograms;
/**
 * 
 * @author admin1
 *
 */
public class AnagramandPalindrome {

	/**
	 * This main method is to test AnagramPalindrome class
	 * @param args0 = Range  
	 */
	public static void main(String[] args) {
		
	   System.out.println("Series of number :");
	   //Enter the range  of Prime Number Series
       int range = Utility.integerScanner();
       if(range==0)
       {
    	   System.out.println("Enter the valid Range!!");
    	   range = Utility.integerScanner();
       }
       //Copy the elements to array[] from printAnagram method
       int [] array = Utility.printAnagram(range);
       System.out.println("Prime numbers are :");
       int [] prime = Utility.Prime(range);
       for (int i = 0; i < prime.length; i++) 
       {
		if(prime[i]!=0)
			System.out.println(prime[i]);
       }
       //To find Palindrome 
       System.out.println("Palindrome in Prime Numbers are :");
       Utility.isPalindrome(range);
       //To find Anagrams
	   System.out.println("Anagrams are :");
	   for (int i = 0; i < prime.length; i++)
		 if(array[i]!=0)
		  System.out.println(array[i]);
	
	  
	
	}
	  
	
}
	