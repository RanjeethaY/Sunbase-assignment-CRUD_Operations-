package com.crud;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.Student_crudOprations;
import com.crud.Student_info;

@WebServlet("/callupdate")
public class UpdateServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int id=Integer.parseInt(req.getParameter("id"));
			String name=req.getParameter("name");
			String email=req.getParameter("eid");
			int age= Integer.parseInt(req.getParameter("age"));
			Student_info s = new Student_info(name,email,age);
		    Student_crudOprations student=new Student_crudOprations();
		    int a=student.updateStudent(id,s);
		    resp.getWriter().print("Information updated succusfully!");
	}
}
