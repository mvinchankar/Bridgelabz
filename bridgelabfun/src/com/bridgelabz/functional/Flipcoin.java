package com.bridgelabz.functional;
import java.util.Random;
import java.util.Scanner;
/**
 * @author admin1
 *
 */
public class Flipcoin {

	
	
	/**
	 * Driver method to find Flip coin result in Percentage
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter the number of times you want to flip coin :");
		int num = FunctionalUtility.integerScanner();
		FunctionalUtility.flipResult(num);
		

	
        
	}

}
