package com.crud;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calldelete")
public class DeleteServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 Student_crudOprations student=new Student_crudOprations();
	 int id=Integer.parseInt(req.getParameter("id"));
	 student.deleteStudent(id);
	 resp.getWriter().print("Data has been removed succusfully!");
}
}
