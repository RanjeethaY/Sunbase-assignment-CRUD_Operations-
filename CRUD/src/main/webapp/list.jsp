<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  page import="java.util.ArrayList" %>
    <%@  page import="com.crud.Student_info" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
ArrayList<Student_info> list=(ArrayList<Student_info>)session.getAttribute("l");
for(Student_info s:list) {
out.println(s.getId());
out.println(s.getName());
out.println(s.getEmail());
out.println(s.getAge()+"<hr>");
}
 %>
</body>
</html>