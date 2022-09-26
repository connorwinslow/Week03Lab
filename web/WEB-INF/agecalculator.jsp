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
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <span id="errorMessage">${errorMessage}</span><br>
            <span id="ageCalc">${ageCalc}</span><br>
            <input type="submit" value="Age Next Birthday"><br>
        </form>
            <a href="arithmeticcalculator">Arithmetic Calculator</a>
    </body>
</html>
