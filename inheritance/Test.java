package com.oops.inheritance;

public class Test {
	public static void main(String[] args) {
		Student s[]=new Student[3];
		s[0]=new Student("12343432223", "priti", "pune", 1, 98, "A");
		s[1]=new Student("122346632223", "divu", "pune", 2, 88, "B");
		s[2]=new Student();
		
		for(Student stud:s)
		{
			//for each entry inside s take one by entry and s is a name of array
			System.out.println(stud);
		}
		
		
	}

}
