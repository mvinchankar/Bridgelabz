package com.bridgelabz.functional;
public class Stopwatch { 

   public static void main(String[] args) {
      
	     
	 
	  
			   int  starttime = (int) System.currentTimeMillis();
			   System.out.println("Enter a key");
			   String k = Utility.stringScanner();
			   int endtime  = (int)System.currentTimeMillis();			
			  
			  int  elapsedtime = endtime - starttime;
			    System.out.println(elapsedtime/1000);
	
  }
}