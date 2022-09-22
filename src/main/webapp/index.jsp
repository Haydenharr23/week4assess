<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To Do List</title>
</head>
<body>
<h2>To Do List!</h2>

<form action="taskServlet" method="post">
    <table>
      <tr><td>Enter task:</td><td><input type='text' name='task'></td></tr>
      <tr><td><input type="submit" name="naam" value="OK"></td><td></td></tr>
    </table>
  </form>
  
  <form action="descriptionServlet" method="post">
    <table>
      <tr><td>Enter task description:</td><td><input type='text' name='task'></td></tr>
      <tr><td><input type="submit" name="naam" value="OK"></td><td></td></tr>
    </table>
  </form>
</body>
</html>