
package com.bridgelabz.datastructures;
import java.util.Scanner;

import com.bridgelabz.algorithmprograms.Utility;
import com.bridgelabz.functional.FunctionalUtility;
public class WeekDayObjects {

	public static void main(String[] args) throws Exception
	{
		FunctionalUtility leap = new FunctionalUtility();
		Utility day = new Utility();
		QueueUtility<String> weekDay = new QueueUtility<String>();
		QueueUtility<Integer> weekDate = new QueueUtility<Integer>();
		Scanner sc = new Scanner(System.in);
		weekDay.enqueue("M");
		weekDay.enqueue("T");
		weekDay.enqueue("W");
		weekDay.enqueue("T");
		weekDay.enqueue("F");
		weekDay.enqueue("S");
		weekDay.enqueue("S");
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
		if(month==2 && leap.leapYear(year));
		{
			days[month]=29;
		}
		
		int d= day.daysOfWeek(1,month,2019);
		for(int j=0;j<d;j++)
		{
			weekDate.enqueue(0);
		}
		
		for(int i=1;i<=days[month];i++)
		{
			weekDate.enqueue(i);
		}
		
		weekDay.display();
		System.out.println();
		weekDate.display();
//		String[] dayArray = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//		for(int i=0;i<dayArray.length;i++)
//		{
//			weekDay[i] = new QueueUtility<Integer>();
//		}
//		
//
//		
//		int i=1;
//		int d= day.DayOfWeek(1,10,2019);
//		for(int j=0;j<d;j++)
//		{
//			weekDay[j].enqueue(null);
//		}
//		while(i<31)
//		{
//			if(d<7)
//			{
//				weekDay[d].enqueue(i++);
//				d++;
//			}
//			else
//				d=0;	
//		}
//
//		for(int j=0;j<7;j++)
//		{
//			if(weekDay[j].isEmpty())
//			{
//				continue;
//			}
//			System.out.print(dayArray[j]);
//			weekDay[j].showFullQueue();
//		}
	}
}


