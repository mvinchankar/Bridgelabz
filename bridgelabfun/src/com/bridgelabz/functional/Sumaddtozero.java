package com.bridgelabz.functional;

public class Sumaddtozero {

	/**
	 * Driver method to find the sum add to zero
	 * @param args
	 */
	public static void main(String[] args) {
		
        System.out.println("Length");
		int length = FunctionalUtility.integerScanner();
		int [] array = {1,4,7,2,8,-4,-7,-1,6,9,0,-3};
//		for (int i = 0; i < length; i++) {
//			array[i] = Utility.integerScanner();
//		
//		}
		FunctionalUtility.distinctTriplets(length, array);

	}

}
