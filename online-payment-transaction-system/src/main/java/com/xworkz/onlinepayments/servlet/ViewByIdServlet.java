package com.xworkz.onlinepayments.servlet;

import com.xworkz.onlinepayments.entity.UserEntity;
import com.xworkz.onlinepayments.service.PaymentService;
import com.xworkz.onlinepayments.service.PaymentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/viewById")
public class ViewByIdServlet extends HttpServlet {
    PaymentService service=new PaymentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("invoking method in doGet");
//        UserEntity entity= service.validateAndFindById(Integer.parseInt(req.getParameter("id")));
        int id= Integer.parseInt(req.getParameter("id"));
//        System.out.println(entity.getEmailId());
//        System.out.println(entity.getPhoneNumber());

        UserEntity entity= service.validateAndFindById(Integer.parseInt(req.getParameter("id")));
        System.out.println("entity found:"+entity);
        req.setAttribute("entity", entity);
        req.getRequestDispatcher("viewById.jsp").forward(req, resp);

    }
}
