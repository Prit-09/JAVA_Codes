package Assignment_no_1;

import java.util.Scanner;

public class Conversion_Rupees_Dollar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the rupees:");
		float rupees = input.nextLong();
		float dollars = rupees/82;
		System.out.println("Dollars:"+dollars);
		
		

	}

}
