package com.bridgelabz.functional;
import java.util.Arrays;
import java.util.Scanner;

public class Coupongenerator {

		
	
	
	
	public static void main(String[] args) {
		    int numberofiterations,count = 0;
			System.out.println("Enter the number of coupons you want to generate :");
			numberofiterations = Utility.integerScanner();
		    int [] a = new int[numberofiterations];
		    double[] c = new double[numberofiterations];
		    int []b = new int[numberofiterations];
		    Utility.functionGenerator(numberofiterations, a,count);
      
	      }

        
	
}
