<%--
  Created by IntelliJ IDEA.
  User: vural
  Date: 16/10/2017
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is login page</title>
</head>
<body>


<h1>My Login Page Example</h1>

<form action="/j_spring_security_check" method="POST">
    <label for="username">Kullan&#305;c&#305; &#304;smi:</label> <input id="username"
                                                                        name="j_username" type="text" /> <label for="password">&#350;ifre:</label>
    <input id="password" name="j_password" type="password" /> <input
        type="submit" value="Login" />
</form>

</body>
</html>
