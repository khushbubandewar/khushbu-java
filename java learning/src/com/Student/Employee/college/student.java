package com.Student.Employee.college;

public class student {
	private String name;
	private String address;
	private long rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", address=" + address + ", rollNo=" + rollNo + "]";
	}
	

}
