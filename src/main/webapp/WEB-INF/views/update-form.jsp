<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 21.09.2023
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/controller/update/student/${student.id}" method="post">
    <label for="name">name</label>
    <input type="text" name="name" id="name" value="${student.name}">
    <label for="email">email</label>
    <input type="text" name="email" id="email" value="${student.email}">
    <label for="password">password</label>
    <input type="text" name="password" id="password" value="${student.password}">
    <input type="submit" value="register">
</form>
</body>
</html>
