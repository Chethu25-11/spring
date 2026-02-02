package com.xworkz.onlinepayments.servlet;

import com.xworkz.onlinepayments.entity.UserEntity;
import com.xworkz.onlinepayments.repository.PaymentRepository;
import com.xworkz.onlinepayments.repository.PaymentRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/updateById")
public class UpdateByIdServlet extends HttpServlet {
    PaymentRepository service=new PaymentRepositoryImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("invoking method in doGet");
        int id = Integer.parseInt(req.getParameter("id"));
        UserEntity entity = service.findById(id);
        req.setAttribute("entity", entity);
        req.getRequestDispatcher("updateById.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doPost method in updateById");
        int id = Integer.parseInt(req.getParameter("id"));
        String email=req.getParameter("emailId");
        String psw= req.getParameter("psw");
        String repeat= req.getParameter("rpsw");
        long pnum= Long.parseLong(req.getParameter("phoneNumber"));
        UserEntity entity = new UserEntity();
        entity.setId(id);
        entity.setEmailId(email);
        entity.setPassword(psw);
        entity.setPhoneNumber(pnum);
        req.setAttribute("email", email);
        req.setAttribute("password", psw);
        req.setAttribute("phoneNumber", pnum);
       UserEntity Update= service.updateById(entity);

        System.out.println("redirecting the readAllonlinePayment");
        resp.sendRedirect(req.getContextPath()+"/readAllonlinePayment");
    }
}
