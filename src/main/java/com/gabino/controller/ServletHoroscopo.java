
package com.gabino.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T107
 */
public class ServletHoroscopo extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String nombre = request.getParameter("nombre");
            String signo = request.getParameter("signo");
        out.println("Bienvenido " +nombre+ " escogiste " + signo + "tu horoscopo del dia de hoy es " );
        
    }

    
}
