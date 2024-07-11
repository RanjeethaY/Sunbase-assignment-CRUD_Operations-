package com.crud;

import java.util.ArrayList;

import com.crud.Student_info;

public interface Student {
	public void addStudent(Student_info s);
	  public void  deleteStudent(int id);
	  public ArrayList<Student_info> getAllStudents();
	int updateStudent(int id, Student_info s);
}
