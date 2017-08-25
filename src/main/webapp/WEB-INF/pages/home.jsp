<%--
  Created by IntelliJ IDEA.
  User: ayush.regmi
  Date: 8/16/2017
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<%--<a href="<c:url value="/spittles" />"></a> |--%>
<a href="/user/register">Register</a>

<table border=1>
    <caption>PENDING TASKS</caption>
    <tr>

        <th>Username</th>
        <th>Email</th>
        <th>First Name</th>
        <th colspan=2>Action</th>
    </tr>
    <c:forEach var="userD" items="${list}">
    <tr>

            <td><c:out value="${userD.username}"/></td>
            <td><c:out value="${userD.email}"/></td>
            <td><c:out value="${userD.firstName}"/></td>
            <td><a href="/user/edit/<c:out value="${userD.id}"/>">Edit</a></td>
            <td><a href="/user/delete?userId=<c:out value="${userD.id}"/>">Delete</a></td>

    </tr>
    </c:forEach>

</table>
</body>
</html>
