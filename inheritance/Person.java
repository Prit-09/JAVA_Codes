package com.oops.inheritance;

public class Person {
	private String name;
	private String adharNo;
	private String address;
	private static int idGenerator = 0;        //when we use single word like count then we have write in lower case 
	                                           //and when we write double name then second word be in upper case

	
	
	// default constructor
	public Person() {
		idGenerator++;
		name = " ";
		adharNo = "NA";
		address = "Not defined";
	}

	
	
	
	// parameterized constructor
	public Person(String name, String adharNo, String address) {
		Person.idGenerator++; // its belong to class
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
	}

	
	

	@Override // tostring method
	public String toString() {
		return "Person [name=" + name + ", adharNo=" + adharNo + ", address=" + address + "]";
	}

	
	
	// getter setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static int getIdGenerator() {
		return idGenerator;
	}

	

}
