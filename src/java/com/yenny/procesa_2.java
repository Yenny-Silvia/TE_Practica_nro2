
package com.yenny;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "procesa_2", urlPatterns = {"/procesa_2"})
public class procesa_2 extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellidos");
        String correo = request.getParameter("mail");
        
        Reg_Usuarios user = new Reg_Usuarios();
        
        user.setNombre(nombre);
        user.setApellidos(apellido);
        user.setCorreo(correo);
        
        request.setAttribute("user1", user);
        
        request.getRequestDispatcher("salida_2.jsp").forward(request, response);
    }

}