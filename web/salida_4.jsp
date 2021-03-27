<%@page import="com.yenny.Reg_Libros"%>
<%
    Reg_Libros e = new Reg_Libros();
    
    e = (Reg_Libros)request.getAttribute("lib1");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del Libro</h1>
        <p>Los datos recibidos son: </p>
        <p>Título: <%= e.getTitulo() %></p>
        <p>Autor: <%= e.getAutor() %></p>
        <p>Resumen: <%= e.getResumen() %></p>
        <p>Medio: <%= e.getMedio() %></p>
        <br>
        <a href="index4.jsp">Volver</a>
    </body>
</html>
