package com.login.logintemplateapp;

// RestrictedServlet.java
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/restricted")
public class RestrictedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("user") != null) {
            User user = (User) session.getAttribute("user");
            if ("manager".equals(user.getRole())) {
                request.getRequestDispatcher("restricted.jsp").forward(request, response);
            } else {
                response.sendRedirect("welcome");
            }
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}
