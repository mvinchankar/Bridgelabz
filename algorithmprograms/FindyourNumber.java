package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class FindyourNumber {

	public static void findYourNUmber(int low,int n) { 
		int mid = (low +n)/2;
	    System.out.println("IS your number less than :" +mid);
	    System.out.println("Enter 1 for Yes and 0 for No :");
	  
          Scanner scan  = new Scanner(System.in);
          //boolean ch = scan.hasNext();
          int ch =Utility.integerScanner();
          if(low == n)
          {
        	System.out.println("Your NUmber is :" + low);  
        	return;
          }
        	 
			if(ch ==1)
			{
			// n = mid;
				findYourNUmber(low,mid);
				
			}
			else
			{
				//low = mid +1;
				findYourNUmber(mid+1,n); 
			}
			}
			//findYourNUmber(mid, n, low);

	
	
	
	public static void main(String[] args) {
		
        int low = 0;
		System.out.println("Enter the range :");
		int n = Integer.parseInt(args[0]);
		//int number = (int)Math.pow(2, n);
		//int mid =(low+n)/2;
		//System.out.println("guess your number btween 0 to"+n);
		//int flagd = Utility.integerScanner();
		FindyourNumber f = new FindyourNumber();
		findYourNUmber(low,n);
		
		
	}

}
