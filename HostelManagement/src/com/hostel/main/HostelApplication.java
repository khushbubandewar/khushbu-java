package com.hostel.main;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.hostel.data.HostelData;
import com.hostel.model.Room;
public class HostelApplication {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Student Roll Number");
//		int rollNo = sc.nextInt();
//		Map<String, String> studentHostelDetailsMap = HostelData.getStudentHostelDetail(102);
//		Map<String,String> getStudentsInfoMap =HostelData.getStudentsInfo();
//		Map<String, Object> getRoomInfoMap = HostelData.getRoomInfo("A-102");
//		Map<String, Object> getTotalNoOfRoom = HostelData.getTotalNoOfRoom();
//		Map<String,Object> getFloorInfoMap = HostelData.getFloorInfo("1st Floor");
		Map<String,Object> getBuildingInfoMap = HostelData.getBuildingInfo("Agni");
//		System.out.println("student Data is given below");
//		System.out.println(studentHostelDetailsMap);
		//Student Name : dhsd               Student Roll No : 2167t4133
//		System.out.println(HostelData.getTotalStudents());
//		System.out.println(getStudentsInfoMap);
//		Set<Entry<String,String>> set = studentHostelDetailsMap.entrySet();
//		for(java.util.Map.Entry<String,String> entry:set) {
//			System.out.println(entry.getKey()+""+entry.getValue());
//			if(entry.getKey().equalsIgnoreCase(studentList)) {
//				List<Student> stList =(List<Student>)entry.getValue();
//				for(Student student:stList) {
//					System.out.print("Student Name :"+student.getName()+"          "+"Student RollNo :"+student.getRollNo());
//					System.out.print("Student RoomNo :"+student.getRoomNo()+"          "+"Student FloorNo :"+student.getNoOfFloor());
//					System.out.print("Student BuildingNo :"+student.getNoOfBuilding());
//				}
//			}
//		System.out.println(getRoomInfoMap);
//		Set<Entry<String,Object>> set1 = getRoomInfoMap.entrySet();
//		for(Entry<String,Object> entry1:set1) {
//			System.out.println(entry1.getKey()+" "+entry1.getValue());
//			}
//		System.out.println(getFloorInfoMap);
//		Set<Entry<String,Object>> set=getFloorInfoMap.entrySet();
//		for(Entry<String,Object> entry:set) {
//			System.out.println(entry.getKey()+""+entry.getValue());
//		}
		System.out.println(getBuildingInfoMap);
		Set<Entry<String,Object>> set=getBuildingInfoMap.entrySet();
		for(Entry<String,Object> entry:set) {
			System.out.println(entry.getKey()+""+entry.getValue());
			}
		}

	}

	
//}
