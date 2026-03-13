package com.sw.el.age;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "age", value = "/age")
public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("GET");

        Model.calcAge(request);

        request.getRequestDispatcher("age/output.jsp").forward(request, response);

    }

    public void destroy() {
    }
}