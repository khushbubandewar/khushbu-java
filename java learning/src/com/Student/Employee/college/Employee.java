package com.Student.Employee.college;

public class Employee {
	private String name;
	private String city;
	private String designation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getdesignation() {
		return designation;
	}

	public void setdesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", designation=" + designation + "]";
	}
}
