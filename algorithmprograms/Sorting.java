package com.bridgelabz.algorithmprograms;

class Sorting{
public static void main(String[] args) {
	
	System.out.println("1.Binary Search Integer Example :");
	System.out.println("2.Binary Search String Example :");
	System.out.println("3.Insertion Sort String Example :");
	System.out.println("4.Insertion Sort Integer Example :");
	System.out.println("5.Bubblesort Integer Example");
	System.out.println("6.Bubblesort String Example");
	int h=3;
    int t1 = 0,t2=0,t3=0,t4=0,t5=0,t6=0;
	
	do {
       
		int ch = Utility.integerScanner();
		
	
	
	switch(ch)
	 {
	 case 1:
		
		 System.out.println("Enter the size :");
		 int size = Utility.integerScanner();
	        int array1[] = new int[size];
	         
	       	int startTime = (int) System.nanoTime();
	       	System.out.println("Enter the elements :");
	        for (int i = 0; i < array1.length; i++) {
				array1[i]=Utility.integerScanner();
			}
	        System.out.println("Enter the element you want to search :");
	        int key = Utility.integerScanner(); 

	        int result1 = Utility.binarySearchIntegers(array1, 0, size , key); 
	        if (result1 == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at index " + result1); 
	        int endTime = (int) System.nanoTime();
	        int timeElapsed = endTime - startTime;

			System.out.println("Execution time in nanoseconds  : " + timeElapsed);

			System.out.println("Execution time in milliseconds : " + 
									timeElapsed / 1000000);
			t1 = timeElapsed;
	        break;
	 case 2:
		 System.out.println("Enter the Number of elements :");
		 int num = Utility.integerScanner();
		 String[] array2 = new String [num]; 
		 for (int i = 0; i <array2.length; i++) {
				array2[i]=Utility.stringScanner();
			}
		 System.out.println("Enter the string you want to search : ");
	        String key1 = Utility.stringScanner();
	        int startTime1 =(int) System.nanoTime();
	        Utility.stringBinarySearch(array2, key1, num); 
	  
	        
	        int endTime1 = (int)System.nanoTime();
	        int timeElapsed1= endTime1 - startTime1;

			System.out.println("Execution time in nanoseconds  : " + timeElapsed1);

			System.out.println("Execution time in milliseconds : " + 
									timeElapsed1 / 1000000);
	        t2 = timeElapsed1;
			break;
	        
	 case 3:
		 System.out.println("Size :");
		 int size1 = Utility.integerScanner();
		 String[] array4 =new String [size1];
		 for (int i = 0; i < array4.length; i++) {
			array4[i] = Utility.stringScanner();
		}
		 
		 int startTime2 =(int) System.nanoTime();
		 String sortedArray[] = Utility.insertionsortString(array4, size1); 
		 for(int p=0;p<sortedArray.length;p++)
		 {
		   
			 System.out.println(sortedArray[p]);
		 
		 }
		    int endTime2 =(int) System.nanoTime();
	        int timeElapsed2 = endTime2 - startTime2;

			System.out.println("Execution time in nanoseconds  : " + timeElapsed2);

			System.out.println("Execution time in milliseconds : " + 
									timeElapsed2 / 1000000);
		    t3 = timeElapsed2;
			break;

		 
     case 4:
    	 System.out.println("Size :");
    	 int size2 = Utility.integerScanner();
         int[] array3 = new int [size2];   
    	   System.out.println("Enter the elements : ");
    	   for (int i = 0; i < array3.length; i++) 
    	   {
			array3[i] = Utility.integerScanner();
		   }
           System.out.println("Before Insertion Sort");    
           for(int i:array3)
           {    
               System.out.println(i+" ");
           }    
           System.out.println();    
           int startTime3 =(int) System.nanoTime();
               
           Utility.insertionSort(array3);//sorting array using insertion sort    
              
           System.out.println("After Insertion Sort");    
           for(int i:array3)
           {    
               System.out.println(i+" ");
           }
           int endTime3 =(int) System.nanoTime();
	       int timeElapsed3 = endTime3 - startTime3;

		   System.out.println("Execution time in nanoseconds  : " + timeElapsed3);

		   System.out.println("Execution time in milliseconds : " + 
									timeElapsed3 / 1000000);
	       t4 = timeElapsed3;
		   break;
		   
     case 5: 
    	 System.out.println("Size  :");
    	 int length = Utility.integerScanner();
    	 int array[] =new int[length];
    	 System.out.println("Enter the elements :");
    	 for (int i = 0; i < array.length; i++) {
			array[i] = Utility.integerScanner();
		}
         
            System.out.println("Array Before Bubble Sort");  
            for(int i=0; i < array.length; i++){  
                    System.out.println(array[i] + " ");  
            }  
            int startTime4 =(int) System.nanoTime();
            Utility.bubbleSort(array);//sorting array elements using bubble sort  
             
            System.out.println("Array After Bubble Sort");  
            for(int i=0; i < array.length; i++){  
                    System.out.println(array[i] + " ");  
            }  
            int endTime4 = (int)System.nanoTime();
	        int timeElapsed4 = endTime4 - startTime4;

			System.out.println("Execution time in nanoseconds  : " + timeElapsed4);

			System.out.println("Execution time in milliseconds : " + 
									timeElapsed4 / 1000000);
            t5 = timeElapsed4;
    	 break;
    	 
     case 6:
    	 System.out.println("Enter the size :");
    	 int length1 = Utility.integerScanner();
    	 String[] string = new String[length1];
    	 System.out.println("Enter the strings you want to sort : ");
    	 for (int i = 0; i < length1; i++) {
			string[i] = Utility.stringScanner();
		 }
    
    
    	 int startTime5 =(int) System.nanoTime();
    	 System.out.println("Strings in sorted order are : "); 
         Utility.sortStrings(string, length1); 
        
         
         int endTime5 = (int)System.nanoTime();
         int timeElapsed5 = endTime5 - startTime5;

	     System.out.println("Execution time in nanoseconds  : " + timeElapsed5);

	     System.out.println("Execution time in milliseconds : " + 
							timeElapsed5 / 1000000);
	     t6 = timeElapsed5;
	     break;
	
     case 7 :
    	 
    	int a[] = new int[6];
    	a[0] = t1;
    	a[1] = t2;
    	a[2] = t3;
    	a[3] = t4;
    	a[4] = t5;
    	a[5] = t6;
    	for (int i = 0; i < a.length; i++)
    	{
        	for (int j = 1 ; j < a.length; j++)
        	{
        		if(a[i]>a[j])
        	    {
        			if (a[i]!=a[j])
        			System.out.println(" Order of Elapsed time will be in this order :" + a[j]);
        		}
        		    	 
			}
		

	    }
    	break;
	 }
	
   }while(h <= 4);

  }

}


