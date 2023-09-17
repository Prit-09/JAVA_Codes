package Assignment_no_1;

import java.util.Scanner;

public class Area_Of_rectriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of width:");
		double w = input.nextDouble();
		System.out.println("Enter the value of height:");
		double h = input.nextDouble();
		double Area = w*h;
		System.out.println("Area of Rectriangle is:"+Area);
		
		

	}

}
