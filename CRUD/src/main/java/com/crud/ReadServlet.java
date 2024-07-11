package com.crud;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.crud.Student_crudOprations;
import com.crud.Student_info;

@WebServlet("/callread")
public class ReadServlet extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 Student_crudOprations student=new Student_crudOprations();
		 ArrayList<Student_info> allStudents = student.getAllStudents();
		 HttpSession session = req.getSession();
		 session.setAttribute("l",allStudents);
		 req.getRequestDispatcher("list.jsp").forward(req, resp);
	}
}
