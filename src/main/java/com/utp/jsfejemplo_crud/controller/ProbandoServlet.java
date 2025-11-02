package com.utp.jsfejemplo_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/XDDD")
public class ProbandoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("✅ Servlet funcionando!");
        out.println("DepSSSSendencias OK - JSF/Jakarta funcionando");
        out.println("Java version: " + System.getProperty("java.version"));
        out.println("Server: " + request.getServletContext().getServerInfo());
    }
}
