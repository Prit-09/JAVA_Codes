package com.oops.Inheritance_3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of employees: ");
		int size=sc.nextInt();
		HR hr[]=new HR[size];
		for(int i=0;i<hr.length;i++) {
			sc.nextLine();
			System.out.println("enter name of employees: ");
			String name=sc.nextLine();
			System.out.println("enter address of employees: ");
			String address=sc.nextLine();
			System.out.println("enter Salary of employees: ");
			double Salary=sc.nextDouble();
			System.out.println("enter incentive of employees: ");
			double incentive=sc.nextDouble();
			
			hr[i]= new HR(name,address,Salary,0,incentive);
			
		}
		System.out.println("****************************************************************************************");
        for(HR empRecord:hr) {
        	System.out.println(empRecord);
        }*/
		HR h1=new HR("Rachana",10000,10,1000);
		System.out.println("Salary after calculations is: Rs."+h1.calculateSalary());
		Maneger m1=new Maneger("Rohit",65000,10);
		System.out.println(m1);
	}

}
