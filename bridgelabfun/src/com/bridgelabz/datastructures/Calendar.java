package com.bridgelabz.datastructures;

import com.bridgelabz.algorithmprograms.Utility;
import com.bridgelabz.functional.FunctionalUtility;

public class Calendar
{
   	static int[][] calender = new int[5][7];
 public static int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

public	static void initCal() 
{
for (int i = 0; i < calender.length; i++)
{
for (int j = 0; j < calender[i].length; j++) 
{
calender[i][j] = -10;
}
}
}



public static void display(int m) 
{
System.out.println("Sun	Mon	Tue	Wed	Thu	Fri	Sat");

for (int i = 0; i < calender.length; i++) 
{
for (int j = 0; j < calender[i].length; j++)
{
if (calender[i][j] < 0 || calender[i][j] > months[m - 1]) 
{
System.out.print("\t ");
} else if (calender[i][j] > 0) 
{
System.out.print(calender[i][j] + " \t");
}
}
System.out.println("\t");
}
}


public static void putCalender(int d)
{
int d1 = 1;
for (int i = d; i < calender[0].length; i++) 
{
// System.out.print(d1);
calender[0][i] = d1++;
}
for (int i = 1; i < calender.length; i++) 
{
for (int j = 0; j < calender[i].length; j++)
{
calender[i][j] = d1++;
}
}

}

public static void dispCalender(int m, int y) {
int d = dayOfWeek(m, y);
initCal();
putCalender(d);
display(m);

}

public static int dayOfWeek(int m, int y)
{
int d = 1;
int y0 = y - (14 - m) / 12;
int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
int m0 = m + 12 * ((14 - m) / 12) - 2;
int d0 = (d + x + (31 * m0) / 12) % 7;
return d0;
}
public static void main(String[] args) 
{
int month,year;
//boolean flag=false;
System.out.println("enter month");
month= Utility.integerScanner();
System.out.println("enter year");
year=Utility.integerScanner();
if(month==2 && FunctionalUtility.leapYear(year));
{
	months[2]=29;
}

dispCalender(month, year);

}

}