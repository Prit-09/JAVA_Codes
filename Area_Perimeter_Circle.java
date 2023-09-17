package Assignment_no_1;

import java.util.Scanner;

public class Area_Perimeter_Circle {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of radius:");
		Double r= input.nextDouble();
		double pi = 3.14;
		double Area = pi*r*r;
		double Perimeter =2*pi*r;
		System.out.println("Area of circle:"+Area);
		System.out.println("Perimeter of circle:"+Perimeter);
		

	}

}
