<%--
  Created by IntelliJ IDEA.
  User: Andrew
  Date: 12.05.2017
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="/js/index.js"></script>
  </head>
  <body>

  <form action="Calculator" method="get">
    Number 1: <input type="text" name="number1"> <br>
    Number 2: <input type="text" name="number2"> <br>
    Result: <input type="text" name="number2" value="${result}"> <br>
    <br>
    <input type="submit" name="calculate" value="Calculate" >
    <input type="button" onclick="myJSFunction()" value="CalculateJS" >
  </form>

  </body>
</html>
