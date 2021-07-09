package com.hostel.model;

import java.util.List;

public class Room {
private	String roomNo;
private	int occupiedStudent;
private	int totalOccupancy;
private	List<Student> studentList;
	
	public int getOccupiedStudent() {
		return occupiedStudent;
	}
	public void setOccupiedStudent(int occupiedStudent) {
		this.occupiedStudent = occupiedStudent;
	}
	public int getTotalOccupancy() {
		return totalOccupancy;
	}
	public void setTotalOccupancy(int totalOccupancy) {
		this.totalOccupancy = totalOccupancy;
	}
	public List<Student> getStudent() {
		return studentList;
	}
	public void setStudent(List<Student> student) {
		studentList = student;
	}
	
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Room [roomNo=" + roomNo + ", occupiedStudent=" + occupiedStudent + ", totalOccupancy=" + totalOccupancy
				+ ", studentList="
				+ (studentList != null ? studentList.subList(0, Math.min(studentList.size(), maxLen)) : null) + "]";
	}

}
