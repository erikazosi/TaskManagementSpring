<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  UserOld: ayush.regmi
  Date: 8/21/2017
  Time: 1:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>edit</h2>

<form:form method="post" modelAttribute="userOld">

    First Name: <form:input path="firstName"/><br><br>
    Last Name:<form:input path="lastName"/><br><br>
    Username: <form:input path="username"/><br><br>
    Password: <form:input path="password"/><br><br>
    Email: <form:input path="email"/><br><br>

    <input type="submit" name="submit" value="Sign Up"/><br><br>

</form:form>
</body>
</html>
