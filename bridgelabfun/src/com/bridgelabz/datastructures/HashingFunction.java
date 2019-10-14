package com.bridgelabz.datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

import com.bridgelabz.algorithmprograms.Utility;
/**
 * Driver Method to perform Hashing using Hashing Function 
 * @author admin1
 *
 */
public class HashingFunction {

	private static Scanner scanner;

	public static void main(String[] args) throws FileNotFoundException {
		HashUtility h =new HashUtility();
		
		  File file=new File("/home/admin1/Desktop/aa");     
	      Scanner fileinput;
		
		 scanner = new Scanner(file);
		 /*
		  * Accepting the elements from file
		  */
		 fileinput = scanner.useDelimiter(",");                         
		  
	      int line;
	      while(fileinput.hasNextInt())                            
	 	 {
	 		 line = fileinput.nextInt();
	 		 /*
	 		  * insertion of elements using hashing function in linkedlist
	 		  */
	 		 h.insert(line);
	 	 }
		h.printHashTable();
		

	}

}
                                                                                                                                                                                                       