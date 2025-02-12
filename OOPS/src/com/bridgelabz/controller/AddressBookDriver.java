
package com.bridgelabz.controller;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.model.Person;
import com.bridgelabz.services.AddressBookManagement;
import com.bridgelabz.utility.Utility;

/**
 *AddressBookDriver class is driver class for AddressBook
 */
public class AddressBookDriver{
	static Scanner scanner = new Scanner(System.in);
	static File file;
	static String filename;
	static String filePath = "/home/use/workspace/BridgeLabz/OOPS/src/com/bridgelabz/repository";
	static List<Person> arrayList=AddressBookManagement.getList();
	
	/**
	 * Driver Main Method of ADDRESS BOOK
	 * @param args
	 * @throws ParseException
	 * @throws IOException
	 */
	public static void main(String[] args) throws ParseException, IOException {
		AddressBookManagement action = new AddressBookManagement();
		Utility utility = new Utility();
		char input = ' ';
		do {
			System.out.print("\n\n\n\n\t\t\t\t A D D R E S S_B O O K-S Y S T E M ");
			System.out.print("\n\t\t\t\t----------------------------------");
			System.out.print("\n\t\t\t\t Create New Adress Book : Enter 1");
			System.out.print("\n\t\t\t\t Open   Adress Book     : Enter 2");
			System.out.print("\n\t\t\t\t Save   Adress Book     : Enter 3");
			System.out.print("\n\t\t\t\t SaveAs Adress Book     : Enter 4");
			System.out.print("\n\t\t\t\t Delete Adress Book     : Enter 5");
			System.out.print("\n\t\t\t\t Quit                   : Enter 6");
			System.out.print("\n\t\t\t\t----------------------------------\n");

			System.out.print("\n\t\t\t\tEnter Choice : ");
			
			int choice = utility.integerScanner();
            
			/*
			 * Switch case
			 */
			switch (choice) {
			case 1:
				/*
				 * MEthod to Create new ADDRESS BOOK
				 */
				action.createNewAddressBook();
				break;

			case 2:

				System.out.println();
				file = new File(filePath);
				/*
				 * It reads the list of Files on File PAth
				 */
				File[] fileList = file.listFiles();
				System.out.println("\t\t\t\t	 LIST_OF_FILE");
				System.out.println("\t\t\t\t-----------------------------");
				System.out.println("\t\t\t\tDisplay_FileName");

				for (File fileName : fileList) {

					System.out.printf("\t\t\t\t"+ fileName.getName(), fileName.length());
					System.out.println();
				}
				System.out.print("\n\t\t\tEnter the File Name Where you want to Add Information :");
				filename = scanner.next();
				/*
				 * Method to Open a Particular ADDRESS BOOK
				 */
				arrayList = action.openAddressBook(filename);
				break;

			case 3:
				/*
				 * MEthod to save the changes made by the User using MAPPER 
				 */
				action.save(arrayList);
				break;

			case 4:
				/*
				 * Method to Change the name of Address Book 
				 */
				action.saveAs();
				break;

			case 5:
				/*
				 * Method to Delete the AddressBook File
				 */
				action.deleteFile();
				break;

			default:
				System.out.println("\n\t\t\t\tInvalid Choice...!");
			}
			System.out.print("\n\t\t\t\tDo you want to continue AddressBook Menu(Y/N) : ");
			input = scanner.next().charAt(0);
		} while (input == 'Y' || input == 'y');
	}
}
