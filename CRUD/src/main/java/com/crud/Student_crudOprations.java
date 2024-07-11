package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.crud.Student_info;

public class Student_crudOprations implements Student {

	Connection con=null;
	PreparedStatement st=null;
	String url="jdbc:mysql://localhost:3306/Student_info";
	String password="root";
	String username="root";
	String add="insert into Student_info.Student(`name`,`email`,`age`) values (?,?,?) ";
	String delete="delete  from Student_info.Student where `id`=?";
	String update="update Student_info.Student set `name`=?,`email`=?,`age`=?";
	String getAll="select * from Student_info.Student";
	
	public Student_crudOprations() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addStudent(Student_info s) {
		try {
			st=con.prepareStatement(add);
//			st.setInt(1,s.getId());
			st.setString(1,s.getName());
			st.setString(2,s.getEmail());
			st.setInt(3,s.getAge());
			st.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public int updateStudent(int id,Student_info s) {
		int a=0;
		try {
			st=con.prepareStatement(update);
			st.setString(1,s.getName());
			st.setString(2,s.getEmail());
			st.setInt(3,s.getAge());
		a=	st.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public void deleteStudent(int id) {
		try {
			st=con.prepareStatement(delete);
			st.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Student_info> getAllStudents() {
		ArrayList<Student_info> list=new ArrayList<Student_info>();
		try {
			Statement cr=con.createStatement();
		ResultSet r=cr.executeQuery(getAll);
		while(r.next()) {
			list.add(new Student_info(r.getInt("id"),r.getString("name"),r.getString("email"),r.getInt("age")));
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
