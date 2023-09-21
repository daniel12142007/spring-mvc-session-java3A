<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 21.09.2023
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2px">
    <th>id</th>
    <th>name</th>
    <th>email</th>
    <th>password</th>
    <th>update</th>
    <th>delete</th>
    <c:forEach items="${st}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>
                <button><a href="/user/controller/find/by/${s.id}">${s.name}</a></button>
            </td>
            <td>${s.email}</td>
            <td>${s.password}</td>
            <td>
                <button><a href="/user/controller/update/${s.id}">UPDATE</a></button>
            </td>
            <td>
                <button><a href="/user/controller/delete/${s.id}">DELETE</a></button>
            </td>
        </tr>
    </c:forEach>
</table>
<button>
    <a href="/user/controller/save">save</a>
</button>
</body>
</html>
