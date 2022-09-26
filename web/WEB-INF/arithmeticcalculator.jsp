<%-- 
    Document   : arithmeticcalculator
    Created on : 25-Sep-2022, 3:46:32 PM
    Author     : Fast
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <form action="arithmeticcalculator" method="post">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>       
            <input type="submit" name="submit" value="+"><br>
            <input type="submit" name="submit" value="-"><br>
            <input type="submit" name="submit" value="*"><br>
            <input type="submit" name="submit" value="%"><br>
        </form>
            <span id="result">Result: ${result}</span><br> 
            <a href="agecalculator">Age Calculator</a>
    </body>
</html>
