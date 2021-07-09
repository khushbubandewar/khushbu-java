package com.Student.Employee.college;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.test.tokenizer.Student;

public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		LinkedList<Student> stlist =new LinkedList<Student>();
		ArrayList<Employee> emplist =new  ArrayList<Employee>();
		Set<College> collegeList = new HashSet<College>();
				
		Student st1=new Student();
		st1.setName("Alfa");
		st1.setAddress("bhopal");
		st1.setRollNo(87698);
		Student st2=new Student();
		st2.setName("Bita");
		st2.setAddress("indor");
		st2.setRollNo(323);		
		Student st3=new Student();
		st3.setName("Gama");
		st3.setAddress("nagpur");
		st3.setRollNo(8977);
		
		Employee emp = new Employee();
		emp.setName("Alfiya");
		emp.setCity("banglore");
		emp.setdesignation("ceo");
		Employee emp1 = new Employee();
		emp1.setName("Alfa");
		emp1.setCity("pune");
		emp1.setdesignation("xyz");
		Employee emp3 = new Employee();
		emp1.setName("Bita");
		emp1.setCity("bhopal");
		emp1.setdesignation("abc");
		
		College clg =new College(); 
		clg.setCollegename("DDC");
		clg.setDepartment("CSE");
		clg.setFaculty("xxxx");
		College clg1 =new College(); 
		clg1.setCollegename("rgpv");
		clg1.setDepartment("IT");
		clg1.setFaculty("yyyy");
		College clg2 =new College(); 
		clg2.setCollegename("medical");
		clg2.setDepartment("bio");
		clg2.setFaculty("mmmm");
		
		stlist.add(st1);
		stlist.add(st2);
		stlist.add(st3);
		emplist.add(emp);
		emplist.add(emp1);
		emplist.add(emp3);
		collegeList.add(clg);
		collegeList.add(clg1);
		collegeList.add(clg2);
		map.put("stlist", stlist);
		map.put("emplist", emplist);
		map.put("collegeList", collegeList);
		Set<Entry<String,Object>> set1 = map.entrySet();
		for(Entry<String,Object> entry:set1) {
			if(entry.getKey().equalsIgnoreCase("stlist")) {
				List<Student> stdList =(List<Student>)entry.getValue();
				for(Student student:stdList) {
					System.out.println("Student Name  : "+student.getName());
					System.out.println("Student Address  : "+student.getAddress());
					System.out.println("Student RollNo  : "+student.getRollNo());	
				}
			}
			System.out.println("---------------------------------------------------");
			for(Entry<String,Object> entry1:set1) {
				if(entry1.getKey().equalsIgnoreCase("emplist")) {
					List<Employee> empList = (List<Employee>)entry1.getValue();
					for(Employee employee:empList) {
						System.out.println("Student Name  : "+employee.getName());
						System.out.println("Student Address  : "+employee.getCity());
						System.out.println("Student RollNo  : "+employee.getdesignation());	
					}
				}
				System.out.println("---------------------------------------------------");
				for(Entry<String,Object> entry2:set1) {
					if(entry2.getKey().equalsIgnoreCase("collegeList")) {
						Set<College> collegelist = (Set<College>)entry2.getValue();
							for(College college:collegelist) {
								System.out.println("College Name  : "+college.getCollegename());
								System.out.println("College Address  : "+college.getDepartment());
								System.out.println("College RollNo  : "+college.getFaculty());	
							}	
					}
				}
			}
		}
		
	}

}
