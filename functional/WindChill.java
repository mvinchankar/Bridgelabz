package com.bridgelabz.functional;

public class WindChill {

	
	public static void main(String[] args) {
		System.out.println("ENter the value of t :");
		int temperature = Integer.parseInt(args[0]);
		System.out.println("Enter the value of v :");
		int velocity = Integer.parseInt(args[1]);
		Utility.windChill(temperature,velocity);

	}

}
