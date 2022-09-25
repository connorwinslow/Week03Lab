<%-- 
    Document   : agecalculator
    Created on : 25-Sep-2022, 3:45:53 PM
    Author     : Fast
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form action="agecalculator" method="post">
            <input type="number" name="age" value="${age}"><br>
            <input type="submit" value="Age Next Birthday">
        </form>
    </body>
</html>
