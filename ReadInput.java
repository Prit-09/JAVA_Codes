 package com.seed;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) 
	{
		//Scanf in c just like that
		Scanner input = new Scanner(System.in);
		//System.out.println("Enter your name:");
		//String name = input.next();
		//System.out.println("Hello,"+name);
		
		System.out.println("Enter your age: ");
		int age1 = input.nextInt();
		int age2 = input.nextInt();
		System.out.println("Your age is :" + age1+" "+age2);

		//Assignment to do with another data types or all the method
	}

}
