<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Details of the student to be updated</h2>
<form action="callupdate">
        <fieldset>
            <legend>Student Information</legend>
            <table>
                <tr><td><label for="id">Student Id</label></td>
                <td> <input type="number" required id="id" name="id"></td></tr>
                
               <tr><td> <label for="n">Name</label></td>
                <td> <input type="text" id="n" name="name"></td></tr>
                
               <tr><td> <label for="e_id">Email Id</label></td>
                <td> <input type="text" id="e_id" name="eid" placeholder="abc@gmail.com"></td></tr>
                
              <tr><td> <label for="age">Age</label></td>
                <td> <input type="number" id="age" name="age" required></td></tr>
            </table>
             <button>SUBMIT</button>
        </fieldset>
    </form>
    

</body>
</html>