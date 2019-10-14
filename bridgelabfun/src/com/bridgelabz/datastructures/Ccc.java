package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.algorithmprograms.Utility;
import com.bridgelabz.functional.FunctionalUtility;



public class Ccc {

	public static void main(String[] args) throws Exception 
	{
		FunctionalUtility util = new FunctionalUtility();
		Utility day = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter year");
		int year = sc.nextInt();
		System.out.println(""+"1.Jan\n"
				+ "2.Feb\n"
				+ "3.Mar\n"
				+ "4.apr\n"
				+ "5.may\n"
				+ "6.jun\n"
				+ "7.jul\n"
				+ "8.aug\n"
				+ "9.sept\n"
				+ "10.oct\n"
				+ "11.nov\n"
				+ "12.dec");
		int month = sc.nextInt();
		String[] months= {"","January","Febuary","March","April","May","June","July","August"
				,"September","October","November","December"};
		
		int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(month==2 && util.leapYear(year));
		{
			days[month]=29;
		}
		System.out.println();
		System.out.println(" "+ months[month]+"  ");
		System.out.println(" Su Mo Tu We Th Fr Sa");
		int d= day.daysOfWeek(1,month,year);
		for(int i=0;i<d;i++)
		{
			System.out.print("  ");
		}
		for(int i=1;i<=days[month];i++)
		{
			System.out.print("  "+i+"");
			if((d+i-1)%7==0)
			{
				System.out.println();
			}
			
		}
	}
}
