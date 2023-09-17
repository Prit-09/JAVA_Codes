package Assignment_no_1;

import java.util.Scanner;

public class Temperature_Conversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit:");
		float fahrenheit = input.nextLong();
		float centigrate = ((fahrenheit-32)*5)/9; 
		System.out.println(" "+centigrate);
		

	}

}
