<%-- 
    Document   : index
    Created on : 13-ago-2014, 19:22:02
    Author     : ESTACION
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
--%>
<H2>
    <%="Hola como vamos!"%>
</H2>

<form action='Servlet1'method='Post'>
    <span>Nombre:</span>
    <INPUT type="text" name="Nombre"/>
    <SPAN> Edad:</SPAN>
    <input type="Number" name="Edad"/>
    <input type="submit" name="Enviar" value ="Enviar"/>
</form>
