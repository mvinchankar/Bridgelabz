package com.bridgelabz.functional;
import  java.util.Scanner;
public class Leapyear {

	/**
	 * Driver method to calculate whether the year is leap or not
	 * @param args
	 */
	public static void main(String[] args) {
		int year;
		System.out.println("ENter the year to find as leap yr or not :");
		year = FunctionalUtility.integerScanner();
		FunctionalUtility.leapYear(year);
	}

}
