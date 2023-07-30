<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Student</title>
   
<!-- Section used as css styling for table --> 
<style>
    .css-styled-table {
        border-collapse: collapse;
        margin: 25px 0;
        font-size: 0.9em;
        font-family: sans-serif;
        min-width: 400px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
    }
    .css-styled-table thead tr {
        background-color: #009879;
        color: #ffffff;
        text-align: left;
    }
    .css-styled-table th,
    .css-styled-table td {
        padding: 12px 15px;
    }
    .css-styled-table tbody tr {
        border-bottom: 1px solid #dddddd;
    }
 
    .css-styled-table tbody tr:nth-of-type(even) {
        background-color: #f3f3f3;
    }
 
    .css-styled-table tbody tr:last-of-type {
        border-bottom: 2px solid #009879;
    }
    .css-styled-table tbody tr.active-row {
        font-weight: bold;
        color: #009879;
    }
</style>
   
<!-- Section used as css styling for table -->
</head>
<body>
 
<h1>Add New Student</h1>
   
<!-- SaveServlet is the servlet name that is looked up
     and POST is the method that got called --> 
<form action="SaveStudent" method="post">
<table class="css-styled-table">
  <tr><td>First Name:</td><td><input type="text" name="fname"/></td></tr>
  <tr><td>Last Name:</td><td><input type="text" name="lname"/></td></tr>
  <tr><td>Address :</td><td><input type="text" name="address"/></td></tr>
  <tr><td>Course :</td><td><select name="course">  
<option value="Course">Course</option>  
<option value="BCA">BCA</option>  
<option value="BBA">BBA</option>  
<option value="B.Tech">B.Tech</option>  
<option value="MBA">MBA</option>  
<option value="MCA">MCA</option>  
<option value="M.Tech">M.Tech</option>
</select>  
</td></tr>
  <tr><td colspan="2"><input type="submit" value="Save Student"/></td></tr>
</table>
</form>
 
<br/>
<h1><%= request.getParameter("name") %></h1>
<a href="ViewStudents">view Students</a>
 
</body>
</html>