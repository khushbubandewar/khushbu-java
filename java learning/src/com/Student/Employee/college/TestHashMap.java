package com.Student.Employee.college;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.test.tokenizer.Student;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap<String,Object>();
		LinkedHashMap<String,Object> studentlist=new LinkedHashMap();
		Student st1=new Student();
		st1.setName("Alfa");
		st1.setAddress("bhopal");
		st1.setRollNo(87698);
		studentlist.put("st1", st1);	
		Set<Entry<String,Object>> set=studentlist.entrySet();
		for(Entry<String,Object> entry:set) {
			System.out.print(entry.getKey()+"  "+entry.getValue());
			if(entry.getKey().equalsIgnoreCase("studentlist")) {
					
			
		}
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setName("Gama");
		emp1.setCity("pune");
		emp1.setdesignation("ceo");
		empList.add(emp1);
		map.put("empList", empList);
//		Set<Entry<String,Object>> set1= ((Map<String,Object>) empList).entrySet();
		for(Entry<String,Object> entry1:map.entrySet()) {
			System.out.println(entry1.getKey()+"  "+entry1.getValue());
			}
		}
		
		
		
		
	}

}
