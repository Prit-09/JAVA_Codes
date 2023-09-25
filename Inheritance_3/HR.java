package com.oops.Inheritance_3;

public class HR extends Employee {
	private int noOfHires;
	private double incentive;

	
	public HR(String name, double salary, int noOfHires, double incentive) {
		super(name,salary);
		this.noOfHires = noOfHires;
		this.incentive = incentive;
	}



	public HR(String name, String address, double salary, int noOfHires, double incentive) {
		super(address, name,salary);
		this.noOfHires = noOfHires;
		this.incentive = incentive;
	}



	public int getNoOfHires() {
		return noOfHires;
	}



	public void setNoOfHires(int noOfHires) {
		this.noOfHires = noOfHires;
	}



	public double getIncentive() {
		return incentive;
	}



	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}



	@Override
	public String toString() {
		return "HR [noOfHires=" + noOfHires + ", incentive=" + incentive + ", getEmpId()=" + getEmpId()
				+ ", getSalary()=" + getSalary() + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + "]";
	}


    public double calculateSalary() {
    	return super.getSalary()+this.incentive*this.noOfHires;
    }
	
	
	
	
	

}
