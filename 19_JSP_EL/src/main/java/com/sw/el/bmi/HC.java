package com.sw.el.bmi;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bmi", value = "/bmi")
public class HC extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("GET");

        request.setCharacterEncoding("UTF-8");

        BmiModel.calc(request);

        request.getRequestDispatcher("bmi/result.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("POST");

        request.setCharacterEncoding("UTF-8");

        BmiModel.calc(request);

        request.getRequestDispatcher("bmi/result.jsp").forward(request, response);
    }

    public void destroy() {
    }
}