package com.xworkz.network.servlet;

import com.xworkz.network.service.ComplaintService;
import com.xworkz.network.service.ComplaintServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/deleteById")
public class DeleteServlet extends HttpServlet {
    ComplaintService service = new ComplaintServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("invoking doGet method");
        System.out.println("id"+req.getParameter("id"));
        boolean deleteById=service.validateAndDeleteById(Integer.parseInt(req.getParameter("id")));
        System.out.println("invoking redirect method to readAll");
        resp.sendRedirect(req.getContextPath()+"/readAlluser");

    }
}
