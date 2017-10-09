package com.realdolmen.servlet_course;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;



@WebServlet(urlPatterns = "/hello.html")
public class MyCoolServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
//        can add possible checks for param here
//        if (name == null || name.trim().equals(""))

        PrintWriter out = resp.getWriter();
        out.println("Hello World "+ (5*8) + " -> " +new Date() +" "+ name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        //todo: input sanitation

        PrintWriter out = resp.getWriter();
        out.println("Hello "+ firstname+" "+lastname);  //as if we're doing some serious business here
    }
}
