<%@page import="com.yenny.Reg_Usuarios"%>
<%
    Reg_Usuarios e = new Reg_Usuarios();
    
    e = (Reg_Usuarios)request.getAttribute("user1");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del Usuario</h1>
        <p>Los datos recibidos son: </p>
        <p>Nombre: <%= e.getNombre() %></p>
        <p>Apellidos: <%= e.getApellidos() %></p>
        <p>Correo electrónico: <%= e.getCorreo() %></p>
        
       
        <a href="index2.jsp">Volver</a>
    </body>
</html>

