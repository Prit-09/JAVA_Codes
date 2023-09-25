package com.oops.Inheritance_3;

public class Maneger extends Employee{
	private int numberFeatureDeveloped;

	public Maneger(String name, String address, double salary, int numberFeatureDeveloped) {
		super(name, address, salary);
		this.numberFeatureDeveloped = numberFeatureDeveloped;
	}

	public Maneger(String name, double salary, int numberFeatureDeveloped) {
		super(name,salary);
		this.numberFeatureDeveloped = numberFeatureDeveloped;
	}

	public int getNumberFeatureDeveloped() {
		return numberFeatureDeveloped;
	}

	public void setNumberFeatureDeveloped(int numberFeatureDeveloped) {
		this.numberFeatureDeveloped = numberFeatureDeveloped;
	}

	@Override
	public String toString() {
		return "Maneger Information =[ NumberFeatureDeveloped()="+ getNumberFeatureDeveloped() + ", EmpId()=" + getEmpId() + ","
				+ " Salary()=" + getSalary()
				+ ", calculateSalary()=" + calculateSalary() + ", Name()="
				+ getName() + ", Address()=" + getAddress() + "]";
	}
	
	
	

}
