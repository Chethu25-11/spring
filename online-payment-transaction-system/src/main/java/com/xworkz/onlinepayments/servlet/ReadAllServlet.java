package com.xworkz.onlinepayments.servlet;

import com.xworkz.onlinepayments.entity.UserEntity;
import com.xworkz.onlinepayments.service.PaymentService;
import com.xworkz.onlinepayments.service.PaymentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/readAllonlinePayment")
public class ReadAllServlet extends HttpServlet {
    // UserEntity userEntity = new UserEntity();
    PaymentService paymentService = new PaymentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doPost of Index.jsp");
       List<UserEntity> list= paymentService.validateAndFindAllUserEntity();
        System.out.println("list in servlet class "+list);
        req.setAttribute("list", list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("ReadAll.jsp");
        dispatcher.forward(req, resp);
    }
}
