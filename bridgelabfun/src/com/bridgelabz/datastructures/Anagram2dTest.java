package com.bridgelabz.datastructures;
public class Anagram2dTest {

	/**
	 * Driver Method to calculate the Anagrams of Prime Numbers
	 * @param asd
	 */
public static void main(String asd[])
{
int[][] arr2d = new int[10][100];
int range=100,row=0,col=0,j=0;
/*
 * It stores the Anagrams of elements in array
 */
int array[]=Utility.printAnagram(1000);             
 for (int i = 0; i < array.length; i++) 
 {
  if (array[j]!=0) 
  {
	  /*
	   * While loop condition for storing the Anagram element in particular range
	   */
   while(array[j]<range)                            
   {
    if (array[j]!=0) 
    {	
     arr2d[col][row]=array[j];
     row++;
     j++;
    }
    else
    break;
   }
   /*
    * if value increases range will incremented too
    */
   range+=100;                                       
   col++;
   row=0;
  }
 }

/*
 * print the 2D Array   
 */
 for (int i = 0; i < 10; i++) 
 {
  for (int k = 0; k < 100; k++) 
  {
   if (arr2d[i][k]!=0) 
   System.out.println(arr2d[i][k]);                
  }
 }
 }
}