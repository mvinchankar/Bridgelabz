package com.bridgelabz.functional;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Utility {
   
	static Scanner scanner = new Scanner(System.in);
	public static int integerScanner() 
	{
		
		int inputInteger = scanner.nextInt();
		return inputInteger;
		
	}
    public static double doubleScanner()
    {
    	double inputdouble = scanner.nextDouble();
    	return inputdouble;
    }

    public static String stringScanner() {
	
    	String inputString = scanner.nextLine();
    	return inputString;
	
	
}
    
    public static float floatScanner()
    {
    	Float inputfloat =scanner.nextFloat();
    	return inputfloat;
    }
    
    
 /**
  * Method for String Replace   
  * @return
  */
public static String accept(){
		
		System.out.println("Enter the Username :");
		String name = Utility.stringScanner();            //Enter the String to replace
		if(name.isEmpty())
		{
			System.out.println("Not Valid");
		}
		return name;                                      //return the username
	}

public static void flipResult(int num) {
		
	    int count1 = 0,count2 =0;
		for(int i = 0;i<num;i++)
		{
			double result1 = Math.random();
		   if(result1 < 0.5)
		  {
			System.out.println("Head");
			count1++;
		  }
		   else 
		   {
			   System.out.println("Tail");
			   count2++;
		   }
		}
		
		System.out.println("Percentage of Head is :"+ (count1*100)/num + "%");
		System.out.println("Percentage of Tail is :"+ (count2*100)/num + "%");
		
		
		
	}

public static void Leapyear(int year) {
	
	if(year > 999 && year < 9999)
	{
	  if(year % 100 ==0)
		{
	     if(year % 400 ==0)
	     {
		System.out.println("Is a leap year :" + year);
	     }
	     else
	     {
	    	 System.out.println("Not a leap year");
	     }
		}
	  else
	  {
		  if(year % 4 ==0)
		  {
		System.out.println("Is a leap year :" + year);
	      }
		  else
		  {
			  System.out.println("Not a leap year :" + year);
		  }
	  }
	
	}
	else
	{
		System.out.println("Invalid year entered :" + year);
	}
}
public static void playGambler(int stake, int goal,int numberofIterations) {
	
	
	float wincount = 0,losecount = 0;
	for (int i = 1; i <= numberofIterations; i++) {
		double result = Math.random();
		int fair =1;
		if(result > 0.5 ||stake == goal)
		{
			//System.out.println("You Win");
			wincount++;
			stake = stake +fair;
		    if(stake == goal)
		    {
			System.out.println("Awesome"); 
			break;
		    }
	    }
		else
		{
			//System.out.println("You lose");
			losecount++;
			stake = stake -fair;
		}
		
    }
	System.out.println(stake);
	System.out.println("Win percentage :" + (wincount*100)/numberofIterations);
	System.out.println("Lose percentage :" + (losecount*100)/numberofIterations);
}
public static void functionGenerator(int numberofiterations, int a[],int count) {
	
    
    for (int i = 0; i < numberofiterations; i++) {
	   
	int coupon = (int)(Math.random() * 999) +10000;
	count =count +1;
	System.out.println(coupon);
	a[i] = coupon;
	//System.out.println((int)(a[i]*100000));
	//c = Arrays.copyOfRange(a, 0, n);
	                  }
		System.out.println(count);
	
     checkDistinct(a);
}
   public static void checkDistinct(int[] a) 
   {
	  int count = 0;
	  for (int i = 0; i < a.length; i++) 
	  {
		/* if(i == a.length -1)
		 {
			System.out.println("Distinct Coupon Generated are :" + a[i]);
        	break;
		
		 }*/
		 for (int j = i+1; j < a.length; j++) {
			
		  if(a[i] != a[j])
	      {
		       //count ++;
	        	System.out.println("Distinct Coupon Generated are :" + a[i]);
	        	break;
	      }
	       /* if(count ==0)
	        {
	        
	        	System.out.println("Distinct Coupon Generated are :" +(int)(a[j]*100000));
	        }*/
	    
		   }
	    }   
		
	
     }
   public static float harmonic(float num) {
		float sum =0;
		
	  if(num > 0)
	  {
		for (int i = 1; i <= num; i++) {
			sum =sum + ((float)1/i);
			//System.out.println(sum);
		}
		
	  }
	  else
	  {
		  System.out.println("Not valid ");
	  }
	return sum;
	
   }
   public static boolean isAnagram(int a1, int a2)
	 {
		 boolean flag = false;
		 String s1 = String.valueOf(a1);
		 String s2 = String.valueOf(a2);
		 
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		if(c1.length == c2.length)
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
		}
		String s3 = new String(c1);
		String s4 = new String(c2);
		if(s3.equals(s4))
		{
			return true;
		}
		return false;
	 }
   public static void power(int number) {
	   
		int a = (int) Math.pow(2, number);
		System.out.println("a : " + a);
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Table is :" + a + " x" + i +"  =  " + a*i );
			
		}
	}
   public static void primefactors(int num) {
		
		for (int i = 2; i < num; i++) {
				
				while(num%i ==0)
				{
				System.out.println(i);
			    num = num/i;
				}
			//System.out.println(num);
		}
		if(num > 2)
		{
			System.out.println(num);
		}
		
	}
   public static void rootsofEquation(double a,double b,double c,double root1,double root2)
   {
     double determinant = b * b - 4 * a * c;
     // condition for real and different roots
     if(determinant > 0) {
       root1 = (-b + Math.sqrt(determinant)) / (2 * a);
       root2 = (-b - Math.sqrt(determinant)) / (2 * a);
       System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
       }
     // Condition for real and equal roots
     else if(determinant == 0) {
       root1 = root2 = -b / (2 * a);
       System.out.format("root1 = root2 = %.2f;", root1);
     }
     // If roots are not real
     else {
       double realPart = -b / (2 *a);
       double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
       System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
   }
   public static void printWriter() throws Exception {
		FileOutputStream fileOutputStream= null;
		PrintWriter printWriter = null;
		try 
		{
			
			fileOutputStream = new FileOutputStream("myoutputfile.txt");
           
			printWriter = new PrintWriter(fileOutputStream);
           //acceptValues();
           printWriter.println("Required 2D Array will be :");
           printWriter.write(String.valueOf(acceptValues())); 
           
           
           printWriter.flush();
           
		}
		finally
		{
		  if(fileOutputStream != null)
		  {
			fileOutputStream.close();
		  }
	      if(printWriter != null)
	      {
	    	  printWriter.close();
	      }
		}
	}

	public static  String acceptValues() 
		{
		 int[][] a;
		System.out.println("Enter the dimensions to create 2D Array :");
		int row = Utility.integerScanner();
		int column = Utility.integerScanner();
		System.out.println("Enter the values in 2D Array :");
		a=new int[row][column];
			 String s = "";
			for (int i = 0; i < a.length; ++i) {
		        for(int j = 0; j < a[i].length; ++j) {
		    		a[i][j] = Utility.integerScanner();

		        }
		     }
			System.out.println("2d Array is printed using PrintWriter and OutputStreamWriter is :");
			 for (int i = 0; i < a.length; ++i) {
			        for(int j = 0; j < a[i].length; ++j) {
			           System.out.print(a[i][j]+" ");
			           s = s + a[i][j];
			        }
			        System.out.println();
			     }
			 //System.out.println(a);
			 return s;
	}
	public static void distinctTriplets(int length,int []array) {
		
		int triplecount = 0;
	    
		for (int i = 0; i < array.length; i++) {
		
		     for (int j = i+1; j < array.length; j++) {
			      
		    	 for (int j2 = j+1; j2 < array.length; j2++) {
				     if(array[i] !=array[j] && array[j] !=array[j2] && array[i] != array[j2] )
				     {
		    		 if((array[i] + array[j] +array[j2]) == 0) 
				       {
					    triplecount++;
				        System.out.println("The Three Dist inct Triplets whose sum will be zero is :" +array[i]+ " : "+array[j]+" : " + array[j2]);	
				       }
				    
				     }
				     else
				       {
					    System.out.println("Not Distinct ");
			           }
			}
			
		}
		
	}
	}
	public static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}


	public static void recursion(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			recursion(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
		
	}



public static String[] iterations(String s)
{
	
	List<String> arraylist = new ArrayList<>();


	arraylist.add(String.valueOf(s.charAt(0)));

	
	for (int i = 1; i < s.length(); i++)
	{
		
		for (int j = arraylist.size() - 1; j >= 0 ; j--)
		{
			
			String str = arraylist.remove(j);

			for (int k = 0; k <= str.length(); k++)
			{
				
				arraylist.add(str.substring(0, k) + s.charAt(i) +
							str.substring(k));
			}
		}
	}
	String[] str = new String[arraylist.size()];
	str = arraylist.toArray(str);
	System.out.println(Arrays.deepToString(str));
	

	
	return str;
}
public static void windChill(int temperature,int velocity) {
	
	if(temperature<=50 ||velocity<120 &&velocity>3)
	{
	double w =35.74 +(0.6215 *temperature) + ((0.4275*temperature) - 35.75)*Math.pow(velocity,0.16 );
		System.out.println("WindChill : " + w);
	 
	}
	else
	{
		System.out.println("Values entered are Invalid");
	}

	}

}