package com.basic.learn.student.management;

import java.io.Serializable;

//POJO or DTO 
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1923789530783639338L;
	private String sName;
	private String address;
	private String fatherName;
	private String section;
	private int rollNo;
	private int age;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", address=" + address + ", fatherName=" + fatherName + ", section="
				+ section + ", rollNo=" + rollNo + ", age=" + age + "]";
	}
}
