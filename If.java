package Statements;

import java.util.Scanner;

public class If {

	public static void main(String[] args)
	{
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=ip.nextInt();
		
		if(age<18)
		{ 
			 
			System.out.println("persom is not elible for voting");
		}
	}

}
