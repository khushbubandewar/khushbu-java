package com.Student.Employee.college;

public class College {
	private String collegename;
	private String department;
	private String faculty;
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	@Override
	public String toString() {
		return "College [collegename=" + collegename + ", department=" + department + ", faculty=" + faculty + "]";
	}
	
}
