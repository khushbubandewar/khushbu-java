package com.basic.learn.student.management.dao;

import java.util.List;

import com.basic.learn.student.management.Student;

public interface StudentDAO {
  public Student updateStudent(int rollNo);
  public List<Student> addStudent(Student student);
}

