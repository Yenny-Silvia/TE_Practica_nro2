
package com.yenny;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "procesa_1", urlPatterns = {"/procesa_1"})
public class procesa_1 extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellidos");
        String cursos = request.getParameter("seleccion");
        
        Insc_Curso curs = new Insc_Curso();
        
        curs.setNombre(nombre);
        curs.setApellido(apellido);
        curs.setCursos(cursos);
        
        request.setAttribute("curs1", curs);
        
        request.getRequestDispatcher("salida_1.jsp").forward(request, response);
    }
}
