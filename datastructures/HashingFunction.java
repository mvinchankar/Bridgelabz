package com.bridgelabz.datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

import com.bridgelabz.algorithmprograms.Utility;

public class HashingFunction {

	private static Scanner scanner;

	public static void main(String[] args) throws FileNotFoundException {
		HashUtility h =new HashUtility();
		
		  File file=new File("/home/admin1/Desktop/aa");     
	      Scanner fileinput;
		
		 scanner = new Scanner(file);
		fileinput = scanner.useDelimiter(",");
		  
	      int line;
	      while(fileinput.hasNextInt())
	 	 {
	 		 line = fileinput.nextInt();
	 		 h.insert(line);
	 	 }
		h.printHashTable();
//		System.out.println("Enter the number to be searched :");
//		int value = Utility.integerScanner();
//		if(HashUtility.)
//		
//		try {
//			
//		 Writer writer = new PrintWriter("/home/admin1/Desktop/output",);
//	//	 com.bridgelabz.datastructures.GenericUtility.Node traversingNode1 =util.head;
//		
//		
//		 writer.close();

	}

}
                                                                                                                                                                                                       