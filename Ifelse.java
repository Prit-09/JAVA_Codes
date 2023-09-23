package Statements;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args)
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=ip.nextInt();
		
		if(age<18)
		{ //brackets is optional when we want to print single line
			 
			System.out.println("persom is not elible for voting");
		}   
		else
		{
			System.out.println("persom is eligible  for voting ");
		}

	}
  
}
 