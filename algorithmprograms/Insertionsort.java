package com.bridgelabz.algorithmprograms;

public class Insertionsort {

	public static void main(String[] args) {
		System.out.println("Enter the size :");
		int size = Utility.integerScanner();
		String []string = new String[size];
		System.out.println("Enter the elements in List :");
		for (int i = 0; i < string.length; i++) {
			string[i] = Utility.stringScanner();
		}
		String [] str = Utility.insertionsortString(string, size);
		System.out.println("Sorted elements are :" );
        for (int i = 0; i < str.length; i++) 
        {
	        System.out.println( str[i]);
        }
	}

}
