package com.xworkz.finance.servlet;

import com.xworkz.finance.entity.FinanceEntity;
import com.xworkz.finance.service.FinanceService;
import com.xworkz.finance.service.FinanceServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/registration")
public class FinanceServlet extends HttpServlet {
    FinanceService service=new FinanceServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getParameter("id");
        String customerName = req.getParameter("customerName");
        String loanType = req.getParameter("loanType");
        double amount = Double.parseDouble(req.getParameter("amount"));
        FinanceEntity entity=new FinanceEntity();

        entity.setCustomerName(customerName);
        entity.setLoanType(loanType);
        entity.setAmount(amount);
     FinanceEntity save= service.validateSaveAndFinanceInfo(entity);
     req.setAttribute("id", save.getId());
     req.setAttribute("customerName",customerName);
     req.setAttribute("loanType",loanType);
     req.setAttribute("amount",amount);
     List<FinanceEntity> list= service.validateAndFindAllFinanceEntity();
        System.out.println("list in servlet class "+list);
        //req.setAttribute("list", list);
       // super.doPost(req, resp);
        RequestDispatcher dispatcher = req.getRequestDispatcher("show.jsp");
        dispatcher.forward(req, resp);
       // resp.getWriter().print("Registration Successful");
    }
}
