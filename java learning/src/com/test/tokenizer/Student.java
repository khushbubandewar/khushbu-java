package com.test.tokenizer;

public class Student {
	private String name;
	private int rollNo;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int i) {
		this.rollNo = i;
	}

	public String getAddress() {
		return city;
	}

	public void setAddress(String address) {
		this.city = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", city=" + city + "]";
	}
}
