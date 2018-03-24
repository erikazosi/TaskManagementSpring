<%--
  Created by IntelliJ IDEA.
  User: ayush.regmi
  Date: 8/16/2017
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>
<h2>Sign Up</h2>
<form method="post">
    <input type="text" name="firstName" placeholder="Enter first name"/><br><br>
    <span id="firstName.errors">size must be between 2 and 30</span><br><br>
    <input type="text" name="lastName" placeholder="Enter last name"/><br><br>
    <input type="text" name="username" placeholder="Enter username"/><br><br>
    <input type="password" name="password" placeholder="Enter password"/><br><br>
    <input type="email" name="email" placeholder="Enter Email"/><br><br>
    <input type="submit" name="submit" value="Sign Up"/><br><br>
    <label>Profile Picture</label>:
    <%--<input type="file"--%>
           <%--name="profilePicture"--%>
           <%--accept="image/jpeg,image/png,image/gif"/><br><br>--%>


</form>

</body>
</html>
