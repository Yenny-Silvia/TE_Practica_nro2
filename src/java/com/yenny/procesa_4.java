
package com.yenny;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "procesa_4", urlPatterns = {"/procesa_4"})
public class procesa_4 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String resumen = request.getParameter("resumen");
        String medios = request.getParameter("medio");
        
        Reg_Libros lib = new Reg_Libros();
        
        lib.setTitulo(titulo);
        lib.setAutor(autor);
        lib.setResumen(resumen);
        lib.setMedio(medios);
        
        request.setAttribute("lib1", lib);
        
        request.getRequestDispatcher("salida_4.jsp").forward(request, response);
    }
}