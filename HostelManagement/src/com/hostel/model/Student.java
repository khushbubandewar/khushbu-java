package com.hostel.model;

public class Student {
	private	String name;
	private	String rollNo;	
	private	String noOfBuilding;
	private	int noOfFloor;
	private	String roomNo;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String string) {
		this.roomNo = string;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", roomNo=" + roomNo + "]";
	}
	public String getNoOfBuilding() {
		return noOfBuilding;
	}
	public void setNoOfBuilding(String noOfBuilding) {
		this.noOfBuilding = noOfBuilding;
	}
	public int getNoOfFloor() {
		return noOfFloor;
	}
	public void setNoOfFloor(int noOfFloor) {
		this.noOfFloor = noOfFloor;
	}
	
}
