package com.xworkz.banking.servlet;

import com.xworkz.banking.service.BankService;
import com.xworkz.banking.service.BankServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/deleteBankDeatils")
public class DeleteBankDeatils extends HttpServlet {
    BankService service=new BankServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("invoking doGet method");
        System.out.println("id" +req.getParameter("id"));
       // String idParam = req.getParameter("id");

//        if (idParam != null && !idParam.trim().isEmpty()) {
//            int id = Integer.parseInt(idParam);
//            // call delete service
//        } else {
//            System.out.println("Delete failed: ID is empty");
//            resp.sendRedirect("error.jsp");
//        }
        int id = Integer.parseInt((req.getParameter("id")));
      Boolean DeleteByCustomerId=  service.validateAndDeleteByCustomerId(Integer.parseInt(req.getParameter("id")));
        System.out.println("redirecting the read.jsp");
        resp.sendRedirect(req.getContextPath()+"/readAlluserInfo");
        //super.doGet(req, resp);
    }
}
