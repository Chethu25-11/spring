package com.xworkz.travel.servlet;

import com.xworkz.travel.entity.TravelEntity;
import com.xworkz.travel.service.TravelService;
import com.xworkz.travel.service.TravelServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    TravelService service =new TravelServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("invoking doGet method in servlet login");
        req.getRequestDispatcher("login.jsp").forward(req, resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking Login from servlet");

        String name = req.getParameter("name");
        Double km = Double.valueOf(req.getParameter("km"));

        List<TravelEntity> entity = service.validateAndFindNameAndKm(name, km);

        if (entity!=null) {
            req.setAttribute("tickets", entity);
            req.getRequestDispatcher("login-success.jsp").forward(req, resp);
        } else {
            req.setAttribute("error", "Invalid Name or Km");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
