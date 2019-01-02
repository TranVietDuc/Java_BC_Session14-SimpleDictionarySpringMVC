<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 1/2/2019
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple-Dictionary</title>
  </head>
  <body>
  <form action="/translate" method="post">
    <h1>VietNamese Dictionary</h1>

    <label>English: </label>
    <input type="text" name="english" placeholder="Enter a word!">



    <input type="submit" value="Search">
  </form>
  </body>
</html>
