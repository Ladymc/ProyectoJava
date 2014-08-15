/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ESTACION
 */
@WebServlet(urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        HttpSession Sesion=request.getSession(true);
        
        try {
            /* TODO output your page here. You may use following sample code. */
           // out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Servlet1</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Datos Personales " + request.getContextPath() + "</h1>");
//            out.println("Usuario:");
         String Nombre=request.getParameter("Nombre");
         
         
         
         out.println(Nombre);
         out.println("<br>");
         out.println("Edad");         
     
         
         
        String Edad=request.getParameter("Edad");
        
        
        
            if (Integer.parseInt(Edad) > 30) {
                
                 Sesion.setAttribute("key",Nombre+"123");
                 response.sendRedirect("index.jsp");
                out.print("Nombre es:"+ Nombre );
            }
            else {
               Sesion.setAttribute("Key",Nombre + "456");
               response.sendRedirect("index2.jsp");
               out.print("Edad es:"+ Edad );
            }
         
         out.println(Edad);
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
