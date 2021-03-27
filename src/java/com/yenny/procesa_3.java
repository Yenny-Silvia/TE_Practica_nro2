
package com.yenny;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "procesa_3", urlPatterns = {"/procesa_3"})
public class procesa_3 extends HttpServlet {

      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String producto = request.getParameter("producto"); 
        String categoria[] = request.getParameterValues("categoria");
        int existencia = Integer.parseInt(request.getParameter("existencia"));
        float precio = Integer.parseInt(request.getParameter("precio"));
       
        Reg_Productos prod = new Reg_Productos();
        
        prod.setProducto(producto);
        prod.setExistencia(existencia);
        prod.setPrecio(precio);
        prod.setCategoria(categoria);
        
        request.setAttribute("prod1", prod);
        
        request.getRequestDispatcher("salida_3.jsp").forward(request, response);
    }
}
