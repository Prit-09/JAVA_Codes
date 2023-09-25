 package com.oops.Inheritance_3;

public class Employee extends Person {
	private int empId;
	private double salary;
	
	private static int empIdGenerator;
	
	static {
		empIdGenerator=100;
	}

	public Employee(String name, String address, double salary) {
		super(name, address);
		this.salary = salary;
		this.empId = ++empIdGenerator;
	}

     

	public Employee(String name, double salary) {
		super(name);
		this.salary = salary;
		this.empId = ++empIdGenerator;
		
	}


	public int getEmpId() {
		return empId;
	}
 
	public double getSalary() {
		return salary;
	}

	public static int getEmpIdGenerator() {
		return empIdGenerator;
	}



	@Override
	public String toString() {
		return "Employee [ EmpId()=" + getEmpId() + ", Salary()="
				+ getSalary() + ", Name()=" + getName() + ", Address()=" + getAddress() + "]";
	}


    public double calculateSalary() {
    	return this.salary;
    }
	
	
	
	
	
	

}
