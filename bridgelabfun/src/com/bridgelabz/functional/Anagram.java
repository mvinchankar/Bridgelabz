package com.bridgelabz.functional;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
/**
 * Driver method to print Anagrams of elements 
 * @param args
 */
	public static void main(String[] args)
	{
		
	 Scanner scanner = new Scanner(System.in);
	 int num , count;
     num = scanner.nextInt();

     int [] a=new int [num];
     int [] b = new int [1000];
	  for (int i = 2; i <= num; i++) 
	  {
	   count = 0;
	   for (int j = 2; j <= i / 2; j++) 
	   {  
	    if (i % j == 0) 
	    {
	     count++;
	     //break;
	    }
	   }
	  

	   if (count == 0) 
	   {
		   int c = 0;
		   //System.out.println(i);
		   b[c++] = i;
		   System.out.println(b[c]);
	   }
	  }
	  for(int i = 0; i < b.length; i++) 
	   {
		   if(b[i] != 0)
		   {
			System.out.println(b[i]);
		    for (int j = i+1; j < b.length; j++) 
		    {
			   if( b[j] != 0)
			   {
				  if (FunctionalUtility.isAnagram(b[i], b[j]))
	              {
	               System.out.println("Anagram of " + b[i] + " is " + b[j]);
	               break;
	              }
				}
		   }
	   }
		   
	 }
	}
}
			
	   
			  
			  

			 
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  


