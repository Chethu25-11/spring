package com.xworkz.banking.servlet;

import com.xworkz.banking.entity.BankEntity;
import com.xworkz.banking.repository.BankRepository;
import com.xworkz.banking.repository.BankRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/viewById")
public class ViewByIdServlet extends HttpServlet {
    BankRepository service=new BankRepositoryImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doGet in viewById");
        int id = Integer.parseInt(req.getParameter("id"));
       BankEntity entity= service.findById(Integer.parseInt(req.getParameter("id")));
        System.out.println("Entity found: "+entity);
        req.setAttribute("entity", entity);
        req.getRequestDispatcher("viewById.jsp").forward(req, resp);

    }
}
