package com.realdolmen.servlet_course;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by TDKBG57 on 9/10/2017.
 */
@WebServlet(urlPatterns = "/demo")
public class MyPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<title> my Demo </title>");
        out.println("<<meta charset = 'UTF-8'/>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table>");
        for (int i = 0; i < 100; i++) {
            out.println("<tr>");
            out.println("<td>" + req.getParameter("name") + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
