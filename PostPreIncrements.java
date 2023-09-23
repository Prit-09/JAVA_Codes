package com.seed;

public class PostPreIncrements {

	public static void main(String[] args) {
		int a = 10;
		int b = a++;
		System.out.println(" "+b);
		//post increment = assign current value -> increment by 1
		//after these line a become incremented by 1
		
		//int b=a;
		//a=a+1;  these become 11
		int id=10;
		int c = ++id;
		System.out.println(" "+c);
		//pre increment = increment its value first and the assign
		
		//a=a+1;
		//int c=a; these become 12

	}

}
    